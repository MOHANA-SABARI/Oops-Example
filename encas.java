package OopsExample;
import java.util.*;
class Account {  
	//private data members  
	private int acc_no;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	
	public int getAcc_no() {  
	    return acc_no;  
	}  
	
	public void setAcc_no(int acc_no) {  
	    this.acc_no = acc_no;  
	}  
	
	public String getName() {  
	    return name;  
	}  
	
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	public String getEmail() {  
	    return email;  
	}  
	
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	
	public float getAmount() {  
	    return amount;  
	}  
	
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}    
}  
public class encas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String em = sc.next();
		float f = sc.nextFloat();
		Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAcc_no(n);  
	    acc.setName(s);  
	    acc.setEmail(em);  
	    acc.setAmount(f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+"\n"+acc.getName()+" \n"+acc.getEmail()+" \n"+acc.getAmount());

	}

}
