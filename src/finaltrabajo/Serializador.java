/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yuripastorovic
 */
public class Serializador implements Serializable {

    private Herramientas h1 = new Herramientas();
    Academia ac = new Academia();
    private BaseDatosAcademia bd = new BaseDatosAcademia();

    public void uploadLocal() {
        this.ac = this.leerDatos1("copi.test");
        bd.tirarBD();
        bd = new BaseDatosAcademia();
        if (ac != null) {
            if (ac.getAlumnos().size() != 0) {
                for (int i = 0; i < ac.getAlumnos().size(); i++) {
                    int id = ac.getAlumnos().get(i).getId();
                    String nombre = ac.getAlumnos().get(i).getNombre();
                    String apellido = ac.getAlumnos().get(i).getApellido();
                    String correo = ac.getAlumnos().get(i).getCorreo();
                    String tlf = ac.getAlumnos().get(i).getTelefono();
                    int existe = ac.getAlumnos().get(i).getMatriculado();
                    bd.insertarTodasAlumno(id, nombre, apellido, correo, tlf, existe);
                }
            }
            if (ac.getCursos().size() != 0) {
                for (int i = 0; i < ac.getCursos().size(); i++) {
                    int id = ac.getCursos().get(i).getId();
                    String nombre = ac.getCursos().get(i).getNombre();
                    String descr = ac.getCursos().get(i).getDescripcion();
                    int horas = ac.getCursos().get(i).getHoras();
                    int existe = ac.getCursos().get(i).getExiste();
                    bd.insertarTodasCurso(id, nombre, descr, "" + horas, existe);

                }
            }
            if (ac.getInscripciones().size() != 0) {
                for (int i = 0; i < ac.getInscripciones().size(); i++) {
                    int id = ac.getInscripciones().get(i).getId();
                    int idAlum = ac.getInscripciones().get(i).getAlumno().getId();
                    int idCurso = ac.getInscripciones().get(i).getAlumno().getId();
                    String fechaI = ac.getInscripciones().get(i).getfInicio();
                    String fechaF = ac.getInscripciones().get(i).getfFin();
                    String nota = ac.getInscripciones().get(i).getNota();
                    int existe = ac.getInscripciones().get(i).getExiste();
                    bd.insertarTodasInscripcion(id, idAlum, idCurso, fechaI, fechaF, "" + nota, existe);
                }
            }
            h1.popUp1("AJUSTES LOCAL", "La base de datos ha sido actualizada.", "OK", "favicon-32x32.png");
            System.out.println("La base de datos ha sido actualizada.");
        } else {
            int respuesta = h1.popUp2("AJUSTES LOCAL", "NO EXISTE UNA COPIA LOCAL,\nCARGAR DAROS BORRARA LA BASE DE DATOS\nBorrar datos", "SI", "NO", "favicon-32x32.png");
            if (respuesta == 0) {
                h1.popUp1("AJUSTES LOCAL", "La base de datos ha sido borrada", "OK", "favicon-32x32.png");
            }

        }

    }

    public void copiaLocal() {
        for (int i = 0; i < bd.leerStringArrayTodasAlumnos().length; i++) {    ///////////////////////se nececita un ArrayTodosLosAlumnos 
            String dateAlum[] = bd.leerStringArrayTodasAlumnos();
            String partes[] = dateAlum[i].split(",");
            int id = Integer.parseInt(partes[0]);
            String nombre = partes[1];
            String apellido = partes[2];
            String correo = partes[3];
            String telefono = partes[4];
            int existe = Integer.parseInt(partes[5]);
            Alumno a1 = new Alumno(id, nombre, apellido, telefono, correo, existe);
            ac.getAlumnos().add(a1);
        }
        for (int i = 0; i < bd.leerStringArrayTodasCursos().length; i++) {    ///////////////////////se nececita un ArrayTodosLosCursos
            String dateCurs[] = bd.leerStringArrayTodasCursos();
            String partes[] = dateCurs[i].split(",");
            int id = Integer.parseInt(partes[0]);
            String nombre = partes[1];
            String descr = partes[2];
            int horas = Integer.parseInt(partes[3]);
            int existe = Integer.parseInt(partes[4]);
            Curso c1 = new Curso(id, nombre, descr, horas, existe);;
            ac.getCursos().add(c1);
        }
        for (int i = 0; i < bd.leerStringArrayTodasInscripciones().length; i++) {    ///////////////////////se nececita un ArrayTodosLasInscripciones
            String dateCurs[] = bd.leerStringArrayTodasInscripciones();
            String partes[] = dateCurs[i].split(",");
            int id = Integer.parseInt(partes[0]);
            int idAlum = Integer.parseInt(partes[1]);
            Alumno selecAlum = null;
            for (int j = 0; j < ac.getAlumnos().size(); j++) {
                if (ac.getAlumnos().get(j).getId() == idAlum) {
                    selecAlum = ac.getAlumnos().get(j);
                }
            }
            int idCurso = Integer.parseInt(partes[2]);
            Curso selecCurso = null;
            for (int j = 0; j < ac.getCursos().size(); j++) {
                if (ac.getCursos().get(j).getId() == idCurso) {
                    selecCurso = ac.getCursos().get(j);
                }
            }
            String fechaI = partes[3];
            String fechaF = partes[4];
            String nota = partes[5];
            int existe = Integer.parseInt(partes[6]);
            //exts
            Inscripcion i1 = new Inscripcion(id, selecAlum, selecCurso, fechaI, fechaF, nota, existe);;
            ac.getInscripciones().add(i1);
        }
        this.escribirDatos(ac, "copi.test");

        System.out.println("Coplia local generada correctamente");

    }

    public void escribirDatos(Academia academia, String dirFichero) {
        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOut = null;
        BufferedOutputStream bufOut = null;
        ObjectOutputStream objOut = null;
        try {
            fileOut = new FileOutputStream(dirFichero);
            bufOut = new BufferedOutputStream(fileOut);
            objOut = new ObjectOutputStream(bufOut);
            objOut.writeObject(academia);///////////////////////////////////////////////////////
            System.out.println("los datos se han copiado exitosamente en: " + dirFichero);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                objOut.close();
                bufOut.close();
                fileOut.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public Academia leerDatos1(String dirFichero) {

        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } else {
            FileInputStream fileIn = null;
            BufferedInputStream bufIn = null;
            ObjectInputStream objIn = null;
            Academia academia = null;
            try {
                fileIn = new FileInputStream(dirFichero);
                bufIn = new BufferedInputStream(fileIn);
                objIn = new ObjectInputStream(bufIn);
                academia = (Academia) objIn.readObject();/////////////////////////////
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    objIn.close();
                    bufIn.close();
                    fileIn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            return academia;
        }
    }

}
