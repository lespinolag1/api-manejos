package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.Persona;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class PersonaDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarPersona(Persona entidad){
        this.em.persist(entidad);
    }

    public Object listaPersonas(){
        Query q=this.em.createQuery("select p from Persona p");
        return (List<Persona>) q.getResultList();
    }


}
