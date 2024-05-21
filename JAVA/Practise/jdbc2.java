//updating data of database

import java.sql.*;
import java.util.*;

public class jdbc2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            System.out.println("connection establised successfully");
            PreparedStatement st = con.prepareStatement("insert into table1 values(?,?)");
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter id : ");
                int id = sc.nextInt();
                st.setString(1, name);
                st.setInt(2, id);
                int y = st.executeUpdate();
                System.out.println(y + "Records updated Successfully");
                System.out.println("want to enter more...?");
                String ch = sc.next();
                if (ch.equalsIgnoreCase("no"))
                    break;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}