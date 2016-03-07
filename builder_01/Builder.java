package builder_01;

/**
 * 建造者类     负责建造产品 / builder class	 be responsible for building
 * @author Jason_★
 */
public abstract class Builder
{
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}