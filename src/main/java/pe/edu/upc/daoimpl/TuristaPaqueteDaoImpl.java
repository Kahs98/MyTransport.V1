package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IVehiculoDao;
import pe.edu.upc.entity.Vehiculo;

public class TuristaPaqueteDaoImpl implements IVehiculoDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Vehiculo turistaPaquete) {
		try {
			em.persist(turistaPaquete);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> listar() {
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		try {
			Query q = em.createQuery("select tp from TuristaPaquete tp"); 
			lista = (List<Vehiculo>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTuristaPaquete) {
		Vehiculo tp = new Vehiculo();
		try {
			tp = em.getReference(Vehiculo.class,idTuristaPaquete); 
			em.remove(tp);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
