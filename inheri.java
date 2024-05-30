package OopsExample;
import java.util.*;
//Single level Inheritance
class Animal{
	static int play(int n) {
		return n;
	}
	
	void playing() {
		System.out.print("Welcome ");
	}
	
}
//Multilevel Inheritance
class Food extends Animal{
	static String name(String s) {
		return s;
	}
	
	void playing1() {
		System.out.print("to Explore...!");
	}
}
class Dosa extends Food{
	static String name1(String s) {
		return s;
	}
	
	void playing2() {
		System.out.println("Hirearchical  Inheritance...!");
	}
}

public class inheri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = sc.nextInt();
		
		Dosa call = new Dosa();
		call.playing();call.playing1();
		System.out.println();
		System.out.println();
		call.playing2();
		
		System.out.println(call.name(str)+" "+call.play(num));
	}

}
