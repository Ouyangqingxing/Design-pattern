package factory_method_01; 

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式：工厂方法模式 。		 
	 * 解决问题：简单工厂模式的提升。	 
	 * 工厂方法模式和抽象工厂模式较相似，和简单工厂方法相比变化明显————从要在工厂类里去修改switch case 到现在须在客户端修改。虽然都是修改，但是至少这样满足了开放-封闭原则。
	 * 
	 * Design pattern:Factory Method.
	 * Solve the problem:Make progress in simple factory.
	 * This pattern is similar with abstract factory pattern.They are different from simple factory. Thus you should modify the program in factory class 's switch case before,now you just modify it in the text class. Although they are both modify something,but the new pattern satisfy the OPEN FOR EXTENSION CLOSED FOR MODIFICATION. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//OperationFactory opFact = new Factory_add();	不使用反射的情况下 	/  without the reflection 
		
		//使用反射		/	use the reflection
		@SuppressWarnings("rawtypes")
		Class c1;
		OperationFactory opFact = null;
		try
		{
			c1 = Class.forName("factory_method_01.Factory_add");
			opFact = (OperationFactory) c1.newInstance();
		}
		catch(Exception e){e.printStackTrace();}
		
		Operation oper = opFact.createOperation();
		
		oper.setNumberA(100);
		oper.setNumberB(100);
		double result = oper.getResult();
		System.out.println(result);
	}
} 