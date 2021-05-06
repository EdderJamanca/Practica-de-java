package variablejava;

import java.util.Scanner;

public class s03_comvertir {

    static public void main(String args[]) {
        var edad = Integer.parseInt("22");
        // VAR EDAD = "20"
        System.out.println("edad=" + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor PI =" + valorPI);
        System.out.println("Proporciona tu edad");
        var consola = new Scanner(System.in);
        edad = Integer.parseInt(consola.nextLine());
        
        //converetir un valor entero a string
        
        var caracter01 =String.valueOf("10");
        System.out.println("caracter="+caracter01);
        
         var caracter ="hola".charAt(0);
        System.out.println("caracter="+caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter=consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }

}
