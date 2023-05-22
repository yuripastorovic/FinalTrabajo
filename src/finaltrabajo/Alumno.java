/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.Serializable;

/**
 *
 * @author Jorge & Miguel
 */
/**
 * Clase serializable Alumno, Alumno guarda los los datos de los alumnos
 *
 */
public class Alumno implements Serializable {

    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private int existe;

    /**
     * Constructor de la clase Alumno
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param telefono
     * @param correo
     * @param valor
     */
    public Alumno(int id, String nombre, String apellido, String telefono, String correo, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.existe = valor;
    }

    /**
     * Metodo q permite devolver los datos de un alumno en formato CSV
     *
     * @return
     */
    public String toCSV() {
        return id + "," + nombre + "," + apellido + "," + telefono + "," + correo + "," + existe;
    }

    /**
     *
     * @return
     */
    public int getMatriculado() {
        return existe;
    }

    /**
     *
     * @param matriculado
     */
    public void setMatriculado(int matriculado) {
        this.existe = matriculado;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

}
