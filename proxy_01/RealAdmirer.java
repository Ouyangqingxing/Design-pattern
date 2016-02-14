package proxy_01;

/**
 * 真实的追求者类 / real Admirer class
 * @author Jason_★
 */
public class RealAdmirer implements Admirer
{
	private String name;
	Girl girl;
	public RealAdmirer(Girl girl,String realAdmirerName)
	{
		this.girl = girl;
		this.name = realAdmirerName;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public void giveIphone() 
	{ 
		System.out.println("送给 "+girl.getName()+" Iphone6 Plus玫瑰金"+"(购买者："+this.name+")");
	} 
	@Override
	public void giveRose() 
	{
		System.out.println("送给 "+girl.getName()+" 99朵玫瑰花"+"(购买者："+this.name+")");
	} 
	@Override
	public void giveChocolate()
	{
		System.out.println("送给 "+girl.getName()+" 一盒巧克力"+"(购买者："+this.name+")");
	}
}