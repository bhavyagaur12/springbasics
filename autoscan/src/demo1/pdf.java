package demo1;

import org.springframework.stereotype.Component;

@Component("pdf")
public class pdf implements ReportGenerator {
 
	public void display(int records) {
		System.out.println("pdf report with " + records+" records");
	}
}
