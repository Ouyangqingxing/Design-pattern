package builder_01;

/**
 * 指挥类	作为用户和建造者桥梁 负责指挥建造过程	/ director class	As a bridge	between user and builder is responsible for directing the builder process 
 * @author Jason_★
 */
public class Director 
{
	//根据具体的需求，这里假定只有两个块	/	You can modify there by your demand.We suppose there are just two parts.
	public void construct(Builder builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}
}