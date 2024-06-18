package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.ConceptoCanjeDAO;
import py.com.progweb.manejos.model.ConceptoCanje;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("concepto-canje")
@Consumes("application/json")
@Produces("application/json")

public class ConceptoCanjeREST {

    @Inject
    private ConceptoCanjeDAO conceptoCanjeDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(conceptoCanjeDAO.listaConceptos()).build();
    }

    @POST
    @Path("/")
    public Response crear(ConceptoCanje c){
        this.conceptoCanjeDAO.agregarConcepto(c);
    return Response.ok().build();

    }
}
