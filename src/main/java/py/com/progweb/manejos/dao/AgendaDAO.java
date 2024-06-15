package py.com.progweb.manejos.dao;

import py.com.progweb.manejos.model.Agenda;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless


public class AgendaDAO {
    @PersistenceContext(unitName = "pruebaPU")

    private EntityManager em;

    /**
     * Esta anotacion nos va a servir para determinar que cada m[etodo
     * que llame a este metodo hijo, sera transaccional.
     * Hay varias opciones, para el tipo de Atributo
     */

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar (Agenda entidad){
        this.em.persist(entidad);

    }

    /*public Object lista(){
        Query q=this.em.createQuery("select p from Persona p");
        return (List<Persona>) q.getResultList();
    }
*/


}
