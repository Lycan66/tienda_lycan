package lycan.apptienda.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lycan.apptienda.logica.Controladora;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario implements Serializable {
    
    @Id
    @Column(name="NUM_IDENTIFICACION")
    private int identificacion;
    
    @Column(name="PRIMER_NOMBRE")
    private String primer_nombre;
    
    @Column(name="SEGUNDO_NOMBRE")
    private String segundo_nombre;
    
    @Column(name="PRIMER_APELLIDO")
    private String primer_apellido;
    
    @Column(name="SEGUNDO_APELLIDO")
    private String segundo_apellido;
    
    @Column(name="CONTRASEÑA")
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int identificacion, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String contraseña) {
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.contraseña = contraseña;
    }

    public Usuario(int identificacion, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido) {
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        
        if (segundo_nombre.equals("")) this.segundo_nombre = null;
        else this.segundo_nombre = segundo_nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificacion=" + identificacion + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    public static boolean iniciarSesión(int identificacion, String contraseña) throws Exception {
        
        try {
            Controladora control = new Controladora();
            Usuario user = control.buscarUsuario(identificacion);
            if(contraseña.equals(user.getContraseña())) return true;
        } catch (Exception ex) {
            throw ex;
        }
        return false;
    }
    
    
}
