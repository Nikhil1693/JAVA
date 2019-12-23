package Composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private String Powersupply;
	private Dimensions dimensions;
	
	public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {

		this.model = model;
		this.manufacturer = manufacturer;
		Powersupply = powersupply;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowersupply() {
		return Powersupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}


	
	
	
	

}
