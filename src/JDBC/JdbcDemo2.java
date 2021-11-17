package JDBC;

import java.sql.*;

public class JdbcDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

     //   Creating a connection
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";

        Connection con = DriverManager.getConnection(url,user,pass);

      //  Creating a statement
        Statement st = con.createStatement();

      //  Executing query ( DDL -data definition language )
    
        String sql ="select * from student";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("rno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.println(rs.getInt("marks"));
        }
    }
}
