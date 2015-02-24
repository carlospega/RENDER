/**
 * 
 */
package ar.com.cuyum.cnc.localizacion.rest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import ar.com.cuyum.cnc.localizacion.model.Acceso;
import ar.com.cuyum.cnc.localizacion.model.Nap;
import ar.com.cuyum.cnc.localizacion.model.Prestador;
import ar.com.cuyum.cnc.localizacion.service.AccesosService;
import ar.com.cuyum.cnc.localizacion.service.NapService;
import ar.com.cuyum.cnc.localizacion.service.PrestadoresService;
import ar.com.cuyum.cnc.localizacion.vo.ListObject;

/**
 * @author Jorge Morando
 *
 */
@Path("/naps")
@RequestScoped
public class NapRest {

	private Logger log = Logger.getLogger(NapRest.class);


	@Inject
	NapService napService;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+ ";charset=UTF-8")
	public RestResponse naps(
			@QueryParam("term") String term, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page) {		
		RestResponse response = new RestResponse();
		List<Nap> lstNaps;
		List<ListObject> results = new ArrayList<ListObject>();
		try {
			if(limit==null){
				
				lstNaps = napService.buscarNaps(term);		
			}else{
				page=page==null?1:page;
				lstNaps = napService.buscarNaps(term,limit,page);	
				response.setTotal(napService.contarNaps(term));
			}
			if(lstNaps!=null && lstNaps.size()>0){
				for (Nap nap : lstNaps) {
					results.add(new ListObject(nap.getId(),nap.getNombre()));
				}
			}
			response.setSuccess(true);
		} catch (Exception e) {
			response.setSuccess(false);
			log.error(e.getMessage());
		}		
		response.setResult(results);
		return response;
	}	
	
}
