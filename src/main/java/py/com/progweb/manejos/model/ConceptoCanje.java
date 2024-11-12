package py.com.progweb.manejos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="concepto_canje")

public class ConceptoCanje {
    @Id
    @Column(name = "id_concepto")
    @Basic(optional = false)
    @GeneratedValue(generator = "conceptoSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "conceptoSec", sequenceName = "concepto_canje_sec", allocationSize = 0)
    private Integer id_concepto;


    @Column(name = "concepto_descripcion", length = 50)
    @Basic(optional = false)
    private String concepto_descripcion;


    @Column(name = "puntos_requeridos", length = 50)
    @Basic(optional = false)
    private Integer puntos_requeridos;


    public ConceptoCanje() {
    }

    public Integer getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(Integer id_concepto) {
        this.id_concepto = id_concepto;
    }

    public String getConcepto_descripcion() {
        return concepto_descripcion;
    }

    public void setConcepto_descripcion(String concepto_descripcion) {
        this.concepto_descripcion = concepto_descripcion;
    }

    public Integer getPuntos_requeridos() {
        return puntos_requeridos;
    }

    public void setPuntos_requeridos(Integer puntos_requeridos) {
        this.puntos_requeridos = puntos_requeridos;
    }
}
