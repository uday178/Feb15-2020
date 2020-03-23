package XMLParser.JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 * JAXB : java object to XML demo
 * 
 *
 */
public class objectToXMLDemo 
{
	public static void main(String[] args) 
	{
		try {

			Employee employee=addEmployee();
			File file = new File("src//main//java//XMLParser//JAXB//employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(employee, file);
			jaxbMarshaller.marshal(employee, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	private static Employee addEmployee()
	{
		Employee emp=new Employee();
		emp.setEmployeeName("John");
		emp.setAge(25);
		emp.setPosition("Software Engineer");
		emp.setSalary(80000);
		return emp;
	}
}
