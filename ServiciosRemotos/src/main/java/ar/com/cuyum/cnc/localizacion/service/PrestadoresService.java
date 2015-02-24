package ar.com.cuyum.cnc.localizacion.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ar.com.cuyum.cnc.localizacion.model.Prestador;

@Stateless
@Named(value = "prestadoresService")
public class PrestadoresService {
	public static int PRESTADOR_ACTIVO = 1; 
	public static int PRESTADOR_INACTIVO = 2;
	
	@Inject
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<Prestador> buscarPrestadores(String term){
		StringBuilder query = new StringBuilder();
		query.append("select p from Prestador p ");
		query.append("where p.estado = :estado ");
		if(term!=null){
			query.append("and lower(p.nombre) like'"+term+"%' ");
		}
		query.append("order by p.nombre");
		List<Prestador> lstPrestadores = em.createQuery(query.toString())
				.setParameter("estado", PRESTADOR_ACTIVO)
				.getResultList();
		
		return lstPrestadores;
	}
	
	@SuppressWarnings("unchecked")
	public List<Prestador> buscarPrestadores(String term, int limit, int page){
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select p from Prestador p ");
		query.append("where p.estado = :estado ");
		if(term!=null){
			query.append("and lower(p.nombre) like'"+term.toLowerCase()+"%'");
		}
		query.append("order by p.nombre");
		
		List<Prestador> lstPrestadores = em.createQuery(query.toString())
				.setParameter("estado", PRESTADOR_ACTIVO)
				.setMaxResults(limit)
				.setFirstResult(first)
				.getResultList();
		
		return lstPrestadores;
	}
	
	public Long contarPrestadores(String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Prestador p ");
		query.append("where p.estado = :estado ");
		if(term!=null){
			query.append("and lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("estado", PRESTADOR_ACTIVO)
				.getSingleResult();
	}
}