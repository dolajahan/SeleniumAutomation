package Demojava;

public class Testinterface implements A {
	public void show() {
		System.out.println("inside test interface");
	}

	public static void main(String[] args) {
		
		Testinterface T = new Testinterface();
		
		
		T.show();
		
		// TODO Auto-generated method stub

	}

}

interface A {
	void show();
}

