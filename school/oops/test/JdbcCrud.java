
import java.sql.*;

public class JdbcCrud {
    static final String DB_URL = "jdbc:yourdb://host:port/dbname";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            // Create table (if needed)
            try (Statement st = conn.createStatement()) {
                st.executeUpdate("CREATE TABLE IF NOT EXISTS students(id INT PRIMARY KEY, name VARCHAR(100))");
            }
            // Insert
            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO students(id,name) VALUES(?,?)")) {
                ps.setInt(1,1); ps.setString(2,"Alice"); ps.executeUpdate();
            }
            // Update
            try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
                ps.setString(1,"Alicia"); ps.setInt(2,1); ps.executeUpdate();
            }
            // Select
            try (Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery("SELECT id,name FROM students")) {
                while (rs.next()) System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
            // Delete
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id=?")) {
                ps.setInt(1,1); ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
