package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcPersonDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/anp_d0453","root","Soun@0220");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("delete from person where person_id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter record id number you want to delete");
			int id=sc.nextInt();
			ps.setInt(1,id);
			int j=ps.executeUpdate();
			System.out.println(j+" record deleted successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
