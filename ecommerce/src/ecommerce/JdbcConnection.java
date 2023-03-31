package ecommerce;
import java.sql.*;

public class JdbcConnection

{

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/DBMS_PROJECT?characterEncoding=utf8";
	static final String USER = "root";
	static final String PASS = "";


	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a seelected database");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully");
			System.out.println("Creating table in database");
			stmt = conn.createStatement();


			String sql = "create table Login(username varchar(15),password varchar(5))";

			stmt.executeUpdate(sql);


		//String sql = "insert into login(username,password) values('hello','hello')";
		//stmt.executeUpdate(sql);	
		//System.out.println("Data inserted");

		}
		
		catch (SQLException se)
		{
			se.printStackTrace();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

		finally
		{}

	}

}
