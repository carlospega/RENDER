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

import ar.com.cuyum.cnc.localizacion.model.Periodo;
import ar.com.cuyum.cnc.localizacion.service.PeriodicidadService;
import ar.com.cuyum.cnc.localizacion.vo.ListObject;

/**
 * @author Jorge Morando
 *
 */
@Path("/periodicidad")
@RequestScoped
public class PeriodicidadRest {

	private Logger log = Logger.getLogger(PeriodicidadRest.class);

	@Inject
	PeriodicidadService periodicidadService;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+ ";charset=UTF-8")
	public RestResponse index(@FormParam("fkey") String periodicidad,
			@QueryParam("term") String term, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page) {
		/*devolver un json valido como string*/
		RestResponse response = new RestResponse();
		List<Periodo> listaPart = new ArrayList<Periodo>();
		List<ListObject> results = new ArrayList<ListObject>();
		
		try {
			if(periodicidad==null || periodicidad.isEmpty()){
				response.setSuccess(false);
				response.setMsg("periodicidad invalid");
				response.setResult(results);
				return response;
			}
			if(limit==null){
				listaPart = periodicidadService.buscarPeriodos(periodicidad,term);	
				response.setTotal(listaPart.size());
			}else{
				page=page==null?1:page;
				listaPart = periodicidadService.buscarPeriodos(periodicidad,term,limit,page);	
				response.setTotal(periodicidadService.contarPeriodos(periodicidad,term));
			}
			if(listaPart!=null && listaPart.size()>0){
				for (Periodo periodo : listaPart) {
					results.add(new ListObject(periodo.getId().toString(),periodo.getNombre()));
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
