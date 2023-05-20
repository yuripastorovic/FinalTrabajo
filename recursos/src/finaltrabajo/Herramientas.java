/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltrabajo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author migue
 */
public class Herramientas {

    public void escribirDatos(HashMap coleccion, String dirFichero) {
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
            objOut.writeObject(coleccion);
            System.out.println("los datos se han copiado exitosamente en" + dirFichero);
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

    public HashMap leerDatos1(String dirFichero) {

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
            HashMap<String, Object> coleccion = null;
            try {
                fileIn = new FileInputStream(dirFichero);
                bufIn = new BufferedInputStream(fileIn);
                objIn = new ObjectInputStream(bufIn);
                coleccion = (HashMap<String, Object>) objIn.readObject();
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
            return coleccion;
        }
    }
    
    public void leerDatos2(String dirFichero, Object objeto, Collection coleccion) {
        
        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileInputStream file = new FileInputStream(dirFichero);
                BufferedInputStream buf = new BufferedInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(buf);

                objeto = (Collection) obj.readObject();//en el parentesis Collection hay que poner el tipo de coleccion

                obj.close();
                buf.close();
                file.close();
                System.out.println("Los datos se han recuperado exitosamente");
            } catch (Exception e) {
                System.out.println("Los datos no se han podido recuperar completamente");
                e.printStackTrace();
            }
        }
    }
    
    public String leerFicheroTexto(String dirFichero) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String cadena = "";

        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File(dirFichero);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    cadena = cadena + linea + "\n";
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != br) {
                        br.close();
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        }
        return cadena;
    }
    
    public void escribirFicheroTexto(String dirFichero, String cadena) {

        File fDatos = new File(dirFichero);
        if (!(fDatos.exists())) {
            try {
                File comprobacion = new File(dirFichero);
                comprobacion.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(dirFichero);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println(cadena);
            pw.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != pw) {
                    pw.close();
                }
                pw.close();
                fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
    
    public void conexionSQL(String dirFichero){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");//NO SE TOCA
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/","root",""); //ESTA LINEA SE ENCARGA DE CONECTARSE A LA BASE DE DATOS
            
            Statement stmt=conn.createStatement();
            ResultSet rs ;
            
            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File(dirFichero);//EL FICHERO CON LOS DATOS PARA INICIAR LA BASE DE DATOS SOLO HAY QUE CAMBIAR "reservasBase.txt"
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
                // Lectura del fichero, si vamos a hacer un bucle no es necesario
                String linea=leerFicheroTexto(dirFichero);
                //aqui cargamos todo el archivo de texto de una 
                stmt.executeQuery(linea);//select basicamente el comando que ejecutamos en cmd
                
                /*
                while ((linea = br.readLine()) != null) {//en este bucle vamos insertando cada linea del documento de texto 
                    stmt.executeQuery(linea);//select basicamente el comando que ejecutamos en cmd
                }
                */
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != br) {
                        br.close();
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            conn.commit();
            conn.close();
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void escribir(String texto, String fichero) {
        //extraido de https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter pw = null;
        try {
            //writer = new FileWriter(fichero);
            writer = new FileWriter(fichero, true);//Para añadir sin borrar lo anterior
            bufferedWriter = new BufferedWriter(writer);
            pw = new PrintWriter(bufferedWriter);
 
            //bufferedWriter.write(texto);
            //bufferedWriter.newLine(); 
            pw.write(texto);
            pw.write("\n");
            
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
    
    public static String leer(String fichero) {
        //extraido de https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
            line = bufferedReader.readLine(); 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        return line;
    }
    
    public static ArrayList<String> leer2(String fichero) {
        //extraido de https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> contenido = new ArrayList<String>();        
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
 
            String line; 
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                contenido.add(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }            
        }
        return contenido;
    }
    
}
