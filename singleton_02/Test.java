package singleton_02;

import java.sql.Connection;

/**
 * 测试类 / test java
 * @author Jason_★ 
 */
public class Test 
{
	/**
	 * 设计模式：单例模式。
	 * 解决问题：数据库连接类。
	 * 注意：自行导入MySQL相关包。
	 * 
	 * Design pattern:Singleton pattern.
	 * Solve the problem:database connection class.
	 * Notice:Add the relevant MySQL jar.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Connection conn = MySQLConnection.getMySQLConnection(); 
	}
} 