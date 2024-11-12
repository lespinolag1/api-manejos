package py.com.progweb.manejos.rest;

import py.com.progweb.manejos.dao.PersonaDAO;
import py.com.progweb.manejos.model.Persona;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("persona")
@Consumes("application/json")
@Produces("application/json")

public class PersonaREST {

    @Inject
    private PersonaDAO personaDAO;

    @GET
    @Path("/")
    public Response listar(){
        return Response.ok(personaDAO.listaPersonas()).build();
    }

    @POST
    @Path("/")
    public Response crear(Persona p){
        this.personaDAO.agregarPersona(p);
    return Response.ok().build();

    }
}
