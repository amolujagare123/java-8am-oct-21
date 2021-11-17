package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

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

      //  Executing query ( DML -data manupulation language )
     //   String sql ="insert into student values(2,'anjali','IT',77)";
      //  String sql ="update student set rno =10 where name='anjali'";
        String sql ="delete from student where rno=10";
        st.executeUpdate(sql);

    }
}
