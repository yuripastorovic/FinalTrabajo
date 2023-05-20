/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.Serializable;

/**
 *
 * @author Jorge
 */
public class Alumno implements Serializable {

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private int existe;

    public Alumno(int id, String nombre, String apellido, String telefono, String correo, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.existe = valor;
    }

    public String toCSV() {
        return id + "," + nombre + "," + apellido + "," + telefono + "," + correo + "," + existe;
    }

    public int getMatriculado() {
        return existe;
    }

    public void setMatriculado(int matriculado) {
        this.existe = matriculado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

}
