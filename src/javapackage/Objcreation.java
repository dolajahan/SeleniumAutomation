2package javapackage;

public class Objcreation {
	void add()
	{
		int a =10;
		int b= 20;
		int sum = a+b;
		System.out.println("The sum of two number "+sum);
	}
	
	int subt(int a ,int b)
	{
		int sub = a-b;
		return sub;
	}
public static void main(String[] args) {
	Objcreation obj=new Objcreation();
	int a = obj.subt(50,30);
	System.out.println(a);
	
	
	
}
}
