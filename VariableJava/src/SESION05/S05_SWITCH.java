
package SESION05;

public class S05_SWITCH {
    
    
    static public void main( String args[]){
    
        var numero=1;
        var numeroTexto="Valor desconocido";
        
        switch(numero){
            
            case 1:
                numeroTexto ="Numero uno";
                break;
            case 2:
                numeroTexto="Numero dos";
                break;
            case 3:
                numeroTexto ="Numero tres";
                break;
            case 4:
                numeroTexto ="Numero cuatro";
                break;
            default:
                numeroTexto="Caso no encontrado";
        
        }
        System.out.println("Numero Texto="+numeroTexto);
        
        var mes=2;
        var estacion="estacion desconocida";
        switch(mes){
            case 1: case 2: case 12:
                estacion ="Invernadero";
                break;
            case 3: case 4: case 5:
                estacion ="Primavera";
                break;
            case 6: case 7: case 8:
                estacion ="Verano";
                break;
            case 9: case 10: case 11:
                estacion ="Otono";
                break;
        
        }
        System.out.println("Estación :" + estacion);
    
    }
    
    
}
