package JAVAOOP;

public class NewHouse extends House {
	
	private int doors;

	public NewHouse(String color,int doors) {
		super(color);
		this.doors=doors;
		
	}
	public void door(int number) {
		
		System.out.println("New House has "+number+" doors" );
		super.door(5);
		super.members(6);
		members(3);
		
		super.members(6);
		super.members(6);
	}
	public void members(int num) {
		System.out.println("New House has "+num+" members");
	}

}
