package JAVAOOP;

public class Referencevsobjectmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House blueHouse=new House("blue");
		House anotherHouse=blueHouse;
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		House greenHouse=new House("green");
		anotherHouse=greenHouse;
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		System.out.println(blueHouse.getColor());
		
		NewHouse nh=new NewHouse("blue",3);
		nh.door(4);

	}

}
