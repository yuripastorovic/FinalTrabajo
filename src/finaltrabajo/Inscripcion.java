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
public class Inscripcion implements Serializable {

    private int id;
    private Alumno alumno;
    private Curso curso;
    private String fInicio;
    private String fFin;
    private String nota;
    private int existe;

    public Inscripcion(int id, Alumno alumno, Curso curso, String fInicio, String fFin, String nota, int valor) {
        this.id = id;
        this.alumno = alumno;
        this.curso = curso;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.nota = nota;
        this.existe = valor;
    }

    /**
     * Metodo q permite devolver los datos de un alumno en formato CSV
     *
     * @return
     */
    public String toCSV() {
        return id + "," + alumno.getId() + "," + curso.getId() + "," + fInicio + "," + fFin + "," + nota + "," + existe;
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
     * @return
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     *
     * @return
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     *
     * @return
     */
    public String getfInicio() {
        return fInicio;
    }

    /**
     *
     * @return
     */
    public String getfFin() {
        return fFin;
    }

    /**
     *
     * @return
     */
    public String getNota() {
        return nota;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Inscripcion{" + "id=" + id + ", alumno=" + alumno + ", curso=" + curso + ", fInicio=" + fInicio + ", fFin=" + fFin + ", nota=" + nota + '}';
    }

}
