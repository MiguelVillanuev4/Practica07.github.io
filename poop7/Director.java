/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * clase con atributos heredados de trabajador 
 */
public class Director extends Trabajador{
    private String facultad;
    private int aniosRes;
    /**
     * se crea un constructor vacio 
     */
    public Director() {
    }
    /**
     * constructor con parametros a utilizar en la clase
     * @param nombre nombre con el cual se va a identificar al director de la institucion
     * @param edad parametro que da la edad del director
     * @param salario salario que resive el director
     * @param aniosLabo valor que resive los años que ha estado trabajando el director
     * @param facultad facultat de la cual es director 
     * @param aniosRes años restantes que le quedan al director para dejar su puesto
     */
    public Director(String nombre, int edad, int salario, int aniosLabo, String facultad, int aniosRes) {
        super(nombre, edad, salario, aniosLabo);
        this.facultad = facultad;
        this.aniosRes = aniosRes;
    }
    /**
     * 
     * @return regresa la cadena de la facultad
     */
    public String getFacultad() {
        return facultad;
    }
    /**
     * 
     * @param facultad parametro dado para indicar la institucion
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    /**
     * 
     * @return getter que regresa el año que le resta al director
     */
    public int getAniosRes() {
        return aniosRes;
    }
    /**
     * 
     * @param aniosRes parametro dado para los años que le quedan de trabajador
     */
    public void setAniosRes(int aniosRes) {
        if(aniosRes>=0 && aniosRes<=7)
            this.aniosRes = aniosRes;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return super.toString() + "Director{" + "facultad=" + facultad + ", aniosRes=" + aniosRes + '}';
    }
    /**
     * 
     * @param aniosRes parametro de los años restantes del director
     * @return retorna el valor de aniosRes
     */
    public int fin(int aniosRes){
        if(aniosRes == 7){
            System.out.println("se termina su labor en esta institucion");
        }
        else{
            System.out.println("todavia quedad años de labor ");
        }
        return aniosRes;
    }
}
