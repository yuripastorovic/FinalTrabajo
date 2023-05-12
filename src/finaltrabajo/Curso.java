/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

/**
 *
 * @author Jorge
 */
public class Curso {

    private int id;
    private String nombre;
    private String descripcion;
    private int horas;

    public Curso(int id, String nombre, String descripcion, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
    }

    public String toCSV() {
        return id + "," + nombre + "," + descripcion + "," + horas;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horas=" + horas + '}';
    }

}
