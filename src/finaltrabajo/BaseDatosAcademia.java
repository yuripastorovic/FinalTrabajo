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
    
    public BaseDatosAcademia(){
        conectar();
        crearDB();
    }
    
    public void crearDB(){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("create database if not exists Jorge_Pastor_Miguel_Gonzalez_Academia");
            stmt.executeUpdate("use Jorge_Pastor_Miguel_Gonzalez_Academia");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Alumnos(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   nombre VARCHAR(25) NOT NULL," +
                "   apellido VARCHAR(25) NOT NULL," +
                "   correo VARCHAR(25) NOT NULL,"+
                "   telefono VARCHAR(25) NOT NULL,"+
                "   existe BIT DEFAULT 0 NOT NULL,"+
                "   PRIMARY KEY (id)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Cursos(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   nombre VARCHAR(25) NOT NULL," +
                "   descripcion VARCHAR(25) NOT NULL," +
                "   horas VARCHAR(25) NOT NULL,"+
                "   existe BIT DEFAULT 0 NOT NULL,"+    
                "   PRIMARY KEY (id)" +
                ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Inscripciones(" +
                "   id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL," +
                "   id_alumno INTEGER UNSIGNED DEFAULT '0'," +
                "   id_curso INTEGER UNSIGNED DEFAULT '0'," +
                "   fInicio VARCHAR(25) DEFAULT 'GETDATE()' NOT NULL,"+
                "   fFin VARCHAR(25) DEFAULT 'GETDATE()' NOT NULL,"+
                "   calificacion VARCHAR(25)DEFAULT 'NO CALIFICADO' NOT NULL,"+
                "   existe BIT DEFAULT 0 NOT NULL,"+     
                "   PRIMARY KEY (id)," +
                "   CONSTRAINT fk_alumno_alumnos FOREIGN KEY (id_alumno) REFERENCES Alumnos(id) ON UPDATE CASCADE ON DELETE CASCADE ," +
                "   CONSTRAINT fk_curso_cursos FOREIGN KEY (id_curso) REFERENCES Cursos(id) ON UPDATE CASCADE ON DELETE CASCADE " +
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
            stmt.executeUpdate("INSERT INTO Alumnos( nombre , apellido , correo , telefono ) VALUES ('"+nombre+"' , '"+apellido+"' , '"+correo+"' , '"+telefono+"' );");
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
            stmt.executeUpdate("INSERT INTO Cursos( nombre , descripcion , horas ) VALUES ('"+nombre+"' , '"+descripcion+"' , '"+horas+"' );");
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
            stmt.executeUpdate("INSERT INTO Cursos (id_alumno,id_curso)VALUES ('"+id_alumno+"','"+id_curso+"');");
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
                    String existe = rs.getString(6);
                    pw.write(id+","+nombre+","+apellido+","+correo+","+telefono+","+existe+"\n");
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
                    String existe = rs.getString(5);
                    pw.write(id+","+nombre+","+descripcion+","+horas+","+existe+"\n");
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
                    String calificacion = rs.getString(6);
                    String existe = rs.getString(7);
                    pw.write(id+","+id_alumno+","+id_curso+","+fec_inicio+","+fec_fin+","+calificacion+","+existe+"\n");
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
    
    public String leerDatosAlumnosExistente(){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos WHERE Alumnos.existe=0 ;");//SELECT
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
    public String leerDatosCursosExistente(){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos WHERE Cursos.existe=0 ;");//SELECT
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
    public String leerDatosInscripcionesExistente(){
        Statement stmt;
        String cadenaDatos="";
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
                    cadenaDatos=cadenaDatos+(id+","+id_alumno+","+id_curso+","+fec_inicio+","+fec_fin+","+calificacion+"\n");
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    
    public String[] leerStringArrayAlumnosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.existe='0'  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido  = rs.getString(3);
                    String correo  = rs.getString(4);
                    String telefono  = rs.getString(5);
                    arrayDatos.add(id+","+ nombre+","+apellido + ","+correo+","+telefono);
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
    public String[] leerStringArrayCursosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Cursos.* FROM Cursos WHERE Cursos.existe='0'  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String descripcion  = rs.getString(3);
                    String horas  = rs.getString(4);
                    arrayDatos.add(id+","+ nombre+","+descripcion + ","+horas);
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
    public String[] leerStringArrayInscripcionesExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso  = rs.getString(3);
                    String fInicio  = rs.getString(4);
                    String fFin  = rs.getString(4);
                    String calificacion  = rs.getString(4);
                    arrayDatos.add(id+","+ id_alumno+","+id_curso + ","+fInicio+ ","+fFin+ ","+calificacion);
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
    
    public String[] leerStringArrayAlumnosNoExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Alumnos.* FROM Alumnos WHERE Alumnos.existe='1'  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido  = rs.getString(3);
                    String correo  = rs.getString(4);
                    String telefono  = rs.getString(5);
                    arrayDatos.add(id+","+ nombre+","+apellido + ","+correo+","+telefono);
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
    public String[] leerStringArrayCursosNoExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Cursos.* FROM Cursos WHERE Cursos.existe='1'  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String descripcion  = rs.getString(3);
                    String horas  = rs.getString(4);
                    arrayDatos.add(id+","+ nombre+","+descripcion + ","+horas);
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
    public String[] leerStringArrayInscripcionesNoExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Inscripciones.* FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String id_alumno = rs.getString(2);
                    String id_curso  = rs.getString(3);
                    String fInicio  = rs.getString(4);
                    String fFin  = rs.getString(4);
                    String calificacion  = rs.getString(4);
                    arrayDatos.add(id+","+ id_alumno+","+id_curso + ","+fInicio+ ","+fFin+ ","+calificacion);
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
    
    public String leerDatosUnAlumnoExistente(int id_alumno){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Alumnos WHERE Alumnos.id='"+id_alumno+"' AND Alumnos.existe='0' ;");//SELECT
                while (rs.next()) {
                    System.out.println("hey1");
                            
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String correo = rs.getString(4);
                    String telefono = rs.getString(5);
                    System.out.println("hey2");
                    cadenaDatos=(id+","+nombre+","+apellido+","+correo+","+telefono);
                }
                stmt.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
            return cadenaDatos;
    }
    public String leerDatosUnCursoExistente(int id_curso){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Cursos WHERE Cursos.id="+id_curso+" AND Cursos.existe=0 ;");//SELECT
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
    public String leerDatosUnInscripcioneExistente(int id_inscripcion){
        Statement stmt;
        String cadenaDatos="";
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Inscripciones WHERE Inscripciones.id="+id_inscripcion+" AND Inscripciones.existe=0 ;");//SELECT
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
    
    public String[] leerIdTelefonosAlumnosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Alumnos.id ,Alumnos.telefono FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String telefono = rs.getString(2);
                    arrayDatos.add(id +","+ telefono);
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
    public String[] leerIdNombreApellidoAlumnosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Alumnos.id ,Alumnos.nombre,Alumnos.apellido FROM Alumnos WHERE Alumnos.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apellido  = rs.getString(3);
                    arrayDatos.add(id +","+ nombre+","+apellido);
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
    public String[] leerIdNombresCursosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.nombre FROM Cursos WHERE Cursos.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String nombre = rs.getString(2);
                    arrayDatos.add(id+","+nombre);
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
    public String[] leerIdHorasCursosExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Cursos.id , Cursos.nombre FROM Cursos WHERE Cursos.existe=0  ;");//SELECT
                while (rs.next()) {
                    String id = rs.getString(1);
                    String horas = rs.getString(4);
                    arrayDatos.add(id+","+horas);
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
    public String[] leerIdNombresInscripcionesExistentes(){
        Statement stmt;
        ArrayList<String> arrayDatos=new ArrayList();
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT Inscripciones.id , Inscripciones.id_alumno , Inscripciones.id_cursos FROM Inscripciones WHERE Inscripciones.existe=0  ;");//SELECT
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
    
    public boolean confirmarAlumno(String nombre,String apellido,String correo,String telefono){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Alumnos.id) FROM Alumnos WHERE Alumnos.nombre='"+nombre+"' AND Alumnos.apellido='"+apellido+"' AND Alumnos.correo='"+correo+"' AND Alumnos.telefono='"+telefono+"';");//SELECT
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
    public boolean confirmarCurso(String nombre,String descripcion,String horas){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Cursos.id) FROM Cursos WHERE Cursos.descripcion='"+descripcion+"' AND Cursos.horas='"+horas+"';");//SELECT
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
    public boolean confirmarInscripcion(int id_alumno,int id_curso,String fInicio){
        Statement stmt;
        boolean confirmar=false;
            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(Inscripciones.id) FROM Inscripciones WHERE Inscripciones.id_alumno="+id_alumno+" AND Inscripciones.id_curso="+id_curso+" AND Inscripciones.fInicio="+fInicio+" ;");//SELECT
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
            stmt.executeUpdate("UPDATE Alumnos SET nombre='"+nombre+"',"+"apellido='"+apellido+"',"+"correo='"+correo+"',"+" telefono='"+telefono+"' WHERE id='"+id+"';");
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
    
    public void modificarExistenciaAlumno(int id ){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Alumnos SET existe=1 WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void modificarExistenciaCursos(int id ){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Cursos SET existe=1 WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public void modificarExistenciaInscripcione(int id ){
        Statement stmt;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate("UPDATE Inscripciones SET existe=1 WHERE id="+id+";");
            this.conn.commit();
            stmt.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
}
