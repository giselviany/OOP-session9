package gslcSession9;

public abstract class Food {
	private String size;
	private String foodType;
	private int price;
	
	public Food(String size, String foodType, int price) {
		super();
		this.size = size;
		this.foodType = foodType;
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract int generateTotalPrice();

}
