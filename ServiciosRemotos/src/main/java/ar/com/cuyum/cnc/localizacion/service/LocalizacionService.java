package ar.com.cuyum.cnc.localizacion.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ar.com.cuyum.cnc.localizacion.model.Area;
import ar.com.cuyum.cnc.localizacion.model.Area2;
import ar.com.cuyum.cnc.localizacion.model.Localidad;
import ar.com.cuyum.cnc.localizacion.model.Partido;
import ar.com.cuyum.cnc.localizacion.model.Provincia;

@Stateless
@Named(value = "localizacionService")
public class LocalizacionService {
	public static int PRESTADOR_ACTIVO = 1; 
	public static int PRESTADOR_INACTIVO = 2;
	
	@Inject
	private EntityManager em;
	
	/*======= PROVINCIAS =======*/
	
	@SuppressWarnings("unchecked")
	public List<Provincia> buscarProvincias(String term){
		
		StringBuilder query = new StringBuilder();
		query.append("select p from Provincia p ");
		if(term!=null){
			query.append("where lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by p.nombre");
		
		List<Provincia> prov = em
				.createQuery(query.toString())
				.getResultList();
		
		return prov;
	}
	
	@SuppressWarnings("unchecked")
	public List<Provincia> buscarProvincias(String term, int limit, int page){
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select p from Provincia p ");
		if(term!=null){
			query.append("where lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by p.nombre");
		
		List<Provincia> prov = em.createQuery(query.toString())
				.setMaxResults(limit)
				.setFirstResult(first)
				.getResultList();
		
		return prov;
	}
	
	public Long contarProvincias(String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Provincia p ");
		if(term!=null){
			query.append("where lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.getSingleResult();
	}
	
	/*======= PARTIDOS =======*/
	
	@SuppressWarnings("unchecked")
	public List<Partido> buscarPartidos(Long idProvincia,String term){
		StringBuilder query = new StringBuilder();
		
		query.append("select p from Partido p where 1=1 ");
		if(idProvincia!=-1){
			query.append("and p.idProvincia=:provincia ");
		}
		
		if(term!=null){
			query.append("and lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		List<Partido> lstPartidos;
		
		if(idProvincia!=-1){
			query.append("order by p.nombre");
			lstPartidos = em.createQuery(query.toString())
					.setParameter("provincia", idProvincia)
					.getResultList();
		}
		else {
			query.append("order by p.idProvincia");
			lstPartidos = em.createQuery(query.toString()).getResultList();
		}
		
		return lstPartidos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Partido> buscarPartidos(Long idProvincia, String term, int limit, int page){
		
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select p from Partido p ");
		query.append("where p.idProvincia=:provincia ");
		if(term!=null){
			query.append("and lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by p.nombre");
		
		List<Partido> lstPartidos = em.createQuery(query.toString())
				.setParameter("provincia", idProvincia)
				.setFirstResult(first)
				.setMaxResults(limit)
				.getResultList();
		
		return lstPartidos;
	}
	
	public Long contarPartidos(Long idProvincia, String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Partido p ");
		query.append("where p.idProvincia=:provincia ");
		if(term!=null){
			query.append("and lower(p.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("provincia", idProvincia)
				.getSingleResult();
	}
	
	
	/*======= LOCALIDADES =======*/
	
	@SuppressWarnings("unchecked")
	public List<Localidad> buscarLocalidades(Long idPartido, String term){		
		StringBuilder query = new StringBuilder();
		query.append("select l from Localidad l where 1=1 ");
		
		if(idPartido!=-1){
			query.append("and l.idPartido= :partido ");
		}
		if(term!=null){
			query.append("and lower(l.nombre) like '"+term.toLowerCase()+"%' ");
		}
		List<Localidad> lstLocalidades;
		
		if(idPartido!=-1){
			query.append("order by l.nombre");
			lstLocalidades = em.createQuery(query.toString())
					.setParameter("partido", idPartido)
					.getResultList();
		}
		else {
			query.append("order by l.idPartido");
			lstLocalidades = em.createQuery(query.toString()).getResultList();
		}
		
		
		return lstLocalidades;
	}

	@SuppressWarnings("unchecked")
	public List<Localidad> buscarLocalidades(Long idPartido, String term, int limit, int page){		

		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select l from Localidad l where 1=1 ");
		if(idPartido!=-1){
			query.append("and l.idPartido= :partido ");
		}
		if(term!=null){
			query.append("and lower(l.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by l.nombre");
		
		List<Localidad> lstLocalidades = em.createQuery(query.toString())
				.setParameter("partido", idPartido)
				.setFirstResult(first)
				.setMaxResults(limit)
				.getResultList();
		
		return lstLocalidades;
	}
	
	public Long contarLocalidades(Long idPartido, String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Localidad l ");
		query.append("where l.idPartido=:partido ");
		if(term!=null){
			query.append("and lower(l.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("partido", idPartido)
				.getSingleResult();
	}

	
	/*======= AREAS =======*/
	
	@SuppressWarnings("unchecked")
	public List<Area> buscarAreas(Long idLocalidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("select a from Area a where 1=1 ");
		if(idLocalidad!=-1){
			query.append("and a.idLocalidad= :localidad ");

		}
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		List<Area> lstArea;
		
		if(idLocalidad!=-1){
			query.append("order by a.idLocalidad");
			lstArea = em.createQuery(query.toString())
					.setParameter("localidad", idLocalidad)
					.getResultList();
		}
		else {
			query.append("order by a.nombre");
			lstArea = em.createQuery(query.toString()).getResultList();
		}
		
		return lstArea;
	}

	@SuppressWarnings("unchecked")
	public List<Area> buscarAreas(Long idLocalidad, String term, int limit, int page){
		
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select a from Area a ");
		query.append("where a.idLocalidad= :localidad ");
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by a.nombre");
		
		List<Area> prov = em.createQuery(query.toString())
				.setParameter("localidad", idLocalidad)
				.setFirstResult(first)
				.setMaxResults(limit)
				.getResultList();
		return prov;
	}
	
	public Long contarAreas(Long idLocalidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Area a ");
		query.append("where a.idLocalidad=:localidad ");
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("localidad", idLocalidad)
				.getSingleResult();
	}
	
	/*======= AREAS2 =======*/
	
	@SuppressWarnings("unchecked")
	public List<Area2> buscarAreas2(Long idLocalidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("select a from Area2 a where 1=1 ");
		if(idLocalidad!=-1){
			query.append("and a.idLocalidad= :localidad ");

		}
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		List<Area2> lstArea;
		
		if(idLocalidad!=-1){
			query.append("order by a.nombre");
			lstArea = em.createQuery(query.toString())
					.setParameter("localidad", idLocalidad)
					.getResultList();
		}
		else {
			query.append("order by a.idLocalidad");
			lstArea = em.createQuery(query.toString()).getResultList();
		}
		
		return lstArea;
	}

	@SuppressWarnings("unchecked")
	public List<Area2> buscarAreas2(Long idLocalidad, String term, int limit, int page){
		
		if(page<=0 || limit<1) return null;
		int first = (page-1)*limit;
		
		StringBuilder query = new StringBuilder();
		query.append("select a from Area2 a ");
		query.append("where a.idLocalidad= :localidad ");
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		query.append("order by a.nombre");
		
		List<Area2> prov = em.createQuery(query.toString())
				.setParameter("localidad", idLocalidad)
				.setFirstResult(first)
				.setMaxResults(limit)
				.getResultList();
		return prov;
	}
	
	public Long contarAreas2(Long idLocalidad, String term){
		StringBuilder query = new StringBuilder();
		query.append("select count(*) from Area2 a ");
		query.append("where a.idLocalidad=:localidad ");
		if(term!=null){
			query.append("and lower(a.nombre) like '"+term.toLowerCase()+"%' ");
		}
		
		return (Long)em.createQuery(query.toString())
				.setParameter("localidad", idLocalidad)
				.getSingleResult();
	}
	
}
