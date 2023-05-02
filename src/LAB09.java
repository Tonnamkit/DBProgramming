import java.sql.*;

public class LAB09 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "tonnam001";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "insert into student(studentID,firstName,lastName,email,deptID) values('651093','Kiitipat','Bualoylom','kittipat.bual@kmmutt.ac.th','IT')";

            statement.executeUpdate(sql);



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
