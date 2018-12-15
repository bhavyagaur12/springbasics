package demo1;

public class ReportService {

	public ReportGenerator master;
	public int records;
	
	
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
