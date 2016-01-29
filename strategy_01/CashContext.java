package strategy;

/**
 * 策略模式中的核心类 这里与之前的简单工厂结合   / core class in the strategy pattern and we combine it with simple_factory pattern.
 * @author Jason_★ 
 */
public class CashContext 
{
	CashSuper cs = null ; //申明一个CashSuper对象	 / state a CashSuper object
	
	public CashContext(float[] type) //数组长度为1 直接收费，长度是2则为打折，长度是3则为返利     / length=1 is normal cash, 2 is rebate cash,3 is return cash.
	{ 
		if(type != null && type.length>0 && type.length<4)	//参数检查，过滤不合法的参数  /  check the parameter to filter the parameter which not lawful.
		{
			switch(type.length)
			{
				case 1:
				{
					CashNormal cs1 = new CashNormal();
					cs = cs1;
					break;
				}
				case 2:
				{
					if(type[1]<=10 && type[1]>0)
					{
						CashRebate cs2 = new CashRebate(type[1]);
						cs = cs2;
						break;
					}
				}
				case 3:
				{
					if(type[1]>0 && type[2]>0 && type[1]>type[2])
					{
						CashReturn cs3 = new CashReturn(type[1],type[2]);
						cs = cs3;
						break;
					}
				}
			 }
		}
	}
	public double getResult(double money)
	{
		return cs.getCash(money);
	}
}