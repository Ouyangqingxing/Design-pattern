package decorator_01;

/**
 * 服装类 后面所有具体服饰的父类 / Finery class  the super for the last specific finery class
 * @author Jason_★ 
 */
public class Finery extends Person
{ 
	protected Person p1;
	
	public Finery(){}
	public Finery(String name) 
	{
		super(name); 
	} 
	public void decorate(Person p1)
	{
		this.p1 = p1;
	}  
	@Override
	public void show()
	{
		if(p1 != null)
		{
			p1.show();
		}
	}
} 