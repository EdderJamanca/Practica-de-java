
package text;

import domain.Persona;


public class testFinal {
    
    public static void main(String[] args) {
        final int miVariable=10;
        System.out.println("miVariable = " + miVariable);
//        miVariable=3; cuando lleva el FINAL la variable mo se puede sobre escribir
           // Persona.Mi_CONSTANTE=2;=> mo permite sobreescribir 
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        
        final Persona persona1=new Persona();
        //persona1=new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());
    }
    
}
