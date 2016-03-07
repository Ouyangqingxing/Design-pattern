package builder_01;

/**
 * 具体产品建造类   产品的不同而不同的建造方式/ the product builder class.	different building way because of different product demand
 * @author Jason_★
 */
public class ConcreteBuilderA extends Builder
{
	private Product product = new Product();

	@Override
	public void buildPartA() 
	{
		product.setParameterA("O O");
	}

	@Override
	public void buildPartB() 
	{
		product.setParameterB("^ ^");
	}

	@Override
	public Product getResult() 
	{
		return product;
	}
}