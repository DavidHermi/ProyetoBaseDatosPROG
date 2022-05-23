/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.*;
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


        Interfaz tabla = new Interfaz();
        Methods insertar = new Methods();



        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú: \n 1.Insertar taboa. \n 2.Updatear taboa. \n 3.Deletear taboa. \n 4.Mostrar taboa. "));

        do {
            switch (opcion) {
                case 1:
                    insertar.inserta(7,"Pedro",10);
                    break;

                case 2:
                    insertar.update("Carlota",17,3);
                    break;
                case 3:
                    insertar.delete(0);
                    break;
                case 4:
                    tabla.tabla();


            }
        } while (opcion > 5);
    }




    }


