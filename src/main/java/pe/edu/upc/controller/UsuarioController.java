package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IUsuarioService mService;
	private Usuario usuario;
	List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listar();
	}

	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}

	public void insertar() {
		mService.insertar(usuario);
		limpiarUsuario();
	}

	public void listar() {
		listaUsuarios = mService.listar();
	}

	public void limpiarUsuario() {
		this.init();
	}

	public void eliminar(Usuario usuario) {
		mService.eliminar(usuario.getIdUsuario());
		this.listar();
	}
	
	public void findByDNIUsuario() {
		if (usuario.getDniUsuario().isEmpty()){
			this.listar();
		}
		else {
			listaUsuarios = this.mService.findByDNIUsuario(this.getUsuario());
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public UsuarioController() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	

	
}
