package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.ILocalizacionDao;
import pe.edu.upc.entity.Localizacion;
import pe.edu.upc.service.ILocalizacionService;

public class LocalizacionServiceImpl implements ILocalizacionService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ILocalizacionDao dD;

	@Override
	public void insertar(Localizacion localizacion) {
		dD.insertar(localizacion);

	}

	@Override
	public List<Localizacion> listar() {
		return dD.listar();
	}

	@Override
	public void eliminar(int idLocalizacion) {
		dD.eliminar(idLocalizacion);

	}

	
	
}
