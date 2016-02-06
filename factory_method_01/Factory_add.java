package factory_method_01;

/**
 * 加法工厂	/	add factory
 * @author Jason_★ 
 */
public class Factory_add implements OperationFactory
{ 
	@Override
	public Operation createOperation() 
	{	 
		return new Operation_add();
	} 
} 