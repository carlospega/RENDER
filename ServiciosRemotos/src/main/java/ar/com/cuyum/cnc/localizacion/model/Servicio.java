package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idServicio")
	private String id;
		
	@Column(name="servicio")
	private String nombre;
	
	@ManyToMany
	@JoinTable(name = "accesos_servicio", joinColumns = {@JoinColumn(name = "idServicio")}, inverseJoinColumns = {@JoinColumn(name = "idAcceso")})
    
	private List<Acceso> accesos;
	public Servicio(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Acceso> getAccesos() {
		return accesos;
	}

	public void setAccesos(List<Acceso> accesos) {
		this.accesos = accesos;
	}

}
