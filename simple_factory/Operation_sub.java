package simple_factory;

/**
 * 减法类 继承操作类 重写计算结果的方法 / sub class  extends operation class  override the function to get result.
 * @author Jason_★
 */
public class Operation_sub extends Operation
{
	@Override
	public double getResult()
	{
		double result = 0 ;
		result = numberA - numberB ; 
		return result ;
	}
} 