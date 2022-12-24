package gslcSession9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan  = new Scanner(System.in);
	ArrayList<Food> foodList = new ArrayList<>();
	
	int nettPrice = 0;
	
	public void orderFood() {
		String size;
		String foodType;
		String dressing = null;
		String pastaType = null;
		String cheese = null;
		String noodleType = null;
		String topping = null;
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
			price = 35000;
			do {
				System.out.print("Input the dressing [Greek Yoghurt || Sweet Mayo || Cilantro Avocado]: ");
				dressing = scan.nextLine();
			} while(!(dressing.equals("Greek Yoghurt") || dressing.equals("Sweet Mayo") || dressing.equals("Cilantro Avocado")));
			
			foodList.add(new Salad(size, foodType, price, dressing));
			
		}else if(foodType.equals("Pasta")) {
			price = 65000;
			do {
				System.out.print("Input pasta type [Spaghetti || Lasagna || Penne]: ");
				pastaType = scan.nextLine();
			} while(!(pastaType.equals("Spaghetti") || pastaType.equals("Lasagna") || pastaType.equals("Penne")));
			do {
				System.out.print("Input cheese selection [Cheddar || Parmesan || Mozzarella]: ");
				cheese = scan.nextLine();
			} while(!(cheese.equals("Cheddar") || cheese.equals("Parmesan") || cheese.equals("Mozzarella")));

			foodList.add(new Pasta(size, foodType, price, pastaType, cheese));
			
		}else if(foodType.equals("Noodle")) {
			price = 55000;
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
			
			foodList.add(new Noodle(size, foodType, price, noodleType, topping, spicyLevel));
		}
		
		System.out.println("succesfully added");
		System.out.println("Press enter to continue");
		System.out.println(" ");
		
	}
	
	public void viewOrder() {
		if(foodList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=========");
			System.out.println("Press Enter to Continue");
			scan.nextLine();
		}else {
			System.out.println("===================================================");
			System.out.println("| NO. |                Food                 | Size |");
			for(int i=0; i<foodList.size() ; i++) {
				System.out.print("| ");
				System.out.print(i+1 + " |");
				if((foodList.get(i).getFoodType()).equals("Salad")) {
					System.out.print(" ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Salad) foodList.get(i)).getDressing() + " dressing | ");
				}else if((foodList.get(i).getFoodType()).equals("Pasta")) {
					System.out.print(" ");
					System.out.print(((Pasta) foodList.get(i)).getPastaType() + " ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Pasta) foodList.get(i)).getCheese() + " cheese | ");
				}else {
					System.out.print(" ");
					System.out.print(((Noodle) foodList.get(i)).getNoodleType() + " ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Noodle) foodList.get(i)).getTopping() + " | ");
				}
				System.out.print(foodList.get(i).getSize() + " | ");
				System.out.println(" ");
			}
		}
	}
	
	public void payFood() {
		if(foodList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=========");
			System.out.println("Press Enter to Continue");
			scan.nextLine();
		}else {
			System.out.println("===================================================");
			System.out.println("| NO. |                Food                 | Size | Base Price | Total Price |");
			for(int i=0; i<foodList.size() ; i++) {
				System.out.print("| ");
				System.out.print(i+1 + " |");
				if((foodList.get(i).getFoodType()).equals("Salad")) {
					System.out.print(" ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Salad) foodList.get(i)).getDressing() + " dressing | ");
				}else if((foodList.get(i).getFoodType()).equals("Pasta")) {
					System.out.print(" ");
					System.out.print(((Pasta) foodList.get(i)).getPastaType() + " ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Pasta) foodList.get(i)).getCheese() + " cheese | ");
				}else {
					System.out.print(" ");
					System.out.print(((Noodle) foodList.get(i)).getNoodleType() + " ");
					System.out.print(foodList.get(i).getFoodType() + " with ");
					System.out.print(((Noodle) foodList.get(i)).getTopping() + " | ");
				}
				System.out.print(foodList.get(i).getSize() + " | ");
				System.out.print(foodList.get(i).getPrice() + " | ");
				System.out.print(foodList.get(i).generateTotalPrice() + " |");
				nettPrice = nettPrice + foodList.get(i).generateTotalPrice();
				System.out.println(" ");
			} 
			System.out.println("Total Amount: " + nettPrice);
			System.out.println(" ");
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
				payFood();
			}
			
		}while(input != 4);
	}

	public static void main(String[] args) {
		new Main();
	}

}

