package py.com.progweb.manejos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="vencimiento_puntos")

public class VencimientoPuntos {
    @Id
    @Column(name = "id_vencimiento")
    @Basic(optional = false)
    @GeneratedValue(generator = "expirationSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "expirationSec", sequenceName = "vencimiento_puntos_sec", allocationSize = 0)
    private Integer id_vencimiento;


    @Column(name = "fecha_inicio", length = 50)
    @Basic(optional = false)
    private Date fecha_inicio;


    @Column(name = "fecha_fin", length = 50)
    @Basic(optional = false)
    private Date fecha_fin;


    @Column(name = "dias_validos", length = 50)
    @Basic(optional = false)
    private Integer dias_validos;


    public VencimientoPuntos() {
    }

    public Integer getId_vencimiento() {
        return id_vencimiento;
    }

    public void setId_vencimiento(Integer id_vencimiento) {
        this.id_vencimiento = id_vencimiento;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Integer getDias_validos() {
        return dias_validos;
    }

    public void setDias_validos(Integer dias_validos) {
        this.dias_validos = dias_validos;
    }
}
