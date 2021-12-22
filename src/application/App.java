package application;

public class App {

	public static void main(String[] args) {
		
		//An array can only hold one data type
		
		String[] foods = {"Potatoes", "Rice", "Pasta", "Bread"};

		System.out.println(foods[0]);
		System.out.println(foods[3]);
		
		foods[0] = "Onions";
		System.out.println(foods[0]);
	}

}
