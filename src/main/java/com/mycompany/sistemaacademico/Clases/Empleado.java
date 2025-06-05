/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Clases;

/**
 *
 * @author User
 */
public class Empleado extends PersonaInstitucional{
    //atributos
    private double sueldo;
    
    //metodos

    public Empleado(double Sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String agregarEmpleado(){
        return "";
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo: " + sueldo + super.toString()+ '}';
    }
    
}
