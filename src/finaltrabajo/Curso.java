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
 * Clase serializable Curso, Curso guarda los los datos de los alumnos
 *
 */
public class Curso implements Serializable {

    private int id;
    private String nombre;
    private String descripcion;
    private int horas;
    private int existe;

    /**
     * Constructor de la clase Curso
     *
     * @param id
     * @param nombre
     * @param descripcion
     * @param horas
     * @param valor
     */
    public Curso(int id, String nombre, String descripcion, int horas, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.existe = valor;
    }

    /**
     * Metodo q permite devolver los datos de un alumno en formato CSV
     *
     * @return
     */
    public String toCSV() {
        return id + "," + nombre + "," + descripcion + "," + horas + "," + existe;
    }

    /**
     *
     * @return
     */
    public int getExiste() {
        return existe;
    }

    /**
     *
     * @param existe
     */
    public void setExiste(int existe) {
        this.existe = existe;
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
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public int getHoras() {
        return horas;
    }

    /**
     *
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horas=" + horas + '}';
    }
}
