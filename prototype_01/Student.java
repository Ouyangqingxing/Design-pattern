package prototype_01;

/**
 * 学生类（需要进行克隆的类） / student class(the class need to clone)
 * @author Jason_★
 */
public class Student implements Cloneable
{
	private int id;
	private int age;
	private String name;
	private Teacher teacher;
	
	//构造方法 用于最初原型调用	/	Constructor. For the initial object.
	public Student(String name)
	{
		this.name = name;
		teacher = new Teacher();
	}
	//构造方法 用于克隆的对象	/	Constructor.For the clone object.
	public Student(Teacher teacher)
	{
		this.teacher = (Teacher) teacher.teacherClone();
	}
	
	public void setInfo(int id , int age)
	{
		this.id = id;
		this.age = age;
	}
	public void setTeacher(int id , String name)
	{
		teacher.setId(id);
		teacher.setName(name);
	}
	
	public void display()
	{
		System.out.println(name+" "+id+" "+age);
		System.out.println(teacher.getId()+" "+teacher.getName());
	}
	//核心克隆方法	/	core clone function.
	public Object clone()
	{
		Student stu = new Student(this.teacher);
		stu.name = this.name;
		stu.setInfo(this.id, this.age);
		return stu;
	} 
} 