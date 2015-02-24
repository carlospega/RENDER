package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(value=LocalidadPK.class)
@Table(name="localidades") //@Table(name="localidades_poblacion")
public class Localidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_localidad")
	private Long id;
	
	@Id
	@Column(name="id_partido")
	private Long idPartido;
		
	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}

	@Column(name="descr")
	private String nombre;
	
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

	
}
class LocalidadPK  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idPartido;
	
	public LocalidadPK(){}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
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
        LocalidadPK par = (LocalidadPK) obj;
        return par.id == id && par.idPartido.equals(id);
    }
}
