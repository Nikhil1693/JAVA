package DataHide;

public class A implements I1,I2 {

	@Override
	public void f1() {
		System.out.println("test");
	
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Test2");
	}
	
	
public static void main(String[] args) {
	A a=new A();
	a.f1();
	a.f2();
}
	
}
