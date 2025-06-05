/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Clases;

/**
 *
 * @author User
 */
public class PersonaInvitado extends Persona{
//construcotr
    public PersonaInvitado(int id, String nombre, String correoPersonal, String cedula){    
        super(id, nombre, correoPersonal, cedula);
    }

    //metodo
    public String agregarPersonaInvitado() {
        return"";
    }



    @Override
    public String toString() {
        return "PersonaInvitado{" +super. toString()+ '}';
    }
    
    }
    
