/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author esccalpa
 */
public class alumno {
    
   private int numAl;
   private String nombre;
   private String apellido;
   private String ciclo;
   private String curso;

    public alumno(int numAl, String nombre, String apellido) {
        this.numAl = numAl;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumAl() {
        return numAl;
    }
    
    public void setNumAl(int numAl) {
        this.numAl = numAl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "alumno{" + "numAl=" + numAl + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
