/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author yuripastorovic
 */
public class Academia implements Serializable {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Curso> cursos;
    private ArrayList<Inscripcion> inscripciones;

    public Academia() {
        this.alumnos = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

}
