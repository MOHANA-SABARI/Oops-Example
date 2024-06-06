package OopsExample;

interface Anima{
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	class Pig implements Anima {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}
	class Dog implements Anima {
		public void animalSound() {
	    System.out.println("The Dog says: Wah Wah");
	  	}
	  public void sleep() {
	    System.out.println("Zzz....!");
	  }
	}
	class Interface {
	  public static void main(String[] args) {
	    Dog myPig = new Dog();
	    myPig.animalSound();
	    myPig.sleep();
	    Pig myPi = new Pig();
	    myPi.animalSound();
	    myPi.sleep();
	  }
	}

