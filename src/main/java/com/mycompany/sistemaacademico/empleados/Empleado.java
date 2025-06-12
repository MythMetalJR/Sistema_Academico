
package com.mycompany.sistemaacademico.empleados;

import com.mycompany.sistemaacademico.personasinstitucionales.PersonaInstitucional;

/**
 *
 * @author User
 */
public abstract class Empleado extends PersonaInstitucional{
    //atributos
    private final double sueldo;
    
    //metodos

    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

 
    @Override
    public String toString() {
        return "Empleado{" + "sueldo: " + sueldo + super.toString()+ '}';
    }


    
}
