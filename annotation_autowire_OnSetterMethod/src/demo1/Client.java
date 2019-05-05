package demo1;

// this is a test run

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		System.out.println("main");
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	ReportService service=(ReportService) context.getBean("ReportService");
	service.display();
	
	
	}
}
