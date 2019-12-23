package Composition;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixel(int x,int y,String Color) {
		System.out.println("Drawing pixel At "+x +","+y+" in color "+Color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}


	
	

}