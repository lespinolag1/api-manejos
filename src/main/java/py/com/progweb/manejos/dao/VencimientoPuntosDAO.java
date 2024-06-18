package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.VencimientoPuntos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Stateless


public class VencimientoPuntosDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    public void agregarVencimiento(VencimientoPuntos expiration){

        expiration.setDias_validos((int) ChronoUnit.DAYS.between(expiration.getFecha_inicio().toLocalDate(),
                expiration.getFecha_fin().toLocalDate()));

        this.em.persist(expiration);
    }

    public Object listaVencimientos(){
        Query q=this.em.createQuery("select ex from VencimientoPuntos ex");
        return (List<VencimientoPuntos>) q.getResultList();
    }


}
