package variablejava;

import java.util.Scanner;

public class EjemploScanner {

    public static void main(String args[]) {
        
        System.out.print("Proporciona el titulo:");
        Scanner consola= new Scanner(System.in);
        
        var titulo=consola.nextLine();
        
        System.out.print("Proporciona el autor:");
        var autor=consola.nextLine();
        
        System.out.println(titulo + " fue escrito por "+autor);
        
                
                
 
    }

}
