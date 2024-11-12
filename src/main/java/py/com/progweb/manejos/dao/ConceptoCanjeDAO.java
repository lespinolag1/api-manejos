package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.ConceptoCanje;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class ConceptoCanjeDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarConcepto(ConceptoCanje concept){
        this.em.persist(concept);
    }

    public Object listaConceptos(){
        Query q=this.em.createQuery("select c from ConceptoCanje c");
        return (List<ConceptoCanje>) q.getResultList();
    }


}
