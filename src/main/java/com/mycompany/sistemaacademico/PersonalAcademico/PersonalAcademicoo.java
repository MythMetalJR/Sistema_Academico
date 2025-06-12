/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.PersonalAcademico;

import com.mycompany.sistemaacademico.Empleado;

/**
 *
 * @author User
 */
public abstract class PersonalAcademicoo extends Empleado{
    private String dedicacion;

    public PersonalAcademicoo(String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return "PersonalAcademicoo{" + "dedicacion=" + dedicacion + '}';
    }
    
    
    
}
