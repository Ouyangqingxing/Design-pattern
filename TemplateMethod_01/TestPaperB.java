package TemplateMethod_01;

/**
 * 试卷类 / paper class
 * @author Jason_★
 */
public class TestPaperB extends TestQuestion
{
	public TestPaperB()
	{
		System.out.print("PaperB:");
	}
	public char getAnswer()
	{
		return 'B';
	}
}