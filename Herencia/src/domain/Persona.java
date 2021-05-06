
package domain;

public class Persona {
    
    protected String nmbre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    public Persona(){
        
    }
    public Persona(String nombre){
        this.nmbre=nombre;
    }

    public Persona(String nmbre, char genero, int edad, String direccion) {
        this.nmbre = nmbre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNmbre() {
        return this.nmbre;
    }

    public void setNmbre(String nmbre) {
        this.nmbre = nmbre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nmbre=" + nmbre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
}
