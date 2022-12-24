package gslcSession9;

public class Salad extends Food{
	private String dressing;
	
	public Salad(String size, int price, String dressing) {
		super(size, price);
		this.dressing = dressing;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	@Override
	public int generateTotalPrice() {
		int totalPrice = (int) (this.getPrice()*1.1);
		return totalPrice;
	}

}
