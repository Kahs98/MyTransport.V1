package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Localizacion;

public interface ILocalizacionDao {
	public void insertar(Localizacion localizacion);
	
	public List<Localizacion> listar();

	public void eliminar(int idLocalizacion);
	
}