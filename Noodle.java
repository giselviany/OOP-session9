package gslcSession9;

public class Noodle extends Food{
	private String noodleType;
	private String topping;
	private int spicyLevel;
	
	public Noodle(String size, int price, String noodleType, String topping, int spicyLevel) {
		super(size, price);
		this.noodleType = noodleType;
		this.topping = topping;
		this.spicyLevel= spicyLevel;
	}

	public String getNoodleType() {
		return noodleType;
	}
	
	public void setNoodleType(String noodleType) {
		this.noodleType = noodleType;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public int getSpicyLevel() {
		return spicyLevel;
	}

	public void setSpicyLevel(int spicyLevel) {
		this.spicyLevel = spicyLevel;
	}

	@Override
	public int generateTotalPrice() {
		int totalPrice = (int) (this.getPrice()*1.1);
		return totalPrice;
	}

}
