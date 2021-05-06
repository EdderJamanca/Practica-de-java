
package test;

import operador.Operador;


public class TestOperador {
    
    public static void main(String[] args){
        
        var resultado=Operador.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        var resultado1=Operador.sumar(5F, 1);
        System.out.println("resultado = " + resultado);
    }
    
}
