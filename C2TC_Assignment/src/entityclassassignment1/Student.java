package entityclassassignment1;

public class Student {
	private int sroll;
	private String sname;
	private String sdept;
	private double scgpa;
	
	
	public int getSroll() {
		return sroll;
	}


	public void setSroll(int sroll) {
		this.sroll = sroll;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSdept() {
		return sdept;
	}


	public void setSdept(String sdept) {
		this.sdept = sdept;
	}


	public double getScgpa() {
		return scgpa;
	}


	public void setScgpa(double scgpa) {
		this.scgpa = scgpa;
	}


	@Override
	public String toString() {
		return "Student ---> Roll no = " + sroll + " ||  Name = " + sname + " || Dept = " + sdept + " || CGPA =" + scgpa
				+"\n----------------------------------------------------------------------------";
	}
	
	

}
