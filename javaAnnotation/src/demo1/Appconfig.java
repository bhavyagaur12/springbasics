package demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public Html html() {
		return new Html();
	}
	
	@Bean
	public pdf pdf() {
		return new pdf();
	}
	
	@Bean
	public ReportService report(){
		System.out.println("inside report");
		ReportService r=new ReportService(pdf(),100);
		return  r;
		
	}
		
	@Bean
	public ReportService reporting() {
		ReportService r=new ReportService(html(),100);
		return r;
		
	}
	
}
