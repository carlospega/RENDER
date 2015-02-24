package ar.com.cuyum.cnc.localizacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="prestadores")
public class Prestador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_bp")
	private Long idProveedor;
		
	@Column(name="rs_ap_nom")
	private String nombre;
	
	@Column
	private Integer estado;
	
	@Column(name="tipo_idf")
	@Length(max=4)
	private String tipoIdentificacion;
	
	//Utilizamos el CUIT/CUIL como identificador fiscal
	@Column(name="idf")
	@Length(max=11)
	private String id;
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}	

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
}
