package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ILocalizacionDao;
import pe.edu.upc.entity.Localizacion;

public class DeclaracionDaoImpl implements ILocalizacionDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Localizacion declaracion) {
		em.persist(declaracion);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Localizacion> listar() {
		List<Localizacion> lista = new ArrayList<Localizacion>();
		Query q = em.createQuery("select d from Declaracion d");
		lista = (List<Localizacion>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDeclaracion) {
		Localizacion declaracion = new Localizacion();
		declaracion = em.getReference(Localizacion.class, idDeclaracion);
		em.remove(declaracion);

	}
	

}
