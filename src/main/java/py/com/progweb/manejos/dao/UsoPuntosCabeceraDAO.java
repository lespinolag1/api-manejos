package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.UsoPuntosCabecera;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class UsoPuntosCabeceraDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarUsoCabecera(UsoPuntosCabecera useHead){
        this.em.persist(useHead);
    }

    public Object listaUsoCabecera(){
        Query q=this.em.createQuery("select upc from UsoPuntosCabecera upc");
        return (List<UsoPuntosCabecera>) q.getResultList();
    }

}
