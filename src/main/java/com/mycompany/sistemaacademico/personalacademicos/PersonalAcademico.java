/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personalacademicos;

import com.mycompany.sistemaacademico.empleados.Empleado;

/**
 *
 * @author User
 */
public abstract class PersonalAcademico extends Empleado{
    private String dedicacion;

    public PersonalAcademico(String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return "PersonalAcademicoo{" + "dedicacion=" + dedicacion + '}';
    }
    
    
    
}
