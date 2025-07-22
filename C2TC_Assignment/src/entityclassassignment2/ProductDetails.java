package entityclassassignment2;

import entityclassassignment1.Student;

public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPsno(101);
		p1.setPname("laptop");
		p1.setPrate(47000);
		System.out.println(p1);
		
		Product p2 = new Product();
		p2.setPsno(102);
		p2.setPname("PC");
		p2.setPrate(120000);
		System.out.println(p2);
		
		Product p3 = new Product();
		p3.setPsno(103);
		p3.setPname("Keyboard");
		p3.setPrate(1200);
		System.out.println(p3);
		
		Product p4 = new Product();
		p4.setPsno(104);
		p4.setPname("Mouse");
		p4.setPrate(1000);
		System.out.println(p3);

	}

}
