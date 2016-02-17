package TemplateMethod_01;

/**
 * 试卷父类	/  the paper class 's super
 * @author Jason_★
 */
public class TestQuestion 
{
	public TestQuestion()
	{
		System.out.println("1 + 1 = ? ");
		System.out.println("A.11  B.田   C.2  D.3");
	}
	//这个类是该模式的关键，即子类将根据需求重新定义里面的步骤等	/	This is the core function that the subclass would modify the process it by the demand.
	public char getAnswer()
	{
		return ' ';
	}
} 