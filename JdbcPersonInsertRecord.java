package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcPersonInsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/anp_d0453","root","Soun@0220");
			System.out.println(con);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of records you want to insert");
			int n=sc.nextInt();
			System.out.println("Enter values for id, name and age: ");
			int id, age;
			String name;
			for(int i=0;i<5;i++) {
			PreparedStatement ps=con.prepareStatement("insert into person values(?,?,?)");
			id=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			age=sc.nextInt();
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.executeUpdate();
			System.out.println(i+1 + " record inserted successfully");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
