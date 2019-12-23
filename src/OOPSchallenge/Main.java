package OOPSchallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hamburger hamburger=new Hamburger("Basic","sausage",3.56,"white");
		
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheeze", 1.12);
		double price=hamburger.itemizeHamburger();
		
		System.out.println("Total Burger Price is "+price); 
		HealthyBurger healthyburger=new HealthyBurger("Bacon",5.67);
		healthyburger.addHamburgerAddition1("Egg", 5.43);
		healthyburger.addHealthyAddition1("Lentils", 3.41);
       double price1=healthyburger.itemizeHamburger();
		
		System.out.println("Total Burger Price is "+price1);
	
	}


}
