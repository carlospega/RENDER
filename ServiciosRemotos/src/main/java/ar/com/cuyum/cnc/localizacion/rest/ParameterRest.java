/**
 * 
 */
package ar.com.cuyum.cnc.localizacion.rest;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;

import ar.com.cuyum.cnc.localizacion.service.ParameterService;


/**
 * @author Jorge Morando
 *
 */
@Path("/parameter")
@RequestScoped
public class ParameterRest {

	
	@Inject
	private ParameterService parameterService;
	
	
	private Logger log = Logger.getLogger(ParameterRest.class);

	
	@POST
	@Produces("application/json")
	public RestResponse retrieve(@QueryParam(value="name") String name) {
		RestResponse response = new RestResponse();
		
		if(name==null){
			String msg = "Es necesario proveer el nombre del par&aacute;metro para su recuperaci&oacute;n";
			response.setMsg(msg);
			response.setSuccess(false);
			return response;
		}
		
		try {
			response.setMsg(new Date().toString());
			response.setSuccess(true);
			response.setResult(parameterService.getParameterByName(name));
		} catch (Exception e) {
			response.setSuccess(false);
			response.setMsg("Error");
			log.error(e.getMessage());
		}		
		
		return response;
	}
	
}
