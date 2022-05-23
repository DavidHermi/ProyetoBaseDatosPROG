import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Interfaz {

    Methods obx = new Methods();


    public void tabla() throws SQLException {
Conexion con = new Conexion();

        String query = "SELECT * FROM tablatrabajobasedatos";

        Statement stm = con.getConnection().createStatement();
        ResultSet res = stm.executeQuery(query);

        String columns[] = {"ID", "Name", "Age"};
        String data[][] = new String[8][3];

        int i = 0;
        while (res.next()) {
            int id = res.getInt("ID");
            String nom = res.getString("Name");
          int age = res.getInt("age");
            data[i][0] = id + "";
            data[i][1] = nom;
            data[i][2] = age + "";
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setShowGrid(true);
        table.setShowVerticalLines(true);
        JScrollPane pane = new JScrollPane(table);
        JFrame f = new JFrame("Populate JTable from Database");
        JPanel panel = new JPanel();
        panel.add(pane);
        f.add(panel);
        f.setSize(500, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}





