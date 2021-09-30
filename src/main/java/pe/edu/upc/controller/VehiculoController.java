package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Vehiculo;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoController implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private IUsuarioService tService;
    
    @Inject
    private IVehiculoService tpService;
                
    private Usuario usuario;
    private Vehiculo vehiculo;
    
    List<Usuario> listaUsuarios;
    List<Vehiculo> listaVehiculos;
    
    @PostConstruct
    public void init() {
        usuario = new Usuario();
        vehiculo = new Vehiculo();
        
        listaUsuarios = new ArrayList<Usuario>();
        listaVehiculos = new ArrayList<Vehiculo>(); 
        
        this.listVehiculo();        
        this.listUsuario();
    }
    
    public String nuevoVehiculo() {
        this.setVehiculo(new Vehiculo());
        return "vehiculo.xhtml";
    }
    
    public void insertar() {
        try {
            tpService.insertar(vehiculo);
            limpiarVehiculo();
            this.listVehiculo();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listVehiculo() {
        try {
            listaVehiculos= tpService.listar();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listUsuario() {
        try {
            listaUsuarios = tService.listar();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }        
    }

        
    public void limpiarVehiculo() {
        this.init();
    }
    
    public void eliminar(Vehiculo Vehiculo) {
        try {
            tpService.eliminar(Vehiculo.getIdVehiculo());
            this.listVehiculo();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}





    
    
}
