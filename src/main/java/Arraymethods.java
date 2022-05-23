import javax.swing.*;
import java.sql.*;


public class Arraymethods {


/*
    public static int insertage(){

       String Auxage = JOptionPane.showInputDialog(null, "Introduzca la edad") ;
       int age = Integer.parseInt(Auxage);
       return age ;
    }

    public static String insertName(){

        String Name = JOptionPane.showInputDialog(null, "Introduzca el nombre") ;
        return Name ;
    }



    public static int insertid(){

        String Auxid = JOptionPane.showInputDialog(null, "Introduzca la id") ;
        int id = Integer.parseInt(Auxid);
        return id ;
    }
    */

public void  inserta (int id, String name, int age ) {
    Conexion conex = new Conexion();
   /* int ID = insertid() ;
   String Name = insertName() ;
   int age = insertage() ;
   */

    try {
        Statement consulta = conex.getConnection().createStatement();
        consulta.executeQuery("INSERT INTO tablatrabajobasedatos ( ID,Name,age) values ( ?,?,? )");




          // consulta.executeUpdate("INSERT INTO tablatrabajobasedatos values (ID,Name,age)");
           consulta.close();
        conex.Desconectar();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
    }


}

    public void  update (String name,int age,int id ) {
        Conexion conex = new Conexion();

        try {
            Statement consulta = conex.getConnection().createStatement();

           // consulta.executeUpdate("UPDATE  tablatrabajobasedatos set   Name='"+name+"',age="+age+"where ID="+id+";");
            consulta.executeUpdate("UPDATE  tablatrabajobasedatos set   Name='Hector' , age=19 where ID=3 ");
            consulta.close();
            conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }

    public void  delete (int id ) {
        Conexion conex = new Conexion();

        try {
            Statement consulta = conex.getConnection().createStatement();


            consulta.executeUpdate("DELETE FROM tablatrabajobasedatos  where ID=2 ");
            consulta.close();
            conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }


}
