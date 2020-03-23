package XMLParser.JAXB;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Employee class
 * 
 *
 */
@XmlRootElement
public class Employee 
{
	private String employeeName;
	private int age;
	private String position;
	private long salary;

	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getPosition() 
	{
		return position;
	}
	public void setPosition(String position) 
	{
		this.position = position;
	}
	public long getSalary() 
	{
		return salary;
	}
	public void setSalary(long salary) 
	{
		this.salary = salary;
	}
}
