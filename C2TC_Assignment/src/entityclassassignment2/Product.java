package entityclassassignment2;

public class Product {
	private int psno;
	private String pname;
	private int prate;
	
	public int getPsno() {
		return psno;
	}
	public void setPsno(int psno) {
		this.psno = psno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPrate() {
		return prate;
	}
	public void setPrate(int prate) {
		this.prate = prate;
	}
	@Override
	public String toString() {
		
		return " Product Sno = " + psno + " || Name --> " + pname + " || Rate = $" + prate + "\n "
						+ "-------------------------------------------------------" ;
	}
	
	

}
