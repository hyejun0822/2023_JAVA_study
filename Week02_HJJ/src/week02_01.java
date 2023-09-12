class Circle {
	protected int radius;
	
	public Circle(int r) {
		radius = r;
	}
}

class Pizza extends Circle {
	public String name;
	
	public Pizza(String pizza_name, int r) {
		super(r);
		name = pizza_name;
	}
	public void pizza() {
		System.out.println(name + " pizza's radius is " + radius);
	}
}
public class week02_01 {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		
		obj.pizza();
	}

}
