package lycan.apptienda.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CUENTAS_CLIENTES")
public class Cuenta implements Serializable {
    
    @Id
    @Column(name = "ID_CUENTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    
    @Column(name = "TOTAL_DEUDA")
    private int total_deuda;
    
    @Temporal(TemporalType.DATE) //Tipo DATE guarda solo la fecha sin la hora
    private Date fecha_apertura;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_cancelacion;
    
    @Column(name = "ESTADO")
    private String estado; //El estado podrá ser "activa" o "finalizada"
    
    @Column(name = "TOTAL_CANCELADO")
    private int total_cancelado; //Se guarda el valor de lo que se ha cancelado
    
    @OneToOne(mappedBy = "cuenta", fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_NUM_IDENTIFICACION")
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(int total_deuda, Date fecha_apertura, Date fecha_cancelacion, String estado, int total_cancelado) {
        this.total_deuda = total_deuda;
        this.fecha_apertura = fecha_apertura;
        this.fecha_cancelacion = fecha_cancelacion;
        this.estado = estado;
        this.total_cancelado = total_cancelado;
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

    public int getTotal_deuda() {
        return total_deuda;
    }

    public void setTotal_deuda(int total_deuda) {
        this.total_deuda = total_deuda;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public Date getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(Date fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTotal_cancelado() {
        return total_cancelado;
    }

    public void setTotal_cancelado(int total_cancelado) {
        this.total_cancelado = total_cancelado;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", total_deuda=" + total_deuda + ", fecha_apertura=" + fecha_apertura + ", fecha_cancelacion=" + fecha_cancelacion + ", estado=" + estado + ", total_cancelado=" + total_cancelado + ", cliente=" + cliente.getIdentificacion() + '}';
    }
    
    
    
}
