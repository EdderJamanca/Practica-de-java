
package SESION05;


public class S05_IF {
    
    static public void main(String args[]){
        var condicion = true;
        
        if(condicion){
            System.out.println("Condicion Verdadero");
        }else {
            System.out.println("Condicion falsa");
        }
        
        var numero=1;
        var numeroTexto ="Numero desconocido";
        
        if(numero==1){
            System.out.println("Numero uno");
        }else if(numero==2){
            System.out.println("Numero dos");
        }else if(numero==3){
            System.out.println("Numero tres");
        }else if(numero==4){
            System.out.println("Numero Cuatro");
        }else {
            System.out.println("Numero no encontrado");
        }
        
        var mes =4;
        
        var estacion ="Estación desconocida";
        
        if(mes==1 || mes==2 || mes==3){
            System.out.println("Invierno");
        }else if(mes==4 || mes==5 || mes==6){
            System.out.println("Primavera");
        }else if(mes==7 || mes==8 || mes==9){
            System.out.println("Verano");
        }else if(mes==10 || mes==11 || mes==11){
            System.out.println("Otono");
        }
        
        
        
        
        
        
    }
    
}
