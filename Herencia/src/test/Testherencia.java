//
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class Testherencia {
    
    public static void main(String[] args){
        Empleado empleado1= new Empleado("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);

            
//           Cliente cliente1= new Cliente(new Date(),true,"karla",'F',28,"sATURNO 15");
//           System.out.println("cliente1 = " + cliente1);
    }
    
}
