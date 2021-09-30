package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

public class ServicioServiceImpl implements IServicioService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IServicioDao gD;

	@Override
	public void insertar(Servicio servicio) {
		gD.insertar(servicio);
	}

	@Override
	public List<Servicio> listar() {
		return gD.listar();
	}

	@Override
	public void eliminar(int idServicio) {
		gD.eliminar(idServicio);
	}
	
	@Override
	public List<Servicio> findByTipoServicio(Servicio g) {
		return gD.findByTipoServicio(g);
	}	

}
