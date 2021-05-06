
package variablejava;


public class S04_op_condicionales {
    
    static public void main(String args[]){
        
        var a=8;
        var valorMinimo=0;
        var valorMaximo=10;
        
        var resultado= a>=0 && a<=10;
        
        if(resultado){
            System.out.println("Dentro de rango");
        }else {
            System.out.println("Fuera de rango");
        }
        var vacaciones =false;
        var diaDescanso =true;
        
        if(vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego del hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }
        
        //OPERADORES TERNARIOS
        
        var resultado1 = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado1 = " + resultado1);
        
        var numero=9;
        
        resultado1=(numero%2==0) ? "numero par":"numero inpar";
        System.out.println("resultado1 = " + resultado1);
    }
    
}
