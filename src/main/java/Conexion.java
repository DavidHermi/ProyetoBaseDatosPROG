/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author David
 */
public class Conexion {

    static String bd = "test";
    static String login = "CuentaTrabajo";
    static String password = "1234";
    static String url = "jdbc:mysql://localhost/" + bd;


    Connection connection = null;

    public Conexion() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            connection = (Connection) DriverManager.getConnection(url, login, password);

            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public Connection getConnection() {
        return connection;
    }

    public void Desconectar() {

        try {

            connection.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}






