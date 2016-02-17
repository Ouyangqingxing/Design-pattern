package TemplateMethod_01;

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式： 模板方法。
	 * 定        义： 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。		 
	 * 解决问题： 无。以一个试卷父类、答卷A、答卷B来形象描述该模式。该模式比较易理解，往往学习之前就有过使用。
	 * 
	 * Design pattern: TemplateMethod.
	 * Definition:Defines the skeleton of an algorithm in an operation, and delays some steps into the sub class. Template method makes the sub class can not change the structure of an algorithm can re define some specific steps of the algorithm. 
	 * Solve the problem:Nothing.But use the question class and the paperA and paperB to describe this pattern.This pattern is easy to understand and maybe you have use it before you study it. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TestQuestion stuA = new TestPaperA();
		System.out.println(stuA.getAnswer());
		System.out.println();
		
		TestQuestion stuB = new TestPaperB();
		System.out.println(stuB.getAnswer());
		System.out.println();
	}
}