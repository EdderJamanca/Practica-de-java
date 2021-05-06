
package variablejava;

public class sS04_operadoresUnarios {
    
    static public void main (String args[]){
        
        var a=2;
        var c=-a;
        
        System.out.println("a = " + a);
        System.out.println("c = " + c);
        
        var b=true;
        var d=!b;
        System.out.println("b = " + b);
        System.out.println("d = " + d);
        
        //INCREMENTO
        // PREINCREMENTO
        var e=3; var f=++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //POSINCREMENTO
        var g=5; var h=g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //PREDECREMENTO
        var n=6; var m=--n;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        //POSDECREMENTO
        var l=4; var p=l--;
        System.out.println("l = " + l);
        System.out.println("p = " + p);
        
        
    }
    
}
