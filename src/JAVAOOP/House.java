package JAVAOOP;

public class House {
	
	private String color;
	
	public House(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void door(int number) {
		System.out.println("House has "+number+" doors");
		
	}
	public void members(int num) {
		System.out.println("House has "+num+" members");
	}

}
