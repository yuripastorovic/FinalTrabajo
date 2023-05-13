/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltrabajo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javier.ortiz
 */
public class BaseDatosAcademia {
    
    private String puerto = "3307";
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
    }
    
    public BaseDatosAcademia(){
        conectar();
    }
    
    public void crearDB(){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("create database if not exists Jorge_Pastor_Miguel_Gonzalez_Academia");
            stmt.executeUpdate("use academia");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Alumnos(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   nombre VARCHAR(25) NOT NULL," +
                "   apellido VARCHAR(25) NOT NULL," +
                "   correo VARCHAR(25) NOT NULL,"+
                "   telefono VARCHAR(25) NOT NULL,"+
                "   PRIMARY KEY (id)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Cursos(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   nombre VARCHAR(25) NOT NULL," +
                "   descripcion VARCHAR(25) NOT NULL," +
                "   horas VARCHAR(25) NOT NULL,"+
                "   PRIMARY KEY (id)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Inscripciones(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   id_alumno INTEGER DEFAULT '0'," +
                "   id_curso INTEGER DEFAULT '0'," +
                "   fInicio DATE DEFAULT GETDATE() NOT NULL,"+
                "   fFin DATE DEFAULT NOT NULL,"+
                "   calificacion VARCHAR(25)DEFAULT 'NO CALIFICADO' NOT NULL,"+
                "   PRIMARY KEY (id)" +
                "   CONSTRAINT fk_alumno_alumnos FOREIGN KEY(id_alumno)REFERENCES id(Alumnos) ON UPDATE CASCADE ON DELETE SET DEFAULT" +
                "   CONSTRAINT fk_curso_cursos FOREIGN KEY(id_curso)REFERENCES id(Cursos) ON UPDATE CASCADE ON DELETE SET DEFAULT" +
                ");"
                /* no se como hacer esta mierda
                stmt.executeUpdate("DELIMITER |"+
                    "CREATE TRIGER alumnoBaja BEFORE DELETE ON Alumnos"+
                    "FOR EACH ROW"+
                    "BEGIN"+
                    "DECLARE ID INTEGER;"+
                    "SET ID=(SELECT Alumnos.id FROM Alumnos;"+
                    "DECLARE ID INTEGER;"+
                    "DECLARE ID INTEGER;"+
                    "END;"+
                    "DELIMITER |"+
                */
            );
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
     
    public void conectar(){
        try {  
            Class.forName("org.mariadb.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mariadb://"+this.ip+":"+this.puerto+"/"+this.db, this.usuario, this.passw);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void cerrar() throws SQLException{
        if(this.conn!=null){
            if(!this.conn.isClosed()){
                this.conn.close();
            }   
        }
    }
    
    public void insertarAlumno(String nombre, String apellido, String correo, String telefono){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Alumnos VALUES ("+nombre+","+apellido+","+correo+","+telefono+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void insertarCurso(String nombre, String descripcion, String horas){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Cursos VALUES ("+nombre+","+descripcion+","+horas+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void insertarInscripcion(int id_alumno, int id_curso, String fInicio, String fFin,String calificacion){//--mirar como se van a introducir fecha fin y calificacion
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("INSERT INTO Cursos VALUES ("+id_alumno+","+id_curso+","+fInicio+","+fFin+","+calificacion+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
    public void guardarEnFicheroTextoAlumnos(String dirFichero){
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
                    pw.write(id+","+nombre+","+apellido+","+correo+","+telefono+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }            
        }
                
    }
    public void guardarEnFicheroTextoCursos(String dirFichero){
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
                    pw.write(id+","+nombre+","+descripcion+","+horas+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }            
        }
                
    }
    public void guardarEnFicheroTextoInscripcion(String dirFichero){
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
                    String calificacion = rs.getString(5);
                    pw.write(id+","+id_alumno+","+id_curso+","+fec_inicio+","+fec_fin+","+calificacion+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }            
        }
                
    }
    
    public String leerDatosAlumnos(){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String correo = rs.getString(4);
                    String telefono = rs.getString(5);
                    cadenaDatos=cadenaDatos+(id+","+nombre+","+apellido+","+correo+","+telefono+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    public String leerDatosCursos(){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String descripcion = rs.getString(3);
                    String horas = rs.getString(4);
                    cadenaDatos=cadenaDatos+(id+","+nombre+","+descripcion+","+horas+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    public String leerDatosInscripciones(){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Incripciones ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso = rs.getString(3);
                    String fec_inicio = rs.getString(4);
                    String fec_fin = rs.getString(5);
                    String calificacion = rs.getString(5);
                    cadenaDatos=cadenaDatos+(id+","+id_alumno+","+id_curso+","+fec_inicio+","+fec_fin+","+calificacion+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    
    public void eliminarDatosAlumnnos(int id){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Alumno WHERE id = "+id+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public void eliminarDatosCursos(int id){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Cursos WHERE id = "+id+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public void eliminarDatosInscripciones(int id){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("DELETE FROM Inscripciones WHERE id = "+id+");");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public String leerDatosUnAlumnos(int id_alumno){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos WHERE Alumnos.id="+id_alumno+" ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String correo = rs.getString(4);
                    String telefono = rs.getString(5);
                    cadenaDatos=cadenaDatos+(id+","+nombre+","+apellido+","+correo+","+telefono+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    public String leerDatosUnCursos(int id_curso){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos WHERE Cursos.id="+id_curso+" ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String descripcion = rs.getString(3);
                    String horas = rs.getString(4);
                    cadenaDatos=cadenaDatos+(id+","+nombre+","+descripcion+","+horas+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    public String leerDatosUnInscripciones(int id_inscripcion){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Inscripciones WHERE Inscripciones.id="+id_inscripcion+" ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso = rs.getString(3);
                    String fec_inicio = rs.getString(4);
                    String fec_fin = rs.getString(5);
                    String calificacion = rs.getString(5);
                    cadenaDatos=cadenaDatos+(id+","+id_alumno+","+id_curso+","+fec_inicio+","+fec_fin+","+calificacion+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    
    public String[] leerNombresAlumnos(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Alumnos.id ,Alumnos.nombre FROM Alumnos  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    arrayDatos.add(id +" "+ nombre);
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            String[] cadenaDatos= new String[arrayDatos.size()];
            for (int i = 0; i <arrayDatos.size(); i++) {
            cadenaDatos[i]=arrayDatos.get(i);
        }
            return cadenaDatos;
    }
    public String[] leerNombresCursos(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.nombre FROM Cursos  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    arrayDatos.add(id+" "+nombre);
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            String[] cadenaDatos= new String[arrayDatos.size()];
            for (int i = 0; i <arrayDatos.size(); i++) {
            cadenaDatos[i]=arrayDatos.get(i);
        }
            return cadenaDatos;
    }
    public String[] leerNombresInscripciones(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Inscripciones.id , Inscripciones.id_alumno , Inscripciones.id_cursos FROM Inscripciones  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso = rs.getString(2);
                    arrayDatos.add(id+" "+id_alumno+" "+id_curso);
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            String[] cadenaDatos= new String[arrayDatos.size()];
            for (int i = 0; i <arrayDatos.size(); i++) {
            cadenaDatos[i]=arrayDatos.get(i);
        }
            return cadenaDatos;
    }
    
    //--estos metodos tiene que comprobar mas cosas aparte del id 
    public boolean confirmarAlumno(int id){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Alumnos.id) FROM Alumnos WHERE Alumnos.id="+id+" ;");//SELECT
                while (rs.next()) {
                    String ids = rs.getString(1);
                    if(ids.equals("1")){
                        confirmar=true;
                    }else{
                        confirmar=false;
                    }
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return confirmar;
    }
    public boolean confirmarCurso(int id){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Cursos.id) FROM Cursos WHERE Cursos.id="+id+" ;");//SELECT
                while (rs.next()) {
                    String ids = rs.getString(1);
                    if(ids.equals("1")){
                        confirmar=true;
                    }else{
                        confirmar=false;
                    }
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return confirmar;
    }
    public boolean confirmarInscripcion(int id){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Inscripciones.id) FROM Inscripciones WHERE Inscripciones.id="+id+" ;");//SELECT
                while (rs.next()) {
                    String ids = rs.getString(1);
                    if(ids.equals("1")){
                        confirmar=true;
                    }else{
                        confirmar=false;
                    }
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return confirmar;
    }
    
    public void modificarAlumno(int id ,String nombre, String apellido, String correo, String telefono){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Alumnos SET nombre="+nombre+","+"apellido="+apellido+","+"correo="+correo+","+" telefono="+telefono+" WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void modificarCursos(int id ,String nombre, String descripcion, String horas){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Cursos SET nombre="+nombre+","+"descripcion="+descripcion+","+"horas="+horas+" WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void modificarInscripciones(int id ,int id_alumno, int id_curso, String fInicio, String fFin, String calificacion){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Inscripciones SET id_alumno="+id_alumno+","+"id_curso="+id_curso+","+"fInicio="+fInicio+","+"fFin="+fFin+","+"calificacion="+calificacion+" WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
}
