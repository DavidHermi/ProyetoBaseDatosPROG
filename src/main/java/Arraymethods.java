import javax.swing.*;
import java.sql.*;


public class Arraymethods {

    /*public ResultSet listaDePersonas() {

        Conexion conex = new Conexion();
        ResultSet res = null;
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM tablatrabajobasedatos");
            res = consulta.executeQuery();

           // conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n" + e);
        }
        return res;

    }
*/

public void  inserta (int id,String name,int age ) {
    Conexion conex = new Conexion();

    try {
        Statement consulta = conex.getConnection().createStatement();
      //   consulta.executeQuery("INSERT INTO tablatrabajobasedatos values ( "+id+","+"'"+name+"',"+"'"+age+"')");
           consulta.executeUpdate("INSERT INTO tablatrabajobasedatos values (2,'Carlota',19)");
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
            consulta.executeUpdate("UPDATE  tablatrabajobasedatos set   Name='Pepe' , age=13 where ID=2 ");
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
