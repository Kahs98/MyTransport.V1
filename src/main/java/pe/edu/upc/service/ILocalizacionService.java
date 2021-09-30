package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Localizacion;

public interface ILocalizacionService {
	public void insertar(Localizacion localizacion);

	public List<Localizacion> listar();

	public void eliminar(int localizacion);
	

}
