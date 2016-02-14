package proxy_01;

/**
 * 追求者的代理类 / proxy class
 * @author Jason_★
 */
public class Proxy implements Admirer
{
	private String name;
	RealAdmirer rd;
	
	public Proxy(Girl girl,String proxyName,String realAdmirerName)
	{
		this.name = proxyName;
		rd = new RealAdmirer(girl,realAdmirerName);
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
		System.out.print(this.name+" ");
		rd.giveIphone();
	}
	@Override
	public void giveRose() 
	{
		System.out.print(this.name+" ");
		rd.giveRose();
	}
	@Override
	public void giveChocolate() 
	{
		System.out.print(this.name+" ");
		rd.giveChocolate();
	} 
} 