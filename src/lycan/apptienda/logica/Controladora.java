package lycan.apptienda.logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lycan.apptienda.entidades.Cliente;
import lycan.apptienda.entidades.Compra;
import lycan.apptienda.entidades.Cuenta;
import lycan.apptienda.entidades.Usuario;
import lycan.apptienda.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia conPer = new ControladoraPersistencia();
    
    /*USUARIO*/
    public void insertUser(Usuario user){
        
        conPer.insertUser(user);
    }
    
    public Usuario buscarUsuario(int id) throws Exception{
        Usuario user = new Usuario();
        try {
            user = conPer.buscarUsuario(id);
        } catch (Exception ex) {
            throw ex;
        }
        
        return user;
    }
    
    /*CLIENTE*/
    public void insertClient(Cliente cliente) throws Exception{
        
        try {
            conPer.insertClient(cliente);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public Cliente buscarCliente(int num_id) throws Exception{
        
        Cliente cliente = new Cliente();
        try{
            cliente = conPer.buscarCliente(num_id);
        }catch(Exception ex){
            throw ex;
        }
        
        return cliente;
    }
    
    /*CUENTA*/
    public Cuenta buscarCuenta(int id_cuenta)throws Exception{
        
        try {
            return conPer.buscarCuenta(id_cuenta);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void insertCuenta(Cuenta cuenta){
        
        conPer.insertCuenta(cuenta);
    }
    
    /*COMPRA*/
    public void insertCompra(Compra compra){
        
        conPer.insertCompra(compra);
    }
}
