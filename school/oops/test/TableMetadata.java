
import java.sql.*;

public class TableMetadata {
    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");


            String tableName = "student";


            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + tableName);


            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();

            System.out.println("Table: " + tableName);
            System.out.println("Columns Metadata:");
            System.out.println("-----------------------------------");

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + ": " + md.getColumnName(i));
                System.out.println("Type: " + md.getColumnTypeName(i));
                System.out.println("Size: " + md.getColumnDisplaySize(i));
                System.out.println("-----------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
