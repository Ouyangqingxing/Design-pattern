package strategy;

/**
 * 打折收费类  / rebate cash class
 * @author Jason_★ 
 */
public class CashRebate extends CashSuper
{ 
	private double moneyRebate = 1;
	
	public CashRebate(double moneyRebate)	//构造函数，取得打折的折数。		/ constructor function,to get the rebate number .
	{
		this.moneyRebate = moneyRebate;
	}
	
	@Override
	public double getCash(double money)     //得到实际金额。		/  get the final money.
	{ 
		return money * moneyRebate;
	} 
} 