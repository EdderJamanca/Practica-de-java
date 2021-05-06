
package SESION05;


public class S05_CICLO {
    
    
        static public void main(String args[]){
            
            var contador =0;
            while(contador<3){
                System.out.println("Contador="+ contador);
                contador++;
            }
            
            System.out.println("CICLO DO WHILE");
            var contador1=0;
            do {
                System.out.println("Contador 1="+ contador1);
                contador1++;
            }while(contador1<0);
            
            System.out.println("CICLO FOR");
             for(int i=0;i<3;i++){
                 System.out.println("i = " + i);
             }
            System.out.println("CICLO FOR con break");
             for(int i=0;i<3;i++){
                 if(i%2==0){
                    System.out.println("i = " + i);
                    break;
                 }
             }
            System.out.println("CICLO FOR con Continuo");
            inicio:
             for(int i=0;i<3;i++){
                 if(i%2!=0){
                    
                    continue inicio;
                 }
                 System.out.println("i = " + i);
             }
        }
    
}
