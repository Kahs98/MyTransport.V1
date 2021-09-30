package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicio")
public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServicio;

	@Column(name = "tipoServicio", nullable = false, length = 30)
	private String tipoServicio;
	


	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicio(int idServicio, String tipoServicio) {
		super();
		this.idServicio = idServicio;
		this.tipoServicio = tipoServicio;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idServicio;
		result = prime * result + ((tipoServicio == null) ? 0 : tipoServicio.hashCode());
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
		Servicio other = (Servicio) obj;
		if (idServicio != other.idServicio)
			return false;
		if (tipoServicio == null) {
			if (other.tipoServicio != null)
				return false;
		} else if (!tipoServicio.equals(other.tipoServicio))
			return false;
		return true;
	}
}
