package py.com.progweb.manejos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="bolsa_puntos")

public class BolsaPuntos {
    @Id
    @Column(name = "id_bolsa")
    @Basic(optional = false)
    @GeneratedValue(generator = "bagSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "bagSec", sequenceName = "bolsa_puntos_sec", allocationSize = 0)
    private Integer id_bolsa;


    @Column(name = "id_cliente", length = 50)
    @Basic(optional = false)
    private Integer id_cliente;


    @Column(name = "fecha_caducidad", length = 50)
    @Basic(optional = false)
    private Date fecha_caducidad;


    @Column(name = "puntaje_asignado", length = 50)
    @Basic(optional = false)
    private Integer puntaje_asignado;


    @Column(name = "puntaje_utilizado", length = 50)
    @Basic(optional = false)
    private Integer puntaje_utilizado;


    @Column(name = "saldo_puntos", length = 50)
    @Basic(optional = false)
    private Integer saldo_puntos;


    @Column(name = "monto_operacion", length = 50)
    @Basic(optional = false)
    private Integer monto_operacion;


    public BolsaPuntos() {
    }

    public Integer getId_bolsa() {
        return id_bolsa;
    }

    public void setId_bolsa(Integer id_bolsa) {
        this.id_bolsa = id_bolsa;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Integer getPuntaje_asignado() {
        return puntaje_asignado;
    }

    public void setPuntaje_asignado(Integer puntaje_asignado) {
        this.puntaje_asignado = puntaje_asignado;
    }

    public Integer getPuntaje_utilizado() {
        return puntaje_utilizado;
    }

    public void setPuntaje_utilizado(Integer puntaje_utilizado) {
        this.puntaje_utilizado = puntaje_utilizado;
    }

    public Integer getSaldo_puntos() {
        return saldo_puntos;
    }

    public void setSaldo_puntos(Integer saldo_puntos) {
        this.saldo_puntos = saldo_puntos;
    }

    public Integer getMonto_operacion() {
        return monto_operacion;
    }

    public void setMonto_operacion(Integer monto_operacion) {
        this.monto_operacion = monto_operacion;
    }
}
