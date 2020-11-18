/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * clase con atributos heredados de empleado 
 */
public class Gerente extends Empleado{
    private int presupuesto;
    /**
     * se crea un constructor vacio 
     */
    public Gerente() {
    }
    /**
     * se crea un constructor con parametros para guardar los parametros del gerente
     * @param presupuesto presupuesto que va a hacer el gerente
     * @param nombre parametro para el nombre del gerente
     * @param numEmpleado digito para el numero del gerente
     * @param sueldo parametro que va a resivir el sueldo del gerente
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return getter que regresa el valor del presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto parametro para indicar el presupuesto
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * metodo para indicar el aumento del presupuesto
     * @param anio años en los que se va a hacer el presupuesto
     * @param tasa tasa de presupuesto
     */
    public void setPresupuesto(int anio,float tasa){
        this.presupuesto += presupuesto/tasa* anio;
    }        
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
