package simple_factory;

/**
 * 运算类 2个属性 1个方法(不包括属性的get、set方法) / The operation class 2 attribute 1 function(not include the get set function)
 * @author Jason_★ 
 */
public abstract class Operation 
{
	protected double numberA = 0 ;
	protected double numberB = 0 ;
	
	public double getResult()
	{
		double result = 0 ;
		return result ;
	}
	
	public double getNumberA() 
	{
		return numberA;
	}
	public void setNumberA(double numberA) 
	{
		this.numberA = numberA;
	}
	public double getNumberB() 
	{
		return numberB;
	}
	public void setNumberB(double numberB) 
	{
		this.numberB = numberB;
	}	
}