package XMLParser.JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * JAXB : java XML to java object demo
 * 
 *
 */
public class XmlToObjectDemo 
{
	public static void main(String[] args) 
	{
		try {

			File file = new File("src//main//java//XMLParser//JAXB//employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(file);
			System.out.println(employee.getEmployeeName());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
