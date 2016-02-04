package singleton_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**用于和MySQL数据库连接	/ to connect MySQL database.
 * @author Jason_★  
 */
public class MySQLConnection 
{
	private static Connection mySQLConnection;
	public static Connection getMySQLConnection()
	{ 
		if(mySQLConnection != null)
		{
			return mySQLConnection;
		}
		else
		{
			try
			{
				//注意这里请修改数据库名 账户 密码  / notice to modify the database name and account and password
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/funnystudy","root","123456");
				mySQLConnection = conn;
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			return mySQLConnection;
		}
	}
}