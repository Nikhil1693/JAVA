package Composition;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Composition.Monitor monitor, Motherboard motherboard) {
		
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

/*	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}*/
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	public void drawLogo() {
		monitor.drawPixel(30, 40, "Yellow");
	}

	
	
	

}
