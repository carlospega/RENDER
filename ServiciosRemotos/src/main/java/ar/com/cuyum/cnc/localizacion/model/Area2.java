package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(value=Area2PK.class)
@Table(name="areas2") //@Table(name="maestro_areas_locales")
public class Area2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_area_local")
	private Long id;
	
	@Column(name="id_localidad")
	private Long idLocalidad;
		
	@Column(name="descr")
	private String nombre;
	
	public Area2(){
		
	}
	
	public Area2(Long idParam, String nombreParam){
		id=idParam;
		nombre=nombreParam;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	
}

class Area2PK  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idLocalidad;
	
	public Area2PK(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	/** Se implementa el metodo hashCode() de esta forma */
    public int hashCode() {
        return (int) id.hashCode();
    }

    /** Se implementa el metodo equals() de esta forma */
    public boolean equals (Object obj){
        if (obj == this) return true;
        if (!(obj instanceof Partido)) return false;
        if (obj == null) return false;
        Area2PK par = (Area2PK) obj;
        return par.id == id && par.idLocalidad.equals(id);
    }
}
