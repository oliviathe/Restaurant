package people;

public class Visitor {
	private String name;
	private int totalPrice = 0;

	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addTotalPrice(int price) {
		totalPrice += price;
	}

	public void showTotalPrice() {
		System.out.println(name+"'s Total Price: "+totalPrice+"\n");
	}
}
