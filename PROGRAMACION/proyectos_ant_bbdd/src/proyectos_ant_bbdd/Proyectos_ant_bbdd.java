package proyectos_ant_bbdd;

import java.sql.*;

/**
 * Programa de prueba para aprender a conectar Netbeans y BBDD.
 *
 * @author Ceaile
 */
public class Proyectos_ant_bbdd {

    public static void main(String[] args) {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //copypasted de apuntes

            String url = "jdbc:mysql://192.168.43.61:3306/test?serverTimezone=UTC;";
            String user = "root";
            String password = "";

            Connection conexion = DriverManager.getConnection(url, user, password);

            Statement ejecutor = conexion.createStatement();

            boolean ex = ejecutor.execute("USE nba;"); //para saber si funciona o no, true o false

            ResultSet consulta = ejecutor.executeQuery("SELECT * FROM equipos");

            
            //fuera del bucle hashmap <string, clase>
            while (consulta.next()) {
                //creo objeto de clase 'nombretabla'
                
                String nombre = consulta.getString("Nombre"); //nombre de la columna. Uno por columna!!!
                //setteo los atributos del objeto con cada campo de consulta
                System.out.println("Nombre: " + nombre);
                //añade al hashmap
            }
            
            

            ejecutor.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
