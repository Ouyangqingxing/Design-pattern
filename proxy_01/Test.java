package proxy_01;

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式：代理模式 。
	 * 定        义：为其他对象提供一种代理以控制对这个对象的访问。		 
	 * 解决问题：无。本程序仅通过 追求者、被追求者、代理追求者 形象的将代理模式展现出来。
	 * 
	 * Design pattern:Proxy.
	 * definition:Provide a agent to visit the object for other object.
	 * Solve the problem:Nothing.But this program make it easily to understand the pattern by the admirer and agent and somebody who was admired.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Girl girl = new Girl();
		girl.setName("女神");
		
		Proxy p1 = new Proxy(girl,"屌丝","高富帅");
		p1.giveChocolate();
		p1.giveRose();
		p1.giveIphone();
	}
}