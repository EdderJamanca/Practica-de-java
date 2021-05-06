
package aritmrtica;


public class PruebaNumerica {
    
    public static void main(String[] args){
        
        //Aritmetica de la clase
       Aritmetica art1= new Aritmetica();
       
        System.out.println("art1 = " + art1.a);
        System.out.println("art1 = " + art1.b);
        
        System.out.println("Segundo constructor");
        Aritmetica art2=new Aritmetica(5,2);
        System.out.println("art2 = " + art2.a);
        System.out.println("art2 = " + art2.b);
       
       
       art1.a=3;
       art1.b=3;
       art1.sunar();
       
 
       
       int resultado=art1.sumarConRetorno();
       System.out.println("resultado = " + resultado);
       
       int resultadoConArgumento=art1.sumarConArgumento(8, 6);
        System.out.println("resultadoConArgumento = " + resultadoConArgumento);
    
    }
    
}
