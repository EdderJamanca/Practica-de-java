
package contextoestatico;

import domain.Persona;


public class ContextoEstatico {

    private int contador;
    public static void main(String[] args) {
        
        Persona persona1= new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        Persona persona2= new Persona("Karla");
        System.out.println("persona2 = " + persona2);
        //detro de una funcion estatica se puede imprimir otra funcion estatica
        imprimir(persona1);
        
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        imprimir(new Persona("Julia"));
        return this.contador;
    }
    
}
