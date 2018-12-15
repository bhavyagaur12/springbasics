package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("ReportService")
public class ReportService {
//
//	@Autowired
//	@Qualifier("pdf")
	public ReportGenerator master;
	
//	@Value("100")
	public int records;
	
	public ReportService(ReportGenerator master,int records) {
		System.out.println("parameterized constructor");
		this.master=master;
		this.records=records;
	}
	
	public ReportService() {
		System.out.println("this is the default constructor ");
	}
	
	public ReportGenerator getMaster() {
		return master;
	}
	public void setMaster(ReportGenerator master) {
		System.out.println("inside the setter method of master");
		this.master = master;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	
	public void display() {
	master.display(records);
	}
	
}
