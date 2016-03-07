package builder_01;

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式： 建造者模式。
	 * 定        义： 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
	 * 解决问题： 无。应用场景诸如游戏中的环境渲染，以及一些项目中需要有的用户自定义的东西。
	 * 
	 * Design pattern:Builder pattern. 
	 * Definition: The construction of a complex object is separated from its representation so that the same construction process can create different representations.
	 * Solve the problem:Nothing.But I think it can use in game's like Environment Rendering.And we can use it in something by user's custom in our project.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Director director = new Director();
		Builder b1 = new ConcreteBuilderA();
		Builder b2 = new ConcreteBuilderB();
		
		Product p1 = b1.getResult();
		director.construct(b1); 
		p1.show();
		
		Product p2 = b2.getResult();
		director.construct(b2);
		p2.show();
	}
}