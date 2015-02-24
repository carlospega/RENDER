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
import ar.com.cuyum.cnc.localizacion.service.AccesosService;
import ar.com.cuyum.cnc.localizacion.vo.ListObject;

/**
 * @author Jorge Morando
 *
 */
@Path("/accesos")
@RequestScoped
public class AccesoRest {

	private Logger log = Logger.getLogger(AccesoRest.class);


	@Inject
	AccesosService accesosService;

		
	@POST
	@Produces(MediaType.APPLICATION_JSON+ ";charset=UTF-8")	
	public RestResponse index(@FormParam("fkey") String fkey,
			@QueryParam("term") String term, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page) {
		RestResponse response = new RestResponse();
		List<Acceso> lstAccesos = new ArrayList<Acceso>();
		List<ListObject> results = new ArrayList<ListObject>();
		
		try {
			if(fkey==null || fkey.isEmpty()){
				response.setSuccess(false);
				response.setResult(results);
				response.setMsg("fkey invalid");
				return response;
			}
			
			lstAccesos = accesosService.buscarAccesosPorIdServicio(fkey, term);
			response.setSuccess(true);
			if (null != lstAccesos)
				response.setTotal(lstAccesos.size());
			else response.setTotal(0);
			if(lstAccesos!=null && lstAccesos.size()>0){
				for (Acceso acceso : lstAccesos) {
					results.add(new ListObject(acceso.getId().toString(),acceso.getNombre()));
				}
			}
		} catch (Exception e) {
			response.setSuccess(false);
			log.error(e.getMessage());
		}
		response.setResult(results);
		return response;
	}
	
}
