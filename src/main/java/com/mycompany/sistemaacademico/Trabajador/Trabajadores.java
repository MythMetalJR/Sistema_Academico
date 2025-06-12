/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Trabajador;

import com.mycompany.sistemaacademico.Empleado;

/**
 *
 * @author User
 */
public abstract class Trabajadores extends Empleado{
    
    private String gremio;

    public Trabajadores(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "gremio=" + gremio + '}';
    }
    
    
    
    
    
    
    
}
