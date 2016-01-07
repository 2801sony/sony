
import java.sql.*;
import java.util.*;

public class A 
{
	public static void main(String[] args)
	
	   throws Exception
	   {
		   Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
		   Connection c= DriverManager.getConnection("jdbc.odbc:@localhost1521:exe","system","long_short");
		   Statement  s= c.createStatement();
		   string sql  = "create table customer(id varchar(50),name char(50),description varchar(50),email varchar(50),dob date)";
		   s.execute(sql);
		   string sql = "insert into customer values ('emp1', 'sony','IT','s12@gmail.com','12-01-1872')";
		   s.execute(sql); 
		   System.out.println("done");
	   }
}