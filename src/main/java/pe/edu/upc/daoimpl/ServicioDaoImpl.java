package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;

public class ServicioDaoImpl implements IServicioDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Servicio servicio) {
		em.persist(servicio);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> listar() {
		List<Servicio> lista = new ArrayList<Servicio>();
		Query q = em.createQuery("select g from Servicio g");
		lista = (List<Servicio>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idServicio) {
		Servicio servicio = new Servicio();
		servicio = em.getReference(Servicio.class, idServicio);
		em.remove(servicio);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> findByTipoServicio(Servicio g) {
		List<Servicio> lista = new ArrayList<Servicio>();
		Query q = em.createQuery("from Servicio g where g.getTipoServicio like ?1");
		q.setParameter(1, "%" + g.getTipoServicio() + "%");
		lista = (List<Servicio>)q.getResultList();
		return lista;
	}

}
