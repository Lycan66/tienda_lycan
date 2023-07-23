package lycan.apptienda.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOMICILIOS_CLIENTES")
public class Domicilio implements Serializable {
    
    @Id
    @Column(name = "ID_DOMICILIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "BARRIO")
    private String barrio;
    
    @Column(name = "CALLE")
    private String calle;
    
    @Column(name = "DIRECCION")
    private String direccion;

    public Domicilio() {
    }

    public Domicilio(String barrio, String calle, String direccion) {
        this.barrio = barrio;
        this.calle = calle;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "id=" + id + ", barrio=" + barrio + ", calle=" + calle + ", direccion=" + direccion + '}';
    }
    
}
