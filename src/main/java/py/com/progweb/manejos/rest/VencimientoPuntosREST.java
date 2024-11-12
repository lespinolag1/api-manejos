package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.VencimientoPuntosDAO;
import py.com.progweb.manejos.model.VencimientoPuntos;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("vencimiento-puntos")
@Consumes("application/json")
@Produces("application/json")

public class VencimientoPuntosREST {

    @Inject
    private VencimientoPuntosDAO vencimientoPuntosDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(vencimientoPuntosDAO.listaVencimientos()).build();
    }

    @POST
    @Path("/")
    public Response crear(VencimientoPuntos ex){
        this.vencimientoPuntosDAO.agregarVencimiento(ex);
    return Response.ok().build();

    }
}
