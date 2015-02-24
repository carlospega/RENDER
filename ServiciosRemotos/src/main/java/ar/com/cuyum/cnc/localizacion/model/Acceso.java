package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accesos")
public class Acceso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idAcceso")
	private String id;
		
	@Column(name="acceso")
	private String nombre;
	
	public Acceso(){
		
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
}
