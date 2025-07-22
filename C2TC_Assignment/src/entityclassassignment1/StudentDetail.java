package entityclassassignment1;

public class StudentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setSroll(1001);
		s1.setSname("Adithyan");
		s1.setSdept("CSE");
		s1.setScgpa(8.52);
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setSroll(1002);
		s2.setSname("Abineshwar");
		s2.setSdept("CSE");
		s2.setScgpa(8.8);
		System.out.println(s2);
		
		Student s3 = new Student();
		s3.setSroll(1003);
		s3.setSname("Harish");
		s3.setSdept("CSE");
		s3.setScgpa(8.9);
		System.out.println(s3);
	}

}
