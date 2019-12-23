package misc;

public class Intil {
public void demo(Object o) {
	System.out.println("Object method");
}
public void demo(String s) {
	System.out.println("String method");

}
	public static void main(String[] args) {
		Intil d = new Intil();
		
		d.demo(d);

	}

}
