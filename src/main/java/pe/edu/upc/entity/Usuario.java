package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@Column(name = "nombreUsuario", nullable = false, length = 30)
	private String nombreUsuario;

	@Column(name = "apellidoUsuario", nullable = false, length = 30)
	private String apellidoUsuario;
	
	@Column(name = "celularUsuario", nullable = false, length = 9)
	private int celularUsuario;

	@Column(name = "direccionUsuario", nullable = false, length = 30)
	private String direccionUsuario;

	@Column(name = "dniUsuario", nullable = false, length = 8)
	private String dniUsuario;

	@Column(name = "emailUsuario", nullable = false, length = 30)
	private String emailUsuario;

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, int celularUsuario,
			String direccionUsuario, String dniUsuario, String emailUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.celularUsuario = celularUsuario;
		this.direccionUsuario = direccionUsuario;
		this.dniUsuario = dniUsuario;
		this.emailUsuario = emailUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public int getCelularUsuario() {
		return celularUsuario;
	}

	public void setCelularUsuario(int celularUsuario) {
		this.celularUsuario = celularUsuario;
	}

	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoUsuario == null) ? 0 : apellidoUsuario.hashCode());
		result = prime * result + celularUsuario;
		result = prime * result + ((direccionUsuario == null) ? 0 : direccionUsuario.hashCode());
		result = prime * result + ((dniUsuario == null) ? 0 : dniUsuario.hashCode());
		result = prime * result + ((emailUsuario == null) ? 0 : emailUsuario.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellidoUsuario == null) {
			if (other.apellidoUsuario != null)
				return false;
		} else if (!apellidoUsuario.equals(other.apellidoUsuario))
			return false;
		if (celularUsuario != other.celularUsuario)
			return false;
		if (direccionUsuario == null) {
			if (other.direccionUsuario != null)
				return false;
		} else if (!direccionUsuario.equals(other.direccionUsuario))
			return false;
		if (dniUsuario == null) {
			if (other.dniUsuario != null)
				return false;
		} else if (!dniUsuario.equals(other.dniUsuario))
			return false;
		if (emailUsuario == null) {
			if (other.emailUsuario != null)
				return false;
		} else if (!emailUsuario.equals(other.emailUsuario))
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}

	

}
