/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel Angel
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        System.out.println("************************1******************");
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("");
        System.out.println("************************2******************");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("NumEmpleado"+gerente1.getNumEmpleado());
        System.out.println("sueldo"+gerente1.getSueldo());
        System.out.println("Presupuesto"+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        
        System.out.println("Presupuesto"+gerente1.getPresupuesto());
        
        System.out.println("");
        System.out.println("************************3******************");
        Gerente gerente2 = new Gerente(500000,"Julio",88,200000);
        System.out.println("nombre"+gerente2.getNombre());
        System.out.println("NumEmpleado"+gerente2.getNumEmpleado());
        System.out.println("sueldo"+gerente2.getSueldo());
        System.out.println("Presupuesto"+gerente2.getPresupuesto());
        
        System.out.println("");
        System.out.println("************************4******************");
        //Sobrescritura
        System.out.println(gerente2);
        
        System.out.println("");
        System.out.println("************************5******************");
        //Sobrecarga
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        System.out.println("*********************Ejercisio******************");
        System.out.println(" ");
        System.out.println("*********************Persona******************");
        Persona persona = new Persona();
        persona.setNombre("Alejandra");
        persona.setEdad(27);
        System.out.println(persona);
        System.out.println("*********************Alumno******************");
        Alumno alumno = new Alumno();
        alumno.setNombre("Alonso");
        alumno.setEdad(17);
        alumno.setCalificacion(9);
        alumno.setNumCuenta(382839413);
        alumno.Calif(9);
        alumno.setOrdinario(true);
        System.out.println("Nombre "+alumno.getNombre());
        System.out.println("Edad "+alumno.getEdad());
        System.out.println("Calificacion "+alumno.getCalificacion());
        System.out.println("Numero de cuenta "+alumno.getNumCuenta());
        System.out.println("¿Es ordinario? "+alumno.isOrdinario());
        
        System.out.println("*********************Alumno2******************");
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Alondra");
        alumno2.setEdad(20);
        alumno2.setCalificacion(5);
        alumno2.setNumCuenta(324628527);
        alumno2.Calif(5);
        alumno2.setOrdinario(false);
        System.out.println("Nombre "+alumno2.getNombre());
        System.out.println("Edad "+alumno2.getEdad());
        System.out.println("Calificacion "+alumno2.getCalificacion());
        System.out.println("Numero de cuenta "+alumno2.getNumCuenta());
        System.out.println("¿Es ordinario? "+alumno2.isOrdinario());
        
        System.out.println("*********************Trabajador******************");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Roberto");
        trabajador.setEdad(38);
        trabajador.setSalario(30000);
        trabajador.setAniosLabo(6);
        System.out.println("Nombre "+trabajador.getNombre());
        System.out.println("Edad "+trabajador.getEdad());
        System.out.println("Salario "+trabajador.getSalario());
        System.out.println("Años laborando "+trabajador.getAniosLabo());
        trabajador.aumentarSalario(10);
        System.out.println("Nuevo salario "+trabajador.getSalario());
    
        System.out.println("*********************Trabajador2******************");
        Trabajador trabajador2 = new Trabajador();
        trabajador2.setNombre("Rojelio");
        trabajador2.setEdad(40);
        trabajador2.setSalario(7000);
        trabajador2.setAniosLabo(3);
        System.out.println("Nombre "+trabajador2.getNombre());
        System.out.println("Edad "+trabajador2.getEdad());
        System.out.println("Salario "+trabajador2.getSalario());
        System.out.println("Años laborando "+trabajador2.getAniosLabo());
        trabajador.aumentarSalario(10);
        System.out.println("Nuevo salario "+trabajador2.getSalario());
        
        System.out.println("*********************Director******************");
        Director director = new Director();
        director.setNombre("Carlos Agustín Escalante Sandoval");
        director.setEdad(58);
        director.setSalario(70000);
        director.setAniosLabo(5);
        director.setFacultad(" Facultad de ingenieria ");
        director.setAniosRes(2);
        System.out.println("Nombre "+director.getNombre());
        System.out.println("Edad "+director.getEdad());
        System.out.println("Instituto "+director.getFacultad());
        System.out.println("Salario "+director.getSalario());
        System.out.println("Años Restantes "+director.getAniosRes());
        director.aumentarSalario(10);
        System.out.println("Nuevo salario "+director.getSalario());
        
        System.out.println("*********************Profesor******************");
        Profesor profesor = new Profesor();
        profesor.setNombre("Aldo");
        profesor.setEdad(30);
        profesor.setSalario(10000);
        profesor.setAniosLabo(3);
        profesor.setMateria(" Algebra lineal ");
        profesor.setNumEmpleado(256235);
        System.out.println("Nombre "+profesor.getNombre());
        System.out.println("Edad "+profesor.getEdad());
        System.out.println("Materia "+profesor.getMateria());
        System.out.println("Salario "+profesor.getSalario());
        System.out.println("Años Restantes en el instituto "+profesor.getAniosLabo());
        System.out.println("Numero de empleado "+profesor.getNumEmpleado());
        director.aumentarSalario(10);
        System.out.println("Nuevo salario "+profesor.getSalario());
    }
    
}
