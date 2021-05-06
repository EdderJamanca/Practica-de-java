package variablejava;

import java.util.Scanner;

public class tareas {

    static public void main(String args[]) {

        var consola = new Scanner(System.in);
        var caracterValor="Valor desconocido";
        System.out.print("Proporcionar una calificación entre 0 y 10: ");
        var calificacion =Integer.parseInt(consola.nextLine());
        
        if(calificacion>=0 && calificacion<6){
             caracterValor="F";
        }else if(calificacion>=6 && calificacion<7){
             caracterValor="D";
        }else if(calificacion>=7 && calificacion<8){
             caracterValor="C";
        }else if(calificacion>=8 && calificacion<9){
             caracterValor="B";
        }else if(calificacion>=9 && calificacion<10){
             caracterValor="a";
        }
        System.out.println("caracterValor = " + caracterValor);

        
    }

}
