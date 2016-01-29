package strategy;

/**
 * 测试类  / test class
 * @author Jason_★ 
 */
public class Test 
{
	/**
	 * 设计模式：策略模式 +　简单工厂模式						 /  design pattern:Strategy + simple factory
	 * 解决问题：收银系统（多重收费方式如普通收费　打折收费　满额返现收费）   /  solve problem :cash system(include like normal,rebate,return kinds of cash)
	 * 
	 * 策略模式主要用来封装算法，一般类似收银这种需要在不同时间应用不同的业务逻辑，就很适合它。 	/ Strategy pattern is suit for encapsulating algorithm.Like the cash which have different business logic in different time.
	 * 这里策略模式使得方便各个算法进行独立的单元测试　加入简单工厂模式后减轻了使用方的职责。	/ Strategy pattern make it easy that each algorithm test by themselves,and it make user(test.class) don't have too much duty when we add the simple factory in the core class(CashContext.class).
	 *　缺点则在核心类里依然有switch存在，如果要加入新的类型算法又需要改动这个类。以后学习到反射时将回过头来进行完善。 / The disadvantage is there have switch in the core class.We also need to modify it when we add some new algorithm.I would make it better after I study the reflex.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int number = 100;		//因为在此我们只讨论设计模式，具体的物品数量单价的代码可根据项目实际环境（web端 移动端 客户端）修改。	/ Because we just talk about the design pattern now,the number of the goods and the price can modify in the specific circumstances.
		int price = 5;
		double money = number * price ; 
		double finalMoney = 0;
		 
//		float[] cashRule = {1};
//		float[] cashRule = {1,(float) 0.5};
		float[] cashRule = {1,300,200};		//当前的收费规则 		/	the cash rule currently.
		CashContext csuper = new CashContext(cashRule);
		
		try
		{
			finalMoney = csuper.getResult(money);	//根据规则拿到实际需要支付的金额	/ get the final money by the rule.
			System.out.println(finalMoney);
		}
		catch(Exception e)
		{
			System.out.println("出错啦！请检查一下参数哦~  / Wrong!Please check the number."); 
		} 
	}
} 