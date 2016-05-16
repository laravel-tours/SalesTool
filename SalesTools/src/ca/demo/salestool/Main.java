package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();
		DisplayGreeting();
		data.display();
	}

	private static void DisplayGreeting() {
		System.out.println("Hello Happy sales people.");
		System.out.println("This apps shows apps data.");
		
		System.out.println("Test 1");
	}
}
