/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Empleado;

/**
 *
 * @author User
 */
public class PersonalServicios extends Empleado{
    //atributos
    private String gremio;
    
    //metodos

    public PersonalServicios(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    public String agregarEstudiante(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonalServicios{" + "gremio: " + gremio + '}';
    }
    
    
}
