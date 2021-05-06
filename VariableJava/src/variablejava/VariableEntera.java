
package variablejava;


public class VariableEntera {
    
    
    public static void main(String args[]){
        int miVariableEntera=5;
        
        System.out.println("Mi variable Entera "+miVariableEntera);
        
        //CAMBIAMOS DE VALOR A LA VARIABLE ENTERA
        
        miVariableEntera=10;
        
        System.out.println("Mi variable Entera Redeclarado "+miVariableEntera);
        
        
        //Declarando variable cadena
        
        String miVariableCadena="Hola";
        
        System.out.println("miVariable Cadena " + miVariableCadena);
        
        //REDECLARAMOS LA VARIABLE CADENA
        
        miVariableCadena="Adios";
        
        System.out.println("mi Variable Cadena Redeclarado "+miVariableCadena);
        
        // VAR ->INTERFERENCIA DE TIPO VARIABLE
        var miVariableEntera2=15;
        System.out.println("miVariableEntera2"+miVariableEntera2);
        
        var miVariableCadena2="variable Var";
        
        System.out.println("mi Vaiable"+miVariableCadena2);
        
        //VARIABLES PERMITIDAS 
        var miVariable=1;
        var _miVariable=2;
        var $miVariable=3;
        
        //var ámiVariable=2; No es recomendable utilizar;
        //var #miVariable=1; no es permitido utilizar caracter especiales 
               
        
    }
    
}
