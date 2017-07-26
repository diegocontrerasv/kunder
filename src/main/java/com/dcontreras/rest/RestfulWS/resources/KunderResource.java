package com.dcontreras.rest.RestfulWS.resources;


import java.text.ParseException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dcontreras.rest.RestfulWS.VO.VOResp;
import com.dcontreras.rest.RestfulWS.VO.VOData;
import com.dcontreras.rest.RestfulWS.service.KunderService;

@Path("/KunderWS")
public class KunderResource {
	
	KunderService kunderService = new KunderService();
	
	
	@POST
	@Path("/word")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOResp wordWS(VOData data){
		return kunderService.checkWord(data.getData());
	}
	
	@GET
	@Path("/value={hora}")
	@Produces({MediaType.APPLICATION_JSON})
	public VOResp horaWS(@PathParam("hora") String hora) throws ParseException{
		return kunderService.checkDate(hora);
	}

}
