package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Localizacion;
import pe.edu.upc.service.ILocalizacionService;

@Named
@RequestScoped
public class LocalizacionController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ILocalizacionService dService;
	private Localizacion localizacion ;
	List<Localizacion> listalocalizaciones;

	@PostConstruct
	public void init() {
		this.listalocalizaciones = new ArrayList<Localizacion>();
		this.localizacion = new Localizacion();
		this.listar();
	}

	public String nuevolocalizacion() {
		this.setlocalizacion(new Localizacion());
		return "localizacion.xhtml";
	}

	public void insertar() {
		dService.insertar(localizacion);
		limpiarlocalizacion();
	}

	public void listar() {
		listalocalizaciones = dService.listar();
	}

	public void limpiarlocalizacion() {
		this.init();
	}

	public void eliminar(Localizacion localizacion) {
		dService.eliminar(localizacion.getIdLocalizacion());
		this.listar();
	}

	public ILocalizacionService getdService() {
		return dService;
	}

	public void setdService(ILocalizacionService dService) {
		this.dService = dService;
	}

	public Localizacion getlocalizacion() {
		return localizacion;
	}

	public void setlocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public List<Localizacion> getListalocalizaciones() {
		return listalocalizaciones;
	}

	public void setListalocalizaciones(List<Localizacion> listalocalizaciones) {
		this.listalocalizaciones = listalocalizaciones;
	}
	


}
