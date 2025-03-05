package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPersonRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/anp_d0453","root","Soun@0220");
			System.out.println(con);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from person");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
