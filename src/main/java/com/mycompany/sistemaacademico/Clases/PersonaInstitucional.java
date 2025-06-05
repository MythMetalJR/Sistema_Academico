/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Clases;

/**
 *
 * @author User
 */
public class PersonaInstitucional extends Persona{
    //atributos
    private String correoInstitucional;
    
    //

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public String agregarPersonaInstitucional(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" + "correoInstitucional: " + correoInstitucional + super.toString()+ '}';
    }
    
}
