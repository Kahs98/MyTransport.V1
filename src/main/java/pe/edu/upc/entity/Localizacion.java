package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Localizacion")
public class Localizacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLocalizacion;
	
	@ManyToOne
	@JoinColumn(name="idVehiculo", nullable=false)
	private Vehiculo vehiculo;
	
	@Column(name = "lugarLocalizacion", nullable = false, length = 2)
	private String lugarLocalizacion;
	
	public Localizacion() {
		super();
	}

	public Localizacion(int idLocalizacion, Vehiculo vehiculo, String lugarLocalizacion) {
		super();
		this.idLocalizacion = idLocalizacion;
		this.vehiculo = vehiculo;
		this.lugarLocalizacion = lugarLocalizacion;
	}

	public int getIdLocalizacion() {
		return idLocalizacion;
	}

	public void setIdLocalizacion(int idLocalizacion) {
		this.idLocalizacion = idLocalizacion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getLugarLocalizacion() {
		return lugarLocalizacion;
	}

	public void setLugarLocalizacion(String lugarLocalizacion) {
		this.lugarLocalizacion = lugarLocalizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idLocalizacion;
		result = prime * result + ((lugarLocalizacion == null) ? 0 : lugarLocalizacion.hashCode());
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
		Localizacion other = (Localizacion) obj;
		if (idLocalizacion != other.idLocalizacion)
			return false;
		if (lugarLocalizacion == null) {
			if (other.lugarLocalizacion != null)
				return false;
		} else if (!lugarLocalizacion.equals(other.lugarLocalizacion))
			return false;
		return true;
	}

	
	
}
