package strategy;

/**
 * 正常收费类  / normal cash class
 * @author Jason_★ 
 */
public class CashNormal extends CashSuper
{ 
	@Override
	public double getCash(double money) 
	{ 
		return money;
	} 
} 