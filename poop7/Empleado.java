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
public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;
    /**
     * se crea un constructor vacio 
    */
    public Empleado() {
    }
     /**
      * 
      * @param nombre parametro para indicar el nombre del empleado
      * @param numEmpleado digito para el numero del empleado
      * @param sueldo parametro que va a resivir el sueldo del empleado
      */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return regresa el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre parametro que indica el nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return retorna el numero de empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado parametro que tiene el numero del empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return getter que devuelve el valor del sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param sueldo parametro para el sueldo
     */
    public void setSueldo(int sueldo) {
        if(sueldo>=0)
            this.sueldo = sueldo;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    /**
     * 
     * @param porcentaje que se le da al aumento que va a obtener el aumento del porcentaje
     * @return regresa el valor que va a tener el sueldo despues de aumentarlo
     */
    public int aumentarSueldo(int porcentaje){
        sueldo += (int)(sueldo * porcentaje/100);
        return sueldo;
    }
    
}
