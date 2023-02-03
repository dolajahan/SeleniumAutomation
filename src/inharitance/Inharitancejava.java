package inharitance;

//import inharitance.Animal.dog;

    class Animal
 {
	void eat ()
	{System.out.println("animal eat vegitable ang bird");}
	
	
 }
	
	class dog extends Animal{
		
		void burk () {
		System.out.println("dog is burking all time");}
		
		
	}

	class babydog extends dog{
		
		void sleep() {
		
			System.out.println("dog also sleeping");
			
		}
	}
	
	
	  class cat extends Animal {
		  void meaw() {
			  
			  System.out.println("cat sound meaw");
		  }
	  }
public class Inharitancejava {

	public static void main(String[] args) {
		
		
        dog d = new dog();
		
		babydog bd =new babydog();
		cat c =new cat ();
		
		bd.burk();
		bd.eat();
		bd.sleep();
		c.meaw();

	}
		// TODO Auto-generated method stub

	}


