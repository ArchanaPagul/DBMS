package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcPersonUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/anp_d0453","root","Soun@0220");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("update person set name=? where person_id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id number where you want to update and name you want to set");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			ps.setString(1,name);
			ps.setInt(2,id);
			int j=ps.executeUpdate();
			System.out.println(j+" record updated successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
