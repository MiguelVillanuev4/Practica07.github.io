/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * clase que heredara sus atributos
 */
public class Persona  {
    private String nombre;
    private int edad;
    /**
     * se crea un constructor vacio 
     */
    public Persona() {
    }
    /**
     * constructor con parametros a ocupar en el codigo
     * @param nombre nombre que resive la persona
     * @param edad valor que resive la edad del parametro
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * 
     * @return regresa el nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return regresa la edad de la persona 
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param nombre parametros que resive el nombre dentro de un setter
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @param edad parametros que resive la edad dentro de un setter
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
   
}
