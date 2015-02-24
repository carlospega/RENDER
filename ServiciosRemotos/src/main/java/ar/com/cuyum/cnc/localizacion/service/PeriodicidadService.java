package ar.com.cuyum.cnc.localizacion.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ar.com.cuyum.cnc.localizacion.model.Periodo;

@Stateless
@Named(value = "periodicidadService")
public class PeriodicidadService {
	
	@Inject
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<Periodo> buscarPeriodos(String periodicidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("from Periodo p ");
		query.append("where p.tipo = :tipo ");
		if(term!=null){
			query.append("and lower(p.nombre) like'"+term+"%' ");
		}
//		query.append("order by p.nombre");
		List<Periodo> lstPeriodos = em.createQuery(query.toString())
				.setParameter("tipo", periodicidad)
				.getResultList();
		
		return lstPeriodos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Periodo> buscarPeriodos(String periodicidad,String term, int limit, int page){
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select p from Periodo p ");
		query.append("where p.tipo = :tipo ");
		if(term!=null){
			query.append("and lower(p.nombre) like'"+term.toLowerCase()+"%'");
		}
//		query.append("order by p.nombre");
		
		List<Periodo> lstPeriodos = em.createQuery(query.toString())
				.setParameter("tipo", periodicidad)
				.setMaxResults(limit)
				.setFirstResult(first)
				.getResultList();
		
		return lstPeriodos;
	}
	
	public Long contarPeriodos(String periodicidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Periodo p ");
		query.append("where p.tipo = :tipo ");
		if(term!=null){
			query.append("and lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("tipo", periodicidad)
				.getSingleResult();
	}
}