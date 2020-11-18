/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * clase con atributos heredados de persona
 */
public class Alumno extends Persona{
    private int calificacion, numCuenta;
    boolean ordinario;
    /**
     * se crea un constructor vacio 
     */
    public Alumno() {
    }
    /**
     * se crea un constructor llamado alumno con los parametros siguientes
     * @param nombre nombre con el cual se va a identificar al alumno
     * @param edad parametro que da la edad del alumno
     * @param numCuenta numero de cuenta del alumno
     * @param calificacion parametro de la calificacion optenida por el alumno 
     */
    public Alumno(String nombre, int edad,int numCuenta, int calificacion) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.calificacion = calificacion;
        this.ordinario = true;
        
    }
    /**
     * 
     * @return retorna el valor de la calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }
    /**
     * 
     * @param calificacion parametro que tiene la calificaciond
     */
    public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
    }
    /**
     * 
     * @return retorna el numero de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * 
     * @param numCuenta da el parametro del numero de cuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * 
     * @return el valor booleano si es cierto que es ordinario el alumno o no
     */
    public boolean isOrdinario() {
        return ordinario;
    }
    /**
     * 
     * @param ordinario parametro que indica si es ordinario o no
     */
    public void setOrdinario(boolean ordinario) {
        this.ordinario = ordinario;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "calificacion=" + calificacion + ", numCuenta=" + numCuenta + ", ordinario=" + ordinario + '}';
    }
    /**
     * 
     * @param calificacion da el parametro de la calificacion para determinar si es ordinario o no
     */
    public void Calif(int calificacion) {
        if(calificacion>=6){
            ordinario=true;
            this.calificacion = calificacion;
        }
        else{
            ordinario=false;
        }
    }
}