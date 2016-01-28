package simple_factory;

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式：简单工厂模式 也叫静态工厂方法模式 		/ 	This is simple_factory pattern and it also called static_factory_method pattern.
	 * 解决问题：计算器。	/  Solve the question:calculator. 
	 *
	 * 有人会说，这里我们把一个计算器的功能写得太复杂，原本一个函数就可以搞定。 		/ 	Somebody maybe say we make it too complex for a calculator and it just a function enough.
	 * 实际上设计模式就是这样的，把一些东西用面向对象的思维去编写。虽然看上去变复杂了，实际上可维护性、可移植性大幅度上升。 	/ 	But this is design patter. Thus we code in object-oriented thoughts.Although it may be complex,it becomes more extensibility and maintainability.
	 * 如本程序如果要加入一个新的计算方法，只需要新增一个类即可。同时使用者本身不需要知道Operation的内部实现，相当于使用者和Operation系列类解耦。 	/ 	We just need to add a class to add a new operation in this program.And it decoupling of user from Operation class.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Operation oper = OperationFactory.getOperation('+');
		oper.setNumberA(100);
		oper.setNumberB(100);
		double result = oper.getResult();
		System.out.println(result);
	}
} 