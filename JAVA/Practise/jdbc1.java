//printing data from database

import java.sql.*;

public class jdbc1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            // create a connection, returns object of type connnection
            System.out.println("Connection establised successfully");
            Statement st = con.createStatement();
            // Creates a statement object for sending SQL statements to database
            ResultSet rs = st.executeQuery("select * from table1");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}