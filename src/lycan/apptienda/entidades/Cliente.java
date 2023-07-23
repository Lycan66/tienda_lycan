package lycan.apptienda.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Usuario{
    
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "TELEFONO")
    private long telefono;
    
    @Column(name = "CORREO")
    private String correo;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_CUENTA")
    private Cuenta cuenta;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DOMICILIO")
    private Domicilio domicilio;

    public Cliente() {
    }

    public Cliente(long telefono, String correo, int identificacion, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido) {
        super(identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido);
        if (correo.equals(""))this.correo = null;
        else this.correo = correo;
        this.telefono = telefono;
        
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", telefono=" + telefono + ", correo=" + correo + ", cuenta=" + cuenta.getId() + ", domicilio=" + domicilio.getId() + '}';
    }   
    
}
