import javax.swing.*;
import java.sql.*;


public class Methods {
    ModeloDatos modelo = new ModeloDatos();


    public void inserta(int id, String name, int age) {
        Conexion conex = new Conexion();
        PreparedStatement ps = null;
        String sql;
        modelo.setId(id);
        modelo.setName(name);
        modelo.setAge(age);
        try {
            ps = conex.getConnection().prepareStatement ("INSERT INTO tablatrabajobasedatos ( ID,Name,age) values ( ?,?,? )");
            ps.setInt(1, modelo.getId());
            ps.setString(2, modelo.getName());
            ps.setInt(3, modelo.getAge());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
            // consulta.executeUpdate("INSERT INTO tablatrabajobasedatos values (ID,Name,age)");
            ps.close();
            conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }

    public void update(String name, int age, int id) {
        Conexion conex = new Conexion();
        modelo.setId(id);
        modelo.setName(name);
        modelo.setAge(age);
        try {
            PreparedStatement ps = conex.getConnection().prepareStatement ("UPDATE  tablatrabajobasedatos set   Name=? , age=? where ID=? ");
            // consulta.executeUpdate("UPDATE  tablatrabajobasedatos set   Name='"+name+"',age="+age+"where ID="+id+";");
            ps.setString(1, modelo.getName());
            ps.setInt(2, modelo.getAge());
            ps.setInt(3, modelo.getId());
            ps.executeUpdate();
            ps.close();
            conex.Desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }

    public void delete(int id) {
        Conexion conex = new Conexion();
        modelo.setId(id);
        try {
            PreparedStatement ps = conex.getConnection().prepareStatement("DELETE FROM tablatrabajobasedatos  where ID=?  ");

            ps.setInt(1, modelo.getId());
            ps.executeUpdate();
            ps.close();
            conex.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo insertar\n" + e);
        }


    }


}
