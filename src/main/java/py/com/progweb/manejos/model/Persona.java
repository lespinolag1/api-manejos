package py.com.progweb.manejos.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name ="persona")

public class Persona {
    @Id
    @Column(name = "id_persona")
    @Basic(optional = false)
    @GeneratedValue(generator = "personaSec", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "personaSec", sequenceName = "persona_sec", allocationSize = 0)
    private Integer id_persona;


    @Column(name = "apellido", length = 50)
    @Basic(optional = false)
    private String apellido;


    @Column(name = "nombre", length = 50)
    @Basic(optional = false)
    private String nombre;


    @Column(name = "numero_documento", length = 20)
    @Basic(optional = false)
    private String numero_documento;


    @Column(name = "tipo_documento", length = 50)
    @Basic(optional = false)
    private String tipo_documento;


    @Column(name = "nacionalidad", length = 30)
    @Basic(optional = false)
    private String nacionalidad;


    @Column(name = "email", length = 60)
    @Basic(optional = false)
    private String email;


    @Column(name = "telefono", length = 20)
    @Basic(optional = false)
    private String telefono;


    @Column(name = "fecha_nacimiento", length = 20)
    @Basic(optional = false)
    private Date fecha_nacimiento;


    public Persona() {
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
