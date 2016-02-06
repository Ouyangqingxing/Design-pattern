package factory_method_01; 

/**
 * 除法类 继承操作类 重写计算结果的方法 / div class  extends operation class  override the function to get result.
 * @author Jason_★
 */
public class Operation_div extends Operation
{
	@Override
	public double getResult()
	{
		double result = 0 ;
		if(numberB != 0) //注意判断被除数不能为0  / Notice:the divided number can not be 0.
		{
			result = numberA / numberB ;	
		}
		else
		{
			System.out.println("被除数不能为0！/ The divided number can not be 0!");
		}
		return result ;
	}
} 