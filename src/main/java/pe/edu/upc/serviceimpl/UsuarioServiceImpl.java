package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IUsuarioDao tD;

	@Override
	public void insertar(Usuario usuario) {
		tD.insertar(usuario);

	}

	@Override
	public List<Usuario> listar() {
		return tD.listar();
	}

	@Override
	public void eliminar(int idUsuario) {
		tD.eliminar(idUsuario);

	}
	
	public List<Usuario> findByDNIUsuario(Usuario t){
		return tD.findByDNIUsuario(t);
	}

}
