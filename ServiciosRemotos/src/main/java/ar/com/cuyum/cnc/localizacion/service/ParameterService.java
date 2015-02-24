/**
 * 
 */
package ar.com.cuyum.cnc.localizacion.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import ar.com.cuyum.cnc.localizacion.model.Parametro;

/**
 * Clase creada manejo transaccional de los par&aacute;metros .<br />
 * 
 * @author Jorge Morando
 * 
 */
@Stateless
public class ParameterService {

	public transient Logger log = Logger.getLogger(ParameterService.class);

	@Inject
	EntityManager em;

	public String getParameterByName(String name) {
		Parametro parametro = null;
		Query query = em.createQuery("select p from Parametro p where p.nombre = :name").setParameter("name", name);
		
		try {
			parametro = (Parametro) query.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return parametro.getValor().toString();
	}

}
