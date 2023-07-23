package lycan.apptienda.entidades;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lycan.apptienda.entidades.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-22T20:42:04", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, Cliente> cliente;
    public static volatile SingularAttribute<Cuenta, Date> fecha_cancelacion;
    public static volatile SingularAttribute<Cuenta, String> estado;
    public static volatile SingularAttribute<Cuenta, Date> fecha_apertura;
    public static volatile SingularAttribute<Cuenta, Integer> id;
    public static volatile SingularAttribute<Cuenta, Integer> total_deuda;
    public static volatile SingularAttribute<Cuenta, Integer> total_cancelado;

}