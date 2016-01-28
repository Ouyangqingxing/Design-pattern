package strategy;

/**
 * 返现收费类  / return money cash class
 * @author Jason_★ 
 */
public class CashReturn extends CashSuper
{
	private double moneyCondition = 0;		//达到一定条件 返一定金额     / if money more than condition,return some money.
	private double moneyReturn = 0;
	
	public CashReturn(float type , float type2)
	{
		this.moneyCondition = type;
		this.moneyReturn = type2 ;
	}
	
	@Override
	public double getCash(double money) 
	{
		double result = money;
		
		if(money >= moneyCondition)			//大于减少，否则没变化  / Only when your money more than condition,you can return.
		{
			result = money - moneyReturn;
		}
		return result;
	}
} 