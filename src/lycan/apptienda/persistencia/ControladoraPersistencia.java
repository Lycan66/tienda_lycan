package lycan.apptienda.persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lycan.apptienda.entidades.Cliente;
import lycan.apptienda.entidades.Compra;
import lycan.apptienda.entidades.Cuenta;
import lycan.apptienda.entidades.Usuario;
import lycan.apptienda.persistencia.exceptions.PreexistingEntityException;

public class ControladoraPersistencia {
    
    UsuarioJpaController userJpa = new UsuarioJpaController();
    ClienteJpaController clientJpa = new ClienteJpaController();
    CuentaJpaController cuentaJpa = new CuentaJpaController();
    DomicilioJpaController domiJpa = new DomicilioJpaController();
    CompraJpaController compraJpa = new CompraJpaController();
    
    /*USUARIO*/

    public void insertUser(Usuario user) {
        try {
            userJpa.create(user);
            System.out.println("Usuario registrado");
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Usuario buscarUsuario(int id) throws Exception {
        
        Usuario user = userJpa.findUsuario(id);
        if (user == null) throw new Exception ("No se encontró el usuario " + id);
        return user;
    }
    
    /*CLIENTE*/
    public void insertClient(Cliente cliente) throws PreexistingEntityException, Exception{
        
        try {
            clientJpa.create(cliente);
            JOptionPane.showMessageDialog(null, "Cliente registrado");
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public Cliente buscarCliente(int num_id) throws Exception{
        
        Cliente cliente = clientJpa.findCliente(num_id);
        if (cliente == null) throw new Exception ("No se encontró el cliente " + num_id);
        return cliente;       
    }

    /*CUENTA*/
    public Cuenta buscarCuenta(int id_cuenta) throws Exception{
        
        Cuenta cuenta = cuentaJpa.findCuenta(id_cuenta);
        if(cuenta == null){
            throw new Exception("No se encontró la cuenta " + id_cuenta);
        }
        return cuenta;
    }
    
    public void insertCuenta(Cuenta cuenta) {
        
        cuentaJpa.create(cuenta);
        JOptionPane.showMessageDialog(null, "La cuenta se ha creado con éxito", "¡Buenas noticias!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /*COMPRA*/
    public void insertCompra(Compra compra){
        
        try {
            compraJpa.create(compra);
            System.out.println("Compra registrada");
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
