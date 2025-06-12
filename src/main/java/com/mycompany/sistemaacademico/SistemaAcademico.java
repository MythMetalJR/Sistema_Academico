/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

/**
 *
 * @author User
 */
public class SistemaAcademico {

    public static void main(String[] args) {
      
        
        System.out.println("\n Datos de la PERSONAINSTITUCIONAL");
        PersonaInstitucional objPersonaInstitucional= new PersonaInstitucional("cristian@espoch", 3 , "cris", "cristian@gmail.com", "15472647124");
        System.out.println("DATOS: " +objPersonaInstitucional.toString() );
        
        System.out.println("\n Datos de la Empleado");
        Empleado objEmpleado= new Empleado(460.0, "donsanti@espoch", 5 , "Santiago", "santipro@gmail.com", "145231546");
        System.out.println("DATOS: " +objEmpleado.toString() );
        
        System.out.println("\n Datos de la Estudiante");
        Estudiante objEstudiante= new Estudiante(365 , "josuea@espoch" , 4 , "Josue", "jnrodriguez@gmail.com", "2250101348");
        System.out.println("DATOS: " +objEstudiante.toString() );
        
       System.out.println("\n Datos de la PersonalServicios");
        PersonalServicios objpersonalServicios= new PersonalServicios("Espoch" , 480 , "pedrosilva@espoch", 7, "Pedro", "pedrosilva123@gmail.com", "4856478516");
        System.out.println("DATOS: " +objpersonalServicios.toString() );
    }
}
