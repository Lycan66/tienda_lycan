package lycan.apptienda.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMPRAS")
public class Compra implements Serializable {
    
    @Id
    @Column(name = "ID_COMPRA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(TemporalType.TIMESTAMP) //Para mapear la fecha y hora
    private Date fecha_compra;
    
    @Column(name = "VALOR_COMPRA")
    private int valor_compra;
    
    @OneToOne(cascade = CascadeType.MERGE)//Esto para que se actualice el total de la deuda en la cuenta
    @JoinColumn(name = "ID_CUENTA")
    private Cuenta cuenta;
    
    @OneToOne
    @JoinColumn(name = "CLIENTE_NUM_IDENTIFICACION")
    private Cliente cliente;

    public Compra() {
    }

    public Compra(Date fecha_compra, int valor_compra, Cliente cliente) {
        this.fecha_compra = fecha_compra;
        this.valor_compra = valor_compra;
        this.cliente = cliente;
    }

    public Compra(Date fecha_compra, int valor_compra) {
        this.fecha_compra = fecha_compra;
        this.valor_compra = valor_compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(int valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fecha_compra=" + fecha_compra + ", valor_compra=" + valor_compra + ", cuenta=" + cuenta.getId() + ", cliente=" + cuenta.getCliente().getIdentificacion() + '}';
    }
    
}
