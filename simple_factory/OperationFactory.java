package simple_factory;

/**
 * 工厂类 负责“生产”操作对象 / factory class  It is responsible for "producing" operation object.
 * @author Jason_★
 */
public class OperationFactory 
{
	public static Operation getOperation(char operate)
	{
		Operation oper = null;
		switch(operate)
		{
			case '+':
			{
				oper = new Operation_add();
				break;
			}
			case '-':
			{
				oper = new Operation_sub();
				break;
			}
			case '*':
			{
				oper = new Operation_mul();
				break;
			}
			case '/':
			{
				oper = new Operation_div();
				break;
			}
		}
		return oper;
	}
} 