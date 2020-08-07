package co.jack;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// Object Construction | Done by developer 
		Employee eRef = new Employee();
		eRef.setEid(102);
		eRef.setEname("Jack");
		eRef.setEaddress("New York");
		
		System.out.println("Employee Details : " + eRef);
		// Spring Way | IOC (Inverse of control)
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

	}

}
