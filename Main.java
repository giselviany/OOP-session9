package gslcSession9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan  = new Scanner(System.in);
	ArrayList<Food> foodList = new ArrayList<>();
	
	public void orderFood() {
		String size;
		String foodType;
		String dressing;
		String pastaType;
		String cheese;
		String noodleType;
		String topping;
		int spicyLevel= 0;
		int price = 0;
		
		System.out.println("MENU OF THE DAY");
		System.out.println("================");
		System.out.println("1. Salad");
		System.out.println("2. Pasta");
		System.out.println("3. Noodle");
		System.out.println("================");
		
		do{
			System.out.print("Input food size [Regular | Large]: ");
			size = scan.nextLine();
		} while(!(size.equals("Regular") || size.equals("Large")));
		
		do{
			System.out.print("Input your Order [Salad | Pasta | Noodle]: ");
			foodType = scan.nextLine();
		} while(!(foodType.equals("Salad") || foodType.equals("Pasta") || foodType.equals("Noodle")));

		if(foodType.equals("Salad")) {
			do {
				System.out.print("Input the dressing [Greek Yoghurt || Sweet Mayo || Cilantro Avocado]: ");
				dressing = scan.nextLine();
			} while(!(dressing.equals("Greek Yoghurt") || dressing.equals("Sweet Mayo") || dressing.equals("Cilantro Avocado")));
			
		}else if(foodType.equals("Pasta")) {
			do {
				System.out.print("Input pasta type [Spaghetti || Lasagna || Penne]: ");
				pastaType = scan.nextLine();
			} while(!(pastaType.equals("Spaghetti") || pastaType.equals("Lasagna") || pastaType.equals("Penne")));
			do {
				System.out.print("Input cheese selection [Cheddar || Parmesan || Mozzarella]: ");
				cheese = scan.nextLine();
			} while(!(cheese.equals("Cheddar") || cheese.equals("Parmesan") || cheese.equals("Mozzarella")));

		}else if(foodType.equals("Noodle")) {
			do {
				System.out.print("Input noodle type [Ramen || Udon || Soba]: ");
				noodleType = scan.nextLine();
			} while(!(noodleType.equals("Ramen") || noodleType.equals("Udon") || noodleType.equals("Soba")));
			do {
				System.out.print("Input topping [Egg || Chicken || Gyoza]: ");
				topping = scan.nextLine();
			} while(!(topping.equals("Egg") || topping.equals("Chicken") || topping.equals("Gyoza")));
			do {
				System.out.print("Input spicy level [1-5]: ");
				spicyLevel = scan.nextInt();
				scan.nextLine();
			} while(spicyLevel < 2 || spicyLevel > 5);
		}
	}
	
	public void viewOrder() {
		if(foodList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=========");
			System.out.println("Press Enter to Continue");
			scan.nextLine();
		}else {
			System.out.println("===================================================");
			
		}
	}
	
	public Main() {
		int input=0;		
		do {
			System.out.println("GOODY FOODY");
			System.out.println("==============================");
			System.out.println("1. Order food");
			System.out.println("2. View order history");
			System.out.println("3. Pay");
			System.out.println("4. Exit");
			System.out.print(">> ");
			input = scan.nextInt();
			scan.nextLine();
			
			if(input == 1) {
				orderFood();
			}else if(input == 2) {
				viewOrder();
			}else if(input == 3) {
				//payFood
			}
			
		}while(input != 4);
	}

	public static void main(String[] args) {
		new Main();
	}

}
