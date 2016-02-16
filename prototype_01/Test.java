package prototype_01;

/**
 * 测试类 / test class
 * @author Jason_★
 */
public class Test 
{
	/**
	 * 设计模式：原型模式 。
	 * 定        义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。		 
	 * 解决问题：用此模式拷贝多个学生。原型模式适合初始化复杂并且需要提供给多个修改者的对象。
	 * 
	 * Design pattern:Prototype.
	 * Definition:Specify the types of objects that are created with a prototype instance, and create new objects by copying them.
	 * Solve the problem:Clone several students.This pattern is suit for the object which initialization is very complex and the object which others would modify it constantly. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Student stu1 = new Student("Tom");
		stu1.setInfo(1, 20);
		stu1.setTeacher(1, "Jerry");
		
		Student stu2 = (Student) stu1.clone(); 
		stu2.setTeacher(2, "Jack");
		
		Student stu3 = (Student) stu1.clone(); 
		stu3.setTeacher(3, "Tony");
		
		stu1.display();
		stu2.display();
		stu3.display();
	}
}