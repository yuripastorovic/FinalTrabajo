/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jorge & Miguel
 */
/**
 * Clase serializable Academia, Academia guarda los ArrayList de alumnos, cursos
 * e incripciones
 *
 * @author yuripastorovic
 */
public class Academia implements Serializable {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Curso> cursos;
    private ArrayList<Inscripcion> inscripciones;

    /**
     * Constructor de la clase Academia
     */
    public Academia() {
        this.alumnos = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     *
     * @param alumnos
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     *
     * @param cursos
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    /**
     *
     * @param inscripciones
     */
    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

}
