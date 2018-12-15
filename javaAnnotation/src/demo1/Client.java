package demo1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		System.out.println("main");
	ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
	Html h=(Html) context.getBean("html");
	ReportService service=(ReportService) context.getBean("report");
	ReportService service1=(ReportService) context.getBean("reporting");
	service.display();
	service1.display();
	
	
	}
}
