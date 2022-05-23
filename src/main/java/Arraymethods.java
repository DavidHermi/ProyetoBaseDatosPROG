import javax.swing.*;
import java.sql.*;


public class Arraymethods {
   ModeloDatos modelo = new ModeloDatos();



public void  inserta (int id, String name, int age ) {
    Conexion conex = new Conexion();
   /* int ID = insertid() ;
   String Name = insertName() ;
   int age = insertage() ;
   */

    PreparedStatement ps = null;
    String sql;
    modelo.setId(id);
    modelo.setName(name);
    modelo.setAge(age);


    try {
       ps = conex.getConnection().prepareStatement("INSERT INTO tablatrabajobasedatos ( ID,Name,age) values ( ?,?,? )");



        ps.setInt(1,modelo.getId());
        ps.setString(2,modelo.getName());
        ps.setInt(3,modelo.getAge());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
          // consulta.executeUpdate("INSERT INTO tablatrabajobasedatos values (ID,Name,age)");
           ps.close();
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


            consulta.executeUpdate("DELETE FROM tablatrabajobasedatos  where ID=0  ");
            consulta.close();
            conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }


}
