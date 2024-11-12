package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.UsoPuntosCabeceraDAO;
import py.com.progweb.manejos.model.UsoPuntosCabecera;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("uso-puntos-cabecera")
@Consumes("application/json")
@Produces("application/json")

public class UsoPuntosCabeceraREST {
    @Inject
    private UsoPuntosCabeceraDAO usoPuntosCabeceraDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(usoPuntosCabeceraDAO.listaUsoCabecera()).build();
    }

    @POST
    @Path("/")
    public Response crear(UsoPuntosCabecera useHead){
        this.usoPuntosCabeceraDAO.agregarUsoCabecera(useHead);
        return Response.ok().build();

    }
}
