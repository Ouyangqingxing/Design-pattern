package TemplateMethod_01;

/**
 * 试卷类 / paper class
 * @author Jason_★
 */
public class TestPaperA extends TestQuestion
{
	public TestPaperA()
	{
		System.out.print("PaperA:");
	} 
	public char getAnswer()
	{
		return 'A';
	}
}