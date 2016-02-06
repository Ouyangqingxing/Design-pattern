package factory_method_01;

/**
 * 乘法工厂	/	mul factory
 * @author Jason_★ 
 */
public class Factory_mul implements OperationFactory
{ 
	@Override
	public Operation createOperation() 
	{ 
		return new Operation_mul();
	} 
} 