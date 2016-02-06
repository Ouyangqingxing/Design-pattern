package factory_method_01;

/**
 * 减法工厂	/	sub factory
 * @author Jason_★
 */
public class Factory_sub implements OperationFactory
{ 
	@Override
	public Operation createOperation()
	{ 
		return new Operation_sub();
	}
} 