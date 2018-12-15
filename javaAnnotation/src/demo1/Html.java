package demo1;

import org.springframework.stereotype.Component;

@Component ("Html")
public class Html implements ReportGenerator {
	


	public void display(int records) {
		System.out.println("Html report with "+ records+ " records ");
	}
	
}
