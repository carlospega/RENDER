package ar.com.cuyum.cnc.localizacion.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ar.com.cuyum.cnc.localizacion.model.Acceso;
import ar.com.cuyum.cnc.localizacion.model.Nap;
import ar.com.cuyum.cnc.localizacion.model.Prestador;
import ar.com.cuyum.cnc.localizacion.model.Provincia;
import ar.com.cuyum.cnc.localizacion.model.Servicio;

@Stateless
@Named(value = "napsService")
public class NapService {
	
	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Nap> buscarNaps(String term){
		
		StringBuilder query = new StringBuilder();
		query.append("select n from Nap n ");
		if(term!=null){
			query.append("where lower(n.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by n.nombre");
		
		List<Nap> lstNaps = em
				.createQuery(query.toString())
				.getResultList();
		
		return lstNaps;
	}
	
	@SuppressWarnings("unchecked")
	public List<Nap> buscarNaps(String term, int limit, int page){
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select n from Nap n ");
		if(term!=null){
			query.append("where lower(n.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by n.nombre");
		
		List<Nap> lstNaps = em.createQuery(query.toString())
				.setMaxResults(limit)
				.setFirstResult(first)
				.getResultList();
		
		return lstNaps;
	}
	
	public Long contarNaps(String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Nap n ");
		if(term!=null){
			query.append("where lower(n.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.getSingleResult();
	}
}