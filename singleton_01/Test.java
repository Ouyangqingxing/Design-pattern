package singleton_01;

/**
 * 测试类 / test java
 * @author Jason_★ 
 */
public class Test 
{
	/**
	 * 设计模式：单例模式。
	 * 解决问题：保证一个类仅有一个实例，并提供一个访问它的全局访问点。常用应用场景：工具类、数据库连接类等。
	 * 本例采用更佳用户体验的饿汉模式。
	 * 
	 * Design pattern:Singleton pattern.
	 * Solve the problem:Ensure the class have only one instantiation and provide a function to get it.We can use this pattern when we code tools class or database connection class and so on.
	 * In this program I use the hungry pattern.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();  
        s1.setId(1);  
        Singleton s2 = Singleton.getInstance();  
        s2.setId(2);  
        Singleton s3 = Singleton.getInstance();  
        s2.setId(3); 
        
        System.out.println("s1.id = "+s1.getId()+" , s2.id = "+s2.getId()+" , s3.id = "+s3.getId()); 
        if(s1 == s2 && s2 == s3 )
        {  
            System.out.println("它们同一个实例~	/  They are the same one~");  
        }
        else
        {  
            System.out.println("它们不是同一个实例~	/They are not the same one~");  
        }  
	}
} 