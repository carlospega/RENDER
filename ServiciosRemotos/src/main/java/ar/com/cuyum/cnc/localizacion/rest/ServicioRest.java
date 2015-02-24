/**
 * 
 */
package ar.com.cuyum.cnc.localizacion.rest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import ar.com.cuyum.cnc.localizacion.model.Servicio;
import ar.com.cuyum.cnc.localizacion.service.AccesosService;
import ar.com.cuyum.cnc.localizacion.vo.ListObject;

/**
 * @author Jorge Morando
 *
 */
@Path("/servicios")
@RequestScoped
public class ServicioRest {

	private Logger log = Logger.getLogger(ServicioRest.class);

	@Inject
	AccesosService accesosService;
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+ ";charset=UTF-8")	
	public RestResponse index(@QueryParam("term") String term, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page) {
		/*devolver un json valido como string*/
		RestResponse response = new RestResponse();
		List<Servicio> listaSrv = new ArrayList<Servicio>();
		List<ListObject> results = new ArrayList<ListObject>();
		
		try {
			if(limit==null){
				listaSrv = accesosService.buscarServicios(term,999999,1);		
			}else{
				page=page==null?1:page;
				listaSrv = accesosService.buscarServicios(term,limit,page);	
				response.setTotal(accesosService.contarServicios(term));
			}
			if(listaSrv!=null && listaSrv.size()>0){
				for (Servicio srv : listaSrv) {
					results.add(new ListObject(srv.getId().toString(),srv.getNombre()));
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
