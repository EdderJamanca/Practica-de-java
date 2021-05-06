
package variablejava;

public class VariableJava {

    public static void main(String[] args) {
        
        var usuario="Juan";
        
        var carrera="Ing Sistemas";
        
        var union= usuario +" "+carrera;
        
        System.out.println("union  = " + union);
        
        var i=2;
        var j=4;
        
        System.out.println( i+j);//se realiza la suma de numero
        System.out.println(i + j +usuario);//Evaluación de izq a der,realiza suma
        System.out.println(usuario +" " + i + j);//Contexto Cadena,todo es una Cadena
        System.out.println(usuario +" " + (i + j));//Uso de parentesis modificando la prioridad
        
        //VARIABLE DE CARACTER ESPECIALES
        
        var nombre ="Karla";
        
        System.out.println("Nueva Linea: \n"+ nombre);
        System.out.println("Tabulador: \t"+nombre);
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Comilla Simple: \'"+nombre +"\'");
        System.out.println("Comilla doble: \" "+nombre +"\"");
        
        
        
    }
    
}
