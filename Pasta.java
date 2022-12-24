package gslcSession9;

public class Pasta extends Food{
	private String pastaType;
	private String cheese;
	
	public Pasta(String size, int price, String pastaType, String cheese) {
		super(size, price);
		this.cheese = cheese;
		this.pastaType = pastaType;
	}

	public String getPastaType() {
		return pastaType;
	}


	public void setPastaType(String pastaType) {
		this.pastaType = pastaType;
	}
	
	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	@Override
	public int generateTotalPrice() {
		int totalPrice = (int) (this.getPrice()*1.1);
		return totalPrice;
	}

	

}
