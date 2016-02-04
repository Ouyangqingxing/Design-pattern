package singleton_01;

/**
 * 单例模式核心类 / singleton pattern core class
 * @author Jason_★ 
 */
public class Singleton 
{
	//饿汉单例模式 唯一属性为id	/	hungry pattern  the only value is id.
	private int id = 0;  
    private Singleton(){}  
    private static final Singleton instance = new Singleton();  
     
    public static Singleton getInstance() 
    {  	 
        return instance;  
    }
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}  
}