package Day8.Work;

public class DmartData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();

        // Customer chooses Food section
        Dmart foodSection = new Food();
        customer1.chooseSection(foodSection);
        customer1.viewItems();

        System.out.println();

        // Customer chooses Trends section
        Dmart trendsSection = new Trends();
        customer1.chooseSection(trendsSection);
        customer1.viewItems();
    }

	}
