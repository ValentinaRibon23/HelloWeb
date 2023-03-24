/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.hello;

/**
 *
 * @author Valentina Contreras
 */
public class NameHandler {
    String nombre;
    String apellido;
    //crear constructor

    public NameHandler() {
        this.nombre=null;
        this.apellido=null;
    }

    public NameHandler(String Nombre, String Apellido) {
        this.nombre = Nombre;
        this.apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }
    
}
