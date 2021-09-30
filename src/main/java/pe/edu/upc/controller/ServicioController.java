package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped
public class ServicioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IServicioService gService;
	private Servicio Servicio;
	List<Servicio> listaServicios;

	@PostConstruct
	public void init() {
		this.listaServicios = new ArrayList<Servicio>();
		this.Servicio = new Servicio();
		this.listar();
	}

	public String nuevoServicio() {
		this.setServicio(new Servicio());
		return "Servicio.xhtml";
	}


	public void insertar() {
		gService.insertar(Servicio);
		limpiarServicio();
	}

	public void listar() {
		listaServicios = gService.listar();
	}

	public void limpiarServicio() {
		this.init();
	}

	public void eliminar(Servicio Servicio) {
		gService.eliminar(Servicio.getIdServicio());
		this.listar();
	}
	
	public void findByTipoServicio() {
		if (Servicio.getTipoServicio().isEmpty()){
			this.listar();
		}
		else {
			listaServicios = this.gService.findByTipoServicio(this.getServicio());
		}
	}
	
	public Servicio getServicio() {
		return Servicio;
	}

	public void setServicio(Servicio Servicio) {
		this.Servicio = Servicio;
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}

}
