
package variablejava;

public class S04_operadoresAritmetico {
    
    static public void main(String arg[]){
        
        int a=3, b=2;
        
        var resultado = a+b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a-b;
        System.out.println("resultado Diferencia = " + resultado);
        
        resultado = a*b;
        System.out.println("resultado Multiplicación= " + resultado);
        
        var resultado1 = 3.0D/b;
        System.out.println("resultado Divición= " + resultado1);
        
        resultado = a%b;
        System.out.println("resultado Residuo= " + resultado);
        
        if(b%2==0)
            System.out.println("El número es par");
        else 
            System.out.println("El número es Inpar");
                
    }
    
}
