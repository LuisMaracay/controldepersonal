/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controldepersonal;
import java.util.*;
/**
 *
 * @author Luis Maracay
 */
public class Controldepersonal {
    
    
    
    
    public static void main(String[] args) {
    String nombre, apellido, cedula, direccion, zonapostal, representante, guardia,
            productoprincipal, productosecundario;
    int diasdetrabajo, diasdedescanso, eleccion=0;
    double a,b;
    administrativo sueldo = new administrativo();
    decampo sueldo2 = new decampo();
    proveedor registro = new proveedor();
    Scanner valor = new Scanner (System.in);
    
    do{
        
        System.out.println("Presione *1* si desea registrar personal administrativo");
    System.out.println("Presione *2* si desea registrar personal de Campo");
    System.out.println("Presione *3* si desea registrar personal proveedor");
    System.out.println("Presione *4* para salir del menú");
    eleccion = valor.nextInt();
    
    switch (eleccion)
    {
        case 1: 
        System.out.println("Ha elegido registrar personal administrativo"+"\n");
        System.out.println("Ingrese el nombre");
        nombre = valor.next();
        System.out.println("Ingrese el apellido");
        apellido = valor.next();
        System.out.println("Ingrese la cedula");
        cedula = valor.next();
        System.out.println("Ingrese la direccion");
        direccion = valor.next();
        System.out.println("Ingrese la zona postal");
        zonapostal = valor.next();
        System.out.println("Ingrese los dias de trabajo");
        diasdetrabajo = valor.nextInt();
        System.out.println("Ingrese los dias de descanso");
        diasdedescanso = valor.nextInt();
        a= sueldo.sueldoadministrativo(diasdetrabajo, diasdedescanso);
        b= sueldo.bonoalimentacionadmin(diasdetrabajo);
                
        String t = sueldo.RegistrarPersonalAdministrativo(nombre, apellido, cedula, 
        direccion, zonapostal, diasdetrabajo, diasdedescanso);
        System.out.println("\n"+ "\n"+"El empleado es: "+"\n"+"\n"+t );
        System.out.println("El sueldo es: "+a );
        System.out.println("El bono de alimentacion es: "+b );
        
        break;
            
        case 2: 
        System.out.println("Ha elegido registrar personal de Campo"+"\n");
        System.out.println("Ingrese el nombre");
        nombre = valor.next();
        System.out.println("Ingrese el apellido");
        apellido = valor.next();
        System.out.println("Ingrese la cedula");
        cedula = valor.next();
        System.out.println("Ingrese la direccion");
        direccion = valor.next();
        System.out.println("Ingrese la zona postal");
        zonapostal = valor.next();
        System.out.println("Ingrese el representante");
        representante = valor.next();
        System.out.println("Ingrese el tipo de guardia");
        guardia = valor.next();
        System.out.println("Ingrese los dias de trabajo");
        diasdetrabajo = valor.nextInt();
        System.out.println("Ingrese los dias de descanso");
        diasdedescanso = valor.nextInt();
        a= sueldo2.sueldodecampo(diasdetrabajo, diasdedescanso);
        b= sueldo2.bonoalimentaciondecampo(diasdetrabajo, diasdedescanso);
                
        String t2 = sueldo2.RegistrarPersonalDeCampo(nombre, apellido, cedula, 
                direccion, zonapostal, representante, guardia, diasdetrabajo, 
                diasdedescanso);
        System.out.println("\n"+ "\n"+"El empleado es: "+"\n"+"\n"+t2 );
        System.out.println("El sueldo es: "+a );
        System.out.println("El bono de alimentacion es: "+b );
        
        break;
            
        case 3: 
        System.out.println("Ha elegido registrar personal proveedor"+"\n");
        System.out.println("Ingrese el nombre");
        nombre = valor.next();
        System.out.println("Ingrese el apellido");
        apellido = valor.next();
        System.out.println("Ingrese la cedula");
        cedula = valor.next();
        System.out.println("Ingrese la direccion");
        direccion = valor.next();
        System.out.println("Ingrese la zona postal");
        zonapostal = valor.next();
        System.out.println("Ingrese el producto principal");
        productoprincipal = valor.next();
        System.out.println("Ingrese el producto secundario");
        productosecundario = valor.next();
                
        String t3 = registro.RegistrarPersonalProveedor(nombre, apellido, cedula,
                direccion, zonapostal, productoprincipal, productosecundario);
        System.out.println("\n"+ "\n"+"El proveedor es: "+"\n"+"\n"+t3 );
        
        break;
            
        default:
        System.out.println("Selección inválida");
        break;
    }
    
    }while(eleccion!=4);
    
    
    }
}
