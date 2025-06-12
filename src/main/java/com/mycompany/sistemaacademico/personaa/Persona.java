/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.personaa;

/**
 *
 * @author User
 */
public abstract class Persona {
    private int id;
    private String nombre;
    private String correoPersonal;
    private String cedula;
    //constructor

    public Persona(int id, String nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }
    
   abstract boolean verificarCedula();
    
    @Override
    public String toString() {
        return "Persona{" + "id: " + id + ", nombre: " + nombre + ", correoPersonal: " + correoPersonal + ", cedula: " + cedula + '}';
    }
    abstract boolean verificarCedeula();
}
