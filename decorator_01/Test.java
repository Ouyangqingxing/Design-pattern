package decorator_01;

/**
 * 测试类 / test class 
 * @author Jason_★ 
 */
public class Test
{
	/**
	 * 设计模式：装饰模式
	 * 解决问题：类似于虚拟角色换装。
	 * 装饰模式是为了让已有功能动态地添加更多功能的一种方式，并且有效地把核心职责和装饰功能区分开了。
	 * 这里为了方便理解例子比较简单。复杂一点的例子有数据持久化前，需要的“装饰步骤”有先过滤数据 再加密数据等等。
	 * 
	 * Design pattern:Decorator
	 * Solve the question:Just like a virtual character change clothes.
	 * The decorator pattern make it dynamically to add more function,and distinguish between the key duty parts and the decorator parts.
	 * There is just a demo example.Also it have complex example like before we save the data,we would do some "decorator" like filter data and encryption data.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person xm = new Person("小明"); 
		System.out.println("最新装扮！ /  The latest dressed."); 
		TShirts ts = new TShirts();
		BigTrouser bt = new BigTrouser();
		Hat ht = new Hat(); 
		ts.decorate(xm);ts.show();
		bt.decorate(ts);bt.show();
		ht.decorate(bt);ht.show(); 
	}
} 