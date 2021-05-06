
package aritmrtica;


public class Aritmetica {
    //Atributo de la  lass
    int a;
    int b;
    //CONSTRUCTOR VACIO
    public Aritmetica(){
        System.out.println("Ejecutando Constructor Vacio");
    }
    public Aritmetica(int a, int arg2){
        this.a=a;
        this.b=arg2;
        System.out.println("Ejecutando constructor con arg");
    }
    
    //Metodo 
    public void sunar(){
        int resultado = a+b;
        System.out.println("Resultado =" + resultado);
    }
    public int sumarConRetorno(){
        
        int resultado=a+b;
    
        return resultado;
    }
    public int sumarConArgumento(int arg1, int arg2){
        a=arg1;
        b=arg2;
        return (a+b);
        
    }
}
