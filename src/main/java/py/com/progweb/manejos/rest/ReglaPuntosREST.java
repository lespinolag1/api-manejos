package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.ReglaPuntosDAO;
import py.com.progweb.manejos.model.ReglaPuntos;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("regla-puntos")
@Consumes("application/json")
@Produces("application/json")

public class ReglaPuntosREST {

    @Inject
    private ReglaPuntosDAO reglaPuntosDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(reglaPuntosDAO.listaReglas()).build();
    }

    @POST
    @Path("/")
    public Response crear(ReglaPuntos r){
        this.reglaPuntosDAO.agregarRegla(r);
    return Response.ok().build();

    }
}
