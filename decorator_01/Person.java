package decorator_01;

/**
 * person类 / person class 
 * @author Jason_★ 
 */
public class Person 
{
	private String name;
	
	public Person(){}
	
	public Person(String name)
	{
		this.name = name;
	}
	public void show()
	{
		System.out.println(name);
	}
} 