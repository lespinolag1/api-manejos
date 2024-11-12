package py.com.progweb.manejos.model;

import javax.persistence.*;

@Entity
@Table(name ="regla_asignacion_puntos")

public class ReglaPuntos {
    @Id
    @Column(name = "id_regla")
    @Basic(optional = false)
    @GeneratedValue(generator = "ruleSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ruleSec", sequenceName = "regla_asignacion_puntos_sec", allocationSize = 0)
    private Integer id_regla;


    @Column(name = "limite_inferior", length = 50)
    @Basic(optional = false)
    private Integer limite_inferior;


    @Column(name = "limite_superior", length = 50)
    @Basic(optional = false)
    private Integer limite_superior;


    @Column(name = "monto_punto", length = 50)
    @Basic(optional = false)
    private Integer monto_punto;


    public ReglaPuntos() {
    }

    public Integer getId_regla() {
        return id_regla;
    }

    public void setId_regla(Integer id_regla) {
        this.id_regla = id_regla;
    }

    public Integer getLimite_inferior() {
        return limite_inferior;
    }

    public void setLimite_inferior(Integer limite_inferior) {
        this.limite_inferior = limite_inferior;
    }

    public Integer getLimite_superior() {
        return limite_superior;
    }

    public void setLimite_superior(Integer limite_superior) {
        this.limite_superior = limite_superior;
    }

    public Integer getMonto_punto() {
        return monto_punto;
    }

    public void setMonto_punto(Integer monto_punto) {
        this.monto_punto = monto_punto;
    }
}
