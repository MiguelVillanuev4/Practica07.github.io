/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * Clase que hereda los atributos de persona
 * clase con atributos heredados de persona
 */
public class Trabajador extends Persona{
    private int salario, aniosLabo;
    /**
     * se crea un constructor vacio 
     */
    public Trabajador() {
    }
    /**
     * constructor con parametros a ocupar en la clase trabajador
     * @param nombre nombre que resive el trabajador
     * @param edad valor que resive la edad del parametro
     * @param salario salario que resive el trabajador
     * @param aniosLabo valor que resive los años que ha estado trabajando el trabajador
     */
    public Trabajador(String nombre, int edad, int salario, int aniosLabo) {
        super(nombre, edad);
        this.salario = salario;
        this.aniosLabo = aniosLabo;
    }
    /**
     * 
     * @return regresa el valor del salario
     */
    public int getSalario() {
        return salario;
    }
    /**
     * 
     * @param salario parametro del salario del trabajador
     */
    public void setSalario(int salario) {
        if(salario>=0){
            this.salario = salario;
        }
    }
    /**
     * 
     * @return regresa los años en los que ha trabajado
     */
    public int getAniosLabo() {
        return aniosLabo;
    }
    /**
     * 
     * @param aniosLabo parametros de años en los que ha trabajado
     */
    public void setAniosLabo(int aniosLabo) {
        this.aniosLabo = aniosLabo;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return super.toString() + "Trabajador{" + "salario=" + salario + ", aniosLabo=" + aniosLabo + '}';
    }
    /**
     * 
     * @param porcentaje parametro para el porcentaje que se le va a dar de aumento al trabajador
     * @return regresa el valor del salario
     */
    public int aumentarSalario(int porcentaje){
        if(aniosLabo>=5){
            salario += (int)(salario * porcentaje/100);
        }
        return salario;
    }
}
  
    
