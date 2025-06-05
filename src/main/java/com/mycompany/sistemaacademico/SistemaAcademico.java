/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;
import com.mycompany.sistemaacademico.Clases.Persona;
import com.mycompany.sistemaacademico.Clases.PersonaInvitado;
import com.mycompany.sistemaacademico.Clases.PersonaInstitucional;
import com.mycompany.sistemaacademico.Clases.Empleado;
import com.mycompany.sistemaacademico.Clases.Estudiante;
import com.mycompany.sistemaacademico.Clases.PersonalServicios;
/**
 *
 * @author User
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println("Datos del Objeto Persona");
       Persona persona= new Persona (1, "Josue Rodriguez", "jnrodriguez@gmail.com", "2250101348" );
        System.out.println("DATOS"+persona.toString());
        
        System.out.println("\n Datos del Objeto Persona");
        System.out.println("DATOS DEL OBEJETO PERSONA INVITADA");
        PersonaInvitado PersonaInvitado= new PersonaInvitado(2, "Britany", "britany@hotmail.com", "1751623776");
        System.out.println("DATOS" +PersonaInvitado.toString() );
        
        System.out.println("\n Datos de la PERSONAINSTITUCIONAL");
        PersonaInstitucional objPersonaInstitucional= new PersonaInstitucional("cristian@espoch", 3, "cris", "cristian@gmail.com", "15472647124");
        System.out.println("DATOS" +objPersonaInstitucional.toString() );
        
        System.out.println("\n Datos de la Empleado");
        Empleado objEmpleado= new Empleado(460.0 , "donsanti@espoch", 4, "Santiago", "santipro@gmail.com", "145231546");
        System.out.println("DATOS" +objEmpleado.toString() );
        
        System.out.println("\n Datos de la Estudiante");
        Estudiante objEstudiante= new Estudiante(365 , "josuea@espoch", 4, "Josue", "jnrodriguez@gmail.com", "2250101348");
        System.out.println("DATOS" +objEstudiante.toString() );
        
        System.out.println("\n Datos de la PersonalServicios");
        PersonalServicios objPersonalServicios= new PersonalServicios("SEDE ORELLANA" ,1500 , "josuea@espoch", 4, "Josue", "jnrodriguez@gmail.com", "2250101348");
        System.out.println("DATOS" +objPersonalServicios.toString() );
    }
}
