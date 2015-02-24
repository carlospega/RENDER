package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(value=PartidoPK.class)
@Table(name="partidos") //@Table(name="p_dpto_partido_id")
public class Partido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_partido") //@Column(name="id_dpto_partido")
	private Long id;
	
	@Id
	@Column(name="id_prov")
	private Long idProvincia;
	
	@Column(name="descr") //@Column(name="descripcion")
	private String nombre;
	
	
	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
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
}

class PartidoPK  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idProvincia;
	
	public PartidoPK(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
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
        PartidoPK par = (PartidoPK) obj;
        return par.id == id && par.idProvincia.equals(id);
    }
}
