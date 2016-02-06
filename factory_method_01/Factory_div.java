package factory_method_01;

/**
 * 除法工厂	/	div factory
 * @author Jason_★ 
 */
public class Factory_div implements OperationFactory
{ 
	@Override
	public Operation createOperation()
	{  
		return new Operation_div();
	} 
} 