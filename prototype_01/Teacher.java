package prototype_01;

/**
 * 教师类（克隆类中需要的变量） / teacher class(the class need to be cloned's variable)
 * @author Jason_★
 */
public class Teacher implements Cloneable
{
	private int id;
	private String name;
	
	//克隆相关对象	/	clone the relevant object
	public Object teacherClone()
	{ 
		try 
		{
			return this.clone();
		} 
		catch(CloneNotSupportedException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}