package facade_01;

/**
 * 信息中心类（即该模式的核心类外观类） / the center of information class and it's core class in this pattern
 * @author Jason_★
 */
public class InfoCenter 
{
	private Student stu;
	private Teacher tea;
	private Course cou;
	
	public InfoCenter()
	{
		stu = new Student();
		tea = new Teacher();
		cou = new Course();
	}
	
	public void getStuTeaInfo()
	{
		stu.getInfo();
		tea.getInfo();
	}
	public void getCouInfo()
	{
		cou.getInfo();
	}
}