package demo1;

public class ReportService {

	public ReportGenerator master;
	public int records;
	
	public ReportService(ReportGenerator master,int records) {
		System.out.println("parameterized constructor");
		this.master=master;
		this.records=records;
	}
	
	public ReportService() {
		System.out.println("this is the default constructor");
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
