package JAVAPRAC;

public class abstChild extends ABST  {
	
	public void add() {
		System.out.println("add");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ABST a=new abstChild();
     a.Sum();
     ((abstChild) a).add();
	}

	@Override
	public void Sum() {
		System.out.println("sum");
		
	}

}
