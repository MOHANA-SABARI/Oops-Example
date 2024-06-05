package OopsExample;
import java.util.*;

class Demo {
	
	void play() {
		System.out.println("Add---- Press 1");
		System.out.println("Subtract---- Press 2");
	}
	void add(int n,int n1) {
		System.out.println(n+n1);
	}
	
	void sub(int n,int n1) {
		System.out.println(n+n1);
	}
	void con() {
		System.out.println("Continue---- Press yes");
		System.out.println("End---- Press no");
	}
	void display() {
		System.out.println("--------Calculatorrr-------");
		System.out.println("Enter Two Numberssss.....!");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt();
		Demo obj = new Demo();
		obj.display();
		
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("Enter your Choice--");
		
		obj.play();
		int num = sc.nextInt();
		if(num==1) {
			obj.add(y, z);
		}
		
		if(num==2) {
			obj.sub(y, z);
		}
		obj.con();
		String x = sc.next();
		if(x.equals("yes")) {
			obj.display();
		}
		
		if(x.equals("no")) {
			System.out.println("Processs Endedd...... :)");
		}
		

	}

}
