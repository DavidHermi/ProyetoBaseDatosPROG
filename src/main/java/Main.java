/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {

       // Connection connection = (Connection) new Conexion().getConnection();

        Interfaz tabla = new Interfaz();
        Arraymethods insertar = new Arraymethods();
        //insertar.inserta(1,"David",18);
        insertar.update("Carlota",17,2);
        insertar.delete(2);
        tabla.tabla();

       // connection.close();


    }

}
