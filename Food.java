package gslcSession9;

public abstract class Food {
	private String size;
	private int price;
	
	public Food(String size, int price) {
		super();
		this.size = size;
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract int generateTotalPrice();

}
