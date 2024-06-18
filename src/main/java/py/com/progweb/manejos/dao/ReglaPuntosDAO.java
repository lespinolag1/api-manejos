package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.ReglaPuntos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class ReglaPuntosDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarRegla(ReglaPuntos rule){
        this.em.persist(rule);
    }

    public Object listaReglas(){
        Query q=this.em.createQuery("select r from ReglaPuntos r");
        return (List<ReglaPuntos>) q.getResultList();
    }


}
