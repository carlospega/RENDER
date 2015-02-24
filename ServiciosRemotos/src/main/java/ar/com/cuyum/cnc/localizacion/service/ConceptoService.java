package ar.com.cuyum.cnc.localizacion.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ar.com.cuyum.cnc.localizacion.model.Acceso;
import ar.com.cuyum.cnc.localizacion.model.Concepto;
import ar.com.cuyum.cnc.localizacion.model.Nap;
import ar.com.cuyum.cnc.localizacion.model.Prestador;
import ar.com.cuyum.cnc.localizacion.model.Provincia;
import ar.com.cuyum.cnc.localizacion.model.Servicio;

@Stateless
@Named(value = "conceptoService")
public class ConceptoService {
	
	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Concepto> buscarConceptos(String tipo){
		
		StringBuilder query = new StringBuilder();
		query.append("select n from Concepto n ");
		if(tipo!=null){
			query.append("where lower(n.tipo) like '"+tipo.toLowerCase()+"'");
		}
		query.append("order by n.valor");
		
		List<Concepto> lstConceptos = em
				.createQuery(query.toString())
				.getResultList();
		
		for(Concepto concepto: lstConceptos){
			System.out.println(concepto.getId());
			System.out.println(concepto.getIdpadre());	
		}

		return lstConceptos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Concepto> buscarConceptos(String tipo, int limit, int page){
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select n from Concepto n ");
		if(tipo!=null){
			query.append("where lower(n.tipo) like '"+tipo.toLowerCase()+"'");
		}
		query.append("order by n.valor");
		
		List<Concepto> lstConceptos = em.createQuery(query.toString())
				.setMaxResults(limit)
				.setFirstResult(first)
				.getResultList();
		
		return lstConceptos;
	}
	
	public Long contarConceptos(String tipo){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Concepto n ");
		if(tipo!=null){
			query.append("where lower(n.tipo) like '"+tipo.toLowerCase()+"'");
		}
		
		return (Long)em.createQuery(query.toString())
				.getSingleResult();
	}
}