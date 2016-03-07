package builder_01;

/**
 * 产品类 / product class
 * @author Jason_★
 */
public class Product 
{
	private String parameterA;
	private String parameterB;
	
	public String getParameterA() 
	{
		return parameterA;
	}
	public void setParameterA(String parameterA) 
	{
		this.parameterA = parameterA;
	}
	public String getParameterB()
	{
		return parameterB;
	}
	public void setParameterB(String parameterB) 
	{
		this.parameterB = parameterB;
	} 
	public void show()
	{
		System.out.println(this.getParameterA());
		System.out.println(this.getParameterB());
	}
}