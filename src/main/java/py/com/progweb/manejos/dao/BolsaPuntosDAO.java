package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.BolsaPuntos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless


public class BolsaPuntosDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarBolsa(BolsaPuntos bag){

        this.em.persist(bag);
    }

    public Object listaBolsas(){
        Query q=this.em.createQuery("select b from BolsaPuntos b");
        return (List<BolsaPuntos>) q.getResultList();
    }


}
