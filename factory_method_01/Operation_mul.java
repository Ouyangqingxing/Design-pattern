package factory_method_01; 

/**
 * 乘法类 继承操作类 重写计算结果的方法 / mul class  extends operation class  override the function to get result.
 * @author Jason_★
 */
public class Operation_mul extends Operation
{
	@Override
	public double getResult()
	{
		double result = 0 ;
		result = numberA * numberB ; 
		return result ;
	}
} 