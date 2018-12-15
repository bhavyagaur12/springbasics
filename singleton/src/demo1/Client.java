package demo1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		System.out.println("main");
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	ReportService service1=(ReportService) context.getBean("ReportService");
	ReportService service2=(ReportService) context.getBean("ReportService");
	if(service1==service2) {
		System.out.println("same instance in singleton");
	}
	else {
		System.out.println("different instance PROTOTYPE");
	}
//	service1.display();
	
	
	}
}
