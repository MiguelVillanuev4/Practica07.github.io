/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 * clase con atributos heredados de trabajador4
 */
public class Profesor extends Trabajador {
    private int numEmpleado;
    private String materia;
    /**
     * se crea un constructor vacio 
     */
    public Profesor() {
    }
    /**
     * constructor que llevara los parametros que se van a utilizar en la codificacion
     * @param nombre nombre que va a llevar 
     * @param edad parametro de la edad que indica la misma del profesor 
     * @param salario salario que tendra el profesor
     * @param aniosLabo años en los cuales a trabajado 
     * @param numEmpleado numero de empleado que va a tener el profesor
     * @param materia materia que da el profesor
     */
    public Profesor(String nombre, int edad, int salario, int aniosLabo, int numEmpleado, String materia) {
        super(nombre, edad, salario, aniosLabo);
        this.numEmpleado = numEmpleado;
        this.materia = materia;
    }
    /**
     * 
     * @return getter que devuelve el valor del numero del empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado que se da para el numero de empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return getter retorna la materia que imparte el profesor
     */
    public String getMateria() {
        return materia;
    }
    /**
     * 
     * @param materia parametro que indica la meteria a impartir
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    /**
     * 
     * @return regresa la informacion contenida en los getter y setters
     */
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "numEmpleado=" + numEmpleado + ", materia=" + materia + '}';
    }
    
    
}
