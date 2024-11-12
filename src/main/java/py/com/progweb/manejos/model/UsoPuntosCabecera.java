package py.com.progweb.manejos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="uso_puntos_cabecera")

public class UsoPuntosCabecera {
    @Id
    @Column(name = "id_uso_cabecera")
    @Basic(optional = false)
    @GeneratedValue(generator = "useHeadSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "useHeadSec", sequenceName = "uso_cabecera_sec", allocationSize = 0)
    private Integer id_uso_cabecera;

    @Column(name = "id_cliente", length = 50)
    @Basic(optional = false)
    private Integer id_cliente;

    @Column(name = "puntaje_utilizado", length = 50)
    @Basic(optional = false)
    private Integer puntaje_utilizado;

    @Column(name = "fecha", length = 50)
    @Basic(optional = false)
    private Date fecha;

    @Column(name = "concepto_uso", length = 100)
    @Basic(optional = false)
    private String concepto_uso;

    public Integer getId_uso_cabecera() {
        return id_uso_cabecera;
    }

    public void setId_uso_cabecera(Integer id_uso_cabecera) {
        this.id_uso_cabecera = id_uso_cabecera;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getPuntaje_utilizado() {
        return puntaje_utilizado;
    }

    public void setPuntaje_utilizado(Integer puntaje_utilizado) {
        this.puntaje_utilizado = puntaje_utilizado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto_uso() {
        return concepto_uso;
    }

    public void setConcepto_uso(String concepto_uso) {
        this.concepto_uso = concepto_uso;
    }
}
