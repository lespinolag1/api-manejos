package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.BolsaPuntosDAO;
import py.com.progweb.manejos.model.BolsaPuntos;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("bolsa-puntos")
@Consumes("application/json")
@Produces("application/json")

public class BolsaPuntosREST {

    @Inject
    private BolsaPuntosDAO bolsaPuntosDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(bolsaPuntosDAO.listaBolsas()).build();
    }

    @POST
    @Path("/")
    public Response crear(BolsaPuntos bag){
        this.bolsaPuntosDAO.agregarBolsa(bag);
    return Response.ok().build();

    }
}
