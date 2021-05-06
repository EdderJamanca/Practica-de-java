
package test;

import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args){
         Persona persona1=new Persona("Juan",5000.00,false);
//         System.out.println("Personal Nombre:"+persona1.getNombre());
         
         System.out.println(persona1.toString());
         persona1.setNombre("Juan Carlos");
         System.out.println(persona1.toString());
//         System.out.println("Personal Nombre von cambio:"+persona1.getNombre());
//         System.out.println("Personal con sueldo:"+persona1.getSueldo());
//         System.out.println("Personal eliminado:"+persona1.isEliminado());
         
    }
    
    
}
