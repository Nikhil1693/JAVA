package Composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimensions dimensions=new Dimensions(20,20,5);
		Case theCase=new Case("2203","Dell","240",dimensions);
		
		Monitor themonitor=new Monitor("27 inch","Acer",27,new Resolution(2540,342));
		
		Motherboard themotherboard=new Motherboard("B3-200","Asus",4,6,"v2.44");
		
		PC thePC=new PC(theCase,themonitor,themotherboard);
	//thePC.getMonitor().drawPixel(20, 30, "blue");
		//thePC.getMotherboard().loadProgram("Hello");
		//thePC.getTheCase().pressPowerButton();
		
		thePC.powerUp();

	}

}
