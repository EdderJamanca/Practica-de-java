
package variablejava;

public class sesion_03 {
    
    
    static public void main(String args[]){
        /*
    TIPOS PRIMITIVOS ENTEROS: BYTE(8byte), SHORT(16byte), INT(32byte), LONG(64byte)
    
    */
    byte numeroByte=(byte)129;//NOS DA UNA IMPRESIOCION
    
        System.out.println("Valor byte ="+numeroByte);
        System.out.println("Valor minimo byte:"+Byte.MIN_VALUE);
        System.out.println("Valor minimo byte:"+Byte.MAX_VALUE);
        
     short numeroShort=(short)32768;
     
        System.out.println("Valor byte ="+numeroShort);
        System.out.println("Valor minimo Short:"+Short.MIN_VALUE);
        System.out.println("Valor minimo Short:"+Short.MAX_VALUE);
        
      int numeroInt=(int)2147483648L;
      
         System.out.println("Valor byte ="+numeroInt);
         System.out.println("Valor minimo Int:"+Integer.MIN_VALUE);
         System.out.println("Valor minimo Int:"+Integer.MAX_VALUE);
      
      long numeroLong=9223372036854775807L;
      
         System.out.println("Valor byte ="+numeroLong);
         System.out.println("Valor minimo Long:"+Long.MIN_VALUE);
         System.out.println("Valor minimo Long:"+Long.MAX_VALUE);
        
      //tipos primitivos de tipo flotante:float y double
      float numeroFloat=(float)3.4028235E38D;
      
         System.out.println("Valor float ="+numeroFloat);
         System.out.println("Valor minimo float:"+Float.MIN_VALUE);
         System.out.println("Valor minimo float:"+Float.MAX_VALUE); 
      
       double numeroDouble=1.7976931348623158E308;
         System.out.println("Valor double ="+numeroDouble);
         System.out.println("Valor minimo double:"+Double.MIN_VALUE);
         System.out.println("Valor minimo double:"+Double.MAX_VALUE);      
         
         
    //FIN MAIN
    
    }
    
}
