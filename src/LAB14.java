import java.sql.*;

public class LAB14 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "tonnam001";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData meta = con.getMetaData();

            System.out.println("database URL: " + meta.getURL());
            System.out.println("database product name: " + meta.getDatabaseProductName());
            System.out.println("database product version: " + meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + meta.getDriverName());
            System.out.println("JDBC driver version: " + meta.getDriverVersion());
            System.out.println("JDBC driver major version: " + meta.getDriverMajorVersion());
            System.out.println("JDBC driver minor version: " + meta.getDriverMinorVersion());
            System.out.println("Max number of connections: " + meta.getMaxConnections());
            System.out.println("MaxTableNameLength: " + meta.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable: " + meta.getMaxColumnsInTable());
            con.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


