/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltrabajo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javier.ortiz
 */
//          int y = JOptionPane.showConfirmDialog(
//                    this,
//                    "Estas seguro de querer borrar el curso "+this.listaCursos.getSelectedValue().split(" ")[0]+"?",
//                    "Confirmación de borrado",
//                    JOptionPane.YES_NO_OPTION);
//            if (y == JOptionPane.OK_OPTION) {sentencia a poner}
public class BaseDatosAcademia {

    private String puerto = "3306";
    private String ip = "localhost";
    private String usuario = "root";
    private String passw = "";
    private String db = "";
    private Connection conn = null;

    public BaseDatosAcademia(String ip, String port, String user, String psw, String db) {
        this.puerto = port;
        this.ip = ip;
        this.usuario = user;
        this.passw = psw;
        this.db = db;
        conectar();
        crearDB();
    }

    public BaseDatosAcademia() {
        conectar();
        crearDB();
    }

    public void tirarBD() {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DROP DATABASE Jorge_Pastor_Miguel_Gonzalez_Academia");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void crearDB() {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("create database if not exists Jorge_Pastor_Miguel_Gonzalez_Academia");
            stmt.executeUpdate("use Jorge_Pastor_Miguel_Gonzalez_Academia");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Alumnos("
                    + "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,"
                    + "   nombre VARCHAR(250) NOT NULL,"
                    + "   apellido VARCHAR(250) NOT NULL,"
                    + "   correo VARCHAR(250) NOT NULL,"
                    + "   telefono VARCHAR(250) NOT NULL,"
                    + "   existe INTEGER DEFAULT 0 NOT NULL,"
                    + "   PRIMARY KEY (id)"
                    + ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Cursos("
                    + "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,"
                    + "   nombre VARCHAR(250) NOT NULL,"
                    + "   descripcion VARCHAR(250) NOT NULL,"
                    + "   horas VARCHAR(250) NOT NULL,"
                    + "   existe INTEGER DEFAULT 0 NOT NULL,"
                    + "   PRIMARY KEY (id)"
                    + ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Inscripciones("
                    + "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,"
                    + "   id_alumno INTEGER UNSIGNED DEFAULT '0',"
                    + "   id_curso INTEGER UNSIGNED DEFAULT '0',"
                    + "   fInicio VARCHAR(250) NOT NULL,"
                    + "   fFin VARCHAR(250) DEFAULT 'SIN FINALIZAR' NOT NULL,"
                    + "   calificacion VARCHAR(250)DEFAULT 'NO CALIFICADO' NOT NULL,"
                    + "   existe INTEGER DEFAULT 0 NOT NULL,"
                    + "   PRIMARY KEY (id),"
                    + "   CONSTRAINT fk_alumno_alumnos FOREIGN KEY (id_alumno) REFERENCES Alumnos(id) ON UPDATE CASCADE ON DELETE CASCADE ,"
                    + "   CONSTRAINT fk_curso_cursos FOREIGN KEY (id_curso) REFERENCES Cursos(id) ON UPDATE CASCADE ON DELETE CASCADE "
                    + ");"
            );
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void conectar() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db, this.usuario, this.passw);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void cerrar() throws SQLException {
        if (this.conn != null) {
            if (!this.conn.isClosed()) {
                this.conn.close();
            }
        }
    }

    public String getHoraDATE() {
        String hora = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss").format(Calendar.getInstance().getTime());
        return hora;
    }

    public void insertarAlumno(String nombre, String apellido, String correo, String telefono) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Alumnos( nombre , apellido , correo , telefono ) VALUES ('" + nombre + "' , '" + apellido + "' , '" + correo + "' , '" + telefono + "' );");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarCurso(String nombre, String descripcion, String horas) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Cursos( nombre , descripcion , horas ) VALUES ('" + nombre + "' , '" + descripcion + "' , '" + horas + "' );");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarInscripcion(int id_alumno, int id_curso, String fInicio) {//--mirar como se van a introducir fecha fin y calificacion
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Inscripciones(id_alumno , id_curso , fInicio )VALUES (" + id_alumno + " , " + id_curso + " , '" + fInicio + "' ) ;");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void guardarEnFicheroTextoAlumnos(String dirFichero) {
        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter pw = null;
        try {
            //writer = new FileWriter(fichero);
            writer = new FileWriter(dirFichero, true);//Para añadir sin borrar lo anterior
            bufferedWriter = new BufferedWriter(writer);
            pw = new PrintWriter(bufferedWriter);

            Statement stmt;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String correo = rs.getString(4);
                    String telefono = rs.getString(5);
                    String existe = rs.getString(6);
                    pw.write(id + "," + nombre + "," + apellido + "," + correo + "," + telefono + "," + existe + "\n");
                }
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void guardarEnFicheroTextoCursos(String dirFichero) {
        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter pw = null;
        try {
            //writer = new FileWriter(fichero);
            writer = new FileWriter(dirFichero, true);//Para añadir sin borrar lo anterior
            bufferedWriter = new BufferedWriter(writer);
            pw = new PrintWriter(bufferedWriter);

            Statement stmt;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String descripcion = rs.getString(3);
                    String horas = rs.getString(4);
                    String existe = rs.getString(5);
                    pw.write(id + "," + nombre + "," + descripcion + "," + horas + "," + existe + "\n");
                }
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void guardarEnFicheroTextoInscripciones(String dirFichero) {
        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter pw = null;
        try {
            //writer = new FileWriter(fichero);
            writer = new FileWriter(dirFichero, true);//Para añadir sin borrar lo anterior
            bufferedWriter = new BufferedWriter(writer);
            pw = new PrintWriter(bufferedWriter);

            Statement stmt;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Incripciones ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso = rs.getString(3);
                    String fec_inicio = rs.getString(4);
                    String fec_fin = rs.getString(5);
                    String calificacion = rs.getString(6);
                    String existe = rs.getString(7);
                    pw.write(id + "," + id_alumno + "," + id_curso + "," + fec_inicio + "," + fec_fin + "," + calificacion + "," + existe + "\n");
                }
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public String leerDatosAlumnosExistente() {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos WHERE Alumnos.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String correo = rs.getString(4);
                String telefono = rs.getString(5);
                cadenaDatos = cadenaDatos + (id + "," + nombre + "," + apellido + "," + correo + "," + telefono + "\n");
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String leerDatosCursosExistente() {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos WHERE Cursos.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                String horas = rs.getString(4);
                cadenaDatos = cadenaDatos + (id + "," + nombre + "," + descripcion + "," + horas + "\n");
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String leerDatosInscripcionesExistente() {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Incripciones WHERE Inscripciones.existe=0;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fec_inicio = rs.getString(4);
                String fec_fin = rs.getString(5);
                String calificacion = rs.getString(5);
                cadenaDatos = cadenaDatos + (id + "," + id_alumno + "," + id_curso + "," + fec_inicio + "," + fec_fin + "," + calificacion + "\n");
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayAlumnosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String correo = rs.getString(4);
                String telefono = rs.getString(5);
                arrayDatos.add(id + "," + nombre + "," + apellido + "," + correo + "," + telefono);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayCursosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.* FROM Cursos WHERE Cursos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                String horas = rs.getString(4);
                arrayDatos.add(id + "," + nombre + "," + descripcion + "," + horas);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesAlumnosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones , Alumnos WHERE Inscripciones.existe=0 AND Alumnos.id=Inscripciones.id_alumno AND Alumnos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesCursosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones , Cursos WHERE Inscripciones.existe=0 AND Inscripciones.id_curso=Cursos.id AND Cursos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayAlumnosNoExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.existe='1'  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String correo = rs.getString(4);
                String telefono = rs.getString(5);
                arrayDatos.add(id + "," + nombre + "," + apellido + "," + correo + "," + telefono);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayCursosNoExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.* FROM Cursos WHERE Cursos.existe='1'  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                String horas = rs.getString(4);
                arrayDatos.add(id + "," + nombre + "," + descripcion + "," + horas);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesNoExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesAlumnosNoExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones , Alumnos WHERE Inscripciones.existe=0 AND Alumnos.id=Inscripciones.id_alumno AND Alumnos.existe=1  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayInscripcionesCursosNoExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones , Cursos WHERE Inscripciones.existe=0 AND Inscripciones.id_cursos=Cursos.id AND Cursos.existe=1  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public void eliminarDatosAlumnnos(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Alumno WHERE id = " + id + ");");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarDatosCursos(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Cursos WHERE id = " + id + ");");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarDatosInscripciones(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Inscripciones WHERE id = " + id + ");");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String leerDatosUnAlumnoExistente(int id_alumno) {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.id=" + id_alumno + " AND Alumnos.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String correo = rs.getString(4);
                String telefono = rs.getString(5);
                cadenaDatos = (id + "," + nombre + "," + apellido + "," + correo + "," + telefono);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String leerDatosUnCursoExistente(int id_curso) {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos WHERE Cursos.id=" + id_curso + " AND Cursos.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                String horas = rs.getString(4);
                cadenaDatos = cadenaDatos + (id + "," + nombre + "," + descripcion + "," + horas + "\n");
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String leerDatosUnInscripcioneExistente(int id_inscripcion) {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Inscripciones WHERE Inscripciones.id=" + id_inscripcion + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fec_inicio = rs.getString(4);
                String fec_fin = rs.getString(5);
                String calificacion = rs.getString(6);
                cadenaDatos = cadenaDatos + (id + "," + id_alumno + "," + id_curso + "," + fec_inicio + "," + fec_fin + "," + calificacion);
            }

            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String leerInscripcionConAlumnoYCursoQueExista(int id_alumno, int id_curso) {
        Statement stmt;
        String cadenaDatos = "";
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones WHERE Inscripciones.fFin='SIN FINALIZAR' AND Inscripciones.id_curso=" + id_curso + " AND Inscripciones.id_alumno=" + id_alumno + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno1 = rs.getString(2);
                String id_curso1 = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                cadenaDatos = cadenaDatos + (id + "," + id_alumno1 + "," + id_curso1 + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadenaDatos;
    }

    public String[] leerIdTelefonosAlumnosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.id ,Alumnos.telefono FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String telefono = rs.getString(2);
                arrayDatos.add(id + "," + telefono);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreApellidoAlumnosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.id ,Alumnos.nombre,Alumnos.apellido FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + apellido);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombresCursosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.nombre FROM Cursos WHERE Cursos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                arrayDatos.add(id + "," + nombre);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdHorasCursosExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.horas FROM Cursos WHERE Cursos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String horas = rs.getString(2);
                arrayDatos.add(id + "," + horas);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombresInscripcionesExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.id , Inscripciones.id_alumno , Inscripciones.id_cursos FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdId_alumnoNombreId_cursoNombreInscripcionesExistentes() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.id , Inscripciones.id_alumno , Alumnos.nombre , Inscripciones.id_curso , Cursos.nombre FROM Inscripciones , Alumnos , Cursos WHERE Inscripciones.existe=0 AND Inscripciones.fFin='SIN FINALIZAR' AND Inscripciones.id_alumno=Alumnos.id AND Inscripciones.id_curso=Cursos.id  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String alumno_nombre = rs.getString(3);
                String id_curso = rs.getString(4);
                String curso_nombre = rs.getString(5);
                arrayDatos.add(id + "," + id_alumno + "," + alumno_nombre + "," + id_curso + "," + curso_nombre);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreApellidoAlumnosExistentesEnCurso(int id_curso) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.id , Alumnos.nombre , Alumnos.apellido FROM Alumnos , Inscripciones WHERE Alumnos.existe=0 AND Inscripciones.fFin<>'SIN FINALIZAR' AND Inscripciones.id_alumno=Alumnos.id AND Inscripciones.id_curso=" + id_curso + " ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + apellido);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombresCursosExistentesConAlumno(int id_alumno) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.nombre FROM Cursos , Inscripciones WHERE Cursos.existe=0 AND Inscripciones.fFin<>'SIN FINALIZAR' AND Inscripciones.id_curso=Cursos.id AND Inscripciones.id_alumno=" + id_alumno + " ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                arrayDatos.add(id + "," + nombre);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerInscripcionesConAlumnoExistente(int id_alumno) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT  Inscripciones.* FROM Inscripciones , Alumnos WHERE Alumnos.existe=0 AND Inscripciones.id_alumno=" + id_alumno + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno1 = rs.getString(2);
                String id_curso1 = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno1 + "," + id_curso1 + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerInscripcionesConCursoExistente(int id_curso) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT  Inscripciones.* FROM Inscripciones , Cursos WHERE Cursos.existe=0 AND Inscripciones.id_curso=" + id_curso + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno1 = rs.getString(2);
                String id_curso1 = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno1 + "," + id_curso1 + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerInscripcionesConAlumnoNoExistente(int id_alumno) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT  Inscripciones.* FROM Inscripciones , Alumnos WHERE Alumnos.existe=1 AND Inscripciones.id_alumno=" + id_alumno + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno1 = rs.getString(2);
                String id_curso1 = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno1 + "," + id_curso1 + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerInscripcionesConCursoNoExistente(int id_curso) {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT Inscripciones.* FROM Inscripciones , Cursos WHERE Cursos.existe=1 AND Inscripciones.id_curso=" + id_curso + " AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno1 = rs.getString(2);
                String id_curso1 = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                arrayDatos.add(id + "," + id_alumno1 + "," + id_curso1 + "," + fInicio + "," + fFin + "," + calificacion);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreApellidoAlumnosExistentesInscritos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT Alumnos.id , Alumnos.nombre , Alumnos.apellido FROM Alumnos , Inscripciones WHERE Alumnos.existe=0 AND Alumnos.id=Inscripciones.id_alumno AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + apellido);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreHorasCursosExistentesInscritos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT Cursos.id , Cursos.nombre , Cursos.horas FROM Cursos , Inscripciones WHERE Cursos.existe=0 AND Cursos.id=Inscripciones.id_curso AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String horas = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + horas);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreApellidoAlumnosNoExistentesInscritos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT Alumnos.id , Alumnos.nombre , Alumnos.apellido FROM Alumnos , Inscripciones WHERE Alumnos.existe=1 AND Alumnos.id=Inscripciones.id_alumno AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + apellido);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerIdNombreHorasCursosNoExistentesInscritos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT Cursos.id , Cursos.nombre , Cursos.horas FROM Cursos , Inscripciones WHERE Cursos.existe=1 AND Cursos.id=Inscripciones.id_curso AND Inscripciones.existe=0 ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String horas = rs.getString(3);
                arrayDatos.add(id + "," + nombre + "," + horas);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public boolean confirmarAlumno(String nombre, String apellido, String correo, String telefono) {
        Statement stmt;
        boolean confirmar = false;
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(Alumnos.id) FROM Alumnos WHERE Alumnos.nombre='" + nombre + "' AND Alumnos.apellido='" + apellido + "' AND Alumnos.correo='" + correo + "' AND Alumnos.telefono='" + telefono + "';");//SELECT
            while (rs.next()) {
                String ids = rs.getString(1);
                if (ids.equals("1")) {
                    confirmar = true;
                } else {
                    confirmar = false;
                }
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return confirmar;
    }

    public boolean confirmarCurso(String nombre, String descripcion, String horas) {
        Statement stmt;
        boolean confirmar = false;
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(Cursos.id) FROM Cursos WHERE Cursos.descripcion='" + descripcion + "' AND Cursos.horas='" + horas + "';");//SELECT
            while (rs.next()) {
                String ids = rs.getString(1);
                if (ids.equals("1")) {
                    confirmar = true;
                } else {
                    confirmar = false;
                }
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return confirmar;
    }

    public boolean confirmarInscripcion(int id_alumno, int id_curso, String fInicio) {
        Statement stmt;
        boolean confirmar = false;
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(Inscripciones.id) FROM Inscripciones WHERE Inscripciones.id_alumno=" + id_alumno + " AND Inscripciones.id_curso=" + id_curso + " AND Inscripciones.fInicio='" + fInicio + "' ;");//SELECT
            while (rs.next()) {
                String ids = rs.getString(1);
                if (ids.equals("1")) {
                    confirmar = true;
                } else {
                    confirmar = false;
                }
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return confirmar;
    }

    public void modificarAlumno(int id, String nombre, String apellido, String correo, String telefono) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Alumnos SET nombre='" + nombre + "'," + "apellido='" + apellido + "'," + "correo='" + correo + "'," + " telefono='" + telefono + "' WHERE id='" + id + "';");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarCursos(int id, String nombre, String descripcion, String horas) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Cursos SET nombre='" + nombre + "'," + "descripcion='" + descripcion + "'," + "horas='" + horas + "' WHERE id='" + id + "';");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarInscripciones(int id, int id_alumno, int id_curso, String fFin, String calificacion) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Inscripciones SET id_alumno=" + id_alumno + " , " + "id_curso=" + id_curso + " , " + "fFin='" + fFin + "' , " + "calificacion='" + calificacion + "' WHERE id=" + id + ";");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarExistenciaAlumno(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Alumnos SET existe=1 WHERE id=" + id + ";");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarExistenciaCursos(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Cursos SET existe=1 WHERE id=" + id + ";");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarExistenciaInscripcione(int id) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Inscripciones SET existe=1 WHERE id=" + id + ";");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //estos metodos son para ti jorge
    public String[] leerStringArrayTodasAlumnos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String correo = rs.getString(4);
                String telefono = rs.getString(5);
                String existe = rs.getString(6);
                arrayDatos.add(id + "," + nombre + "," + apellido + "," + correo + "," + telefono + "," + existe);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayTodasCursos() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Cursos.* FROM Cursos ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String descripcion = rs.getString(3);
                String horas = rs.getString(4);
                String existe = rs.getString(5);
                arrayDatos.add(id + "," + nombre + "," + descripcion + "," + horas + "," + existe);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public String[] leerStringArrayTodasInscripciones() {
        Statement stmt;
        ArrayList<String> arrayDatos = new ArrayList();
        try {
            stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones   ;");//SELECT
            while (rs.next()) {
                String id = rs.getString(1);
                String id_alumno = rs.getString(2);
                String id_curso = rs.getString(3);
                String fInicio = rs.getString(4);
                String fFin = rs.getString(5);
                String calificacion = rs.getString(6);
                String existe = rs.getString(7);
                arrayDatos.add(id + "," + id_alumno + "," + id_curso + "," + fInicio + "," + fFin + "," + calificacion + "," + existe);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String[] cadenaDatos = new String[arrayDatos.size()];
        for (int i = 0; i < arrayDatos.size(); i++) {
            cadenaDatos[i] = arrayDatos.get(i);
        }
        return cadenaDatos;
    }

    public void insertarTodasAlumno(int id, String nombre, String apellido, String correo, String telefono, int existe) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Alumnos( id , nombre , apellido , correo , telefono , existe ) VALUES (" + id + " , '" + nombre + "' , '" + apellido + "' , '" + correo + "' , '" + telefono + "' , '" + existe + "' );");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarTodasCurso(int id, String nombre, String descripcion, String horas, int existe) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Cursos( id , nombre , descripcion , horas , existe ) VALUES (" + id + " , '" + nombre + "' , '" + descripcion + "' , '" + horas + "' , '" + existe + "' );");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarTodasInscripcion(int id, int id_alumno, int id_curso, String fInicio, String fFin, String calificacion, int existe) {//--mirar como se van a introducir fecha fin y calificacion
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Inscripciones(id , id_alumno , id_curso , fInicio , fFin , calificacion , existe )VALUES (" + id + " , " + id_alumno + " , " + id_curso + " , '" + fInicio + "' , '" + fFin + "' , '" + calificacion + "' , '" + existe + "' ) ;");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
