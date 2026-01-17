package pac2;
 
import java.util.Random;
 
public class Lab_2_1 {
	
	public static class Person {
		
	    private String name;
	    private float age;
	
	    // Constructor
	    public Person(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }
	
	    // Getters and Setters
	    public String getName() {
	        return name;
	    }
	
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    public float getAge() {
	        return age;
	    }
	
	    public void setAge(float age) {
	        this.age = age;
	    }
	}
	
	public static class Account {
		
	    
	    private double balance;
	    private Person accHolder;
	
	    
	    public static String generateaccountnumber() {
	    	long time = System.currentTimeMillis();
	    	int random = new Random().nextInt(900)+100;
	    	return time+""+random;
	    }
	    private static final double MIN_BALANCE = 500.0;
	
	    // Constructor
	    public Account(Person accHolder, double balance) {
	        
	        this.accHolder = accHolder;
	
	        if (balance >= MIN_BALANCE) {
	            this.balance = balance;
	        } else {
	            this.balance = MIN_BALANCE;
	            System.out.println("Minimum balance ₹500 maintained.");
	        }
	    }
	
	    // Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	
	    // Withdraw method
	    public void withdraw(double amount) {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	        } else {
	            System.out.println("Withdrawal denied! Minimum balance ₹500 must be maintained.");
	        }
	    }
	
	    // Get balance
	    public double getBalance() {
	        return balance;
	    }
	
	    // Getters and Setters
	
	    public Person getAccHolder() {
	        return accHolder;
	    }
	
	    public void setAccHolder(Person accHolder) {
	        this.accHolder = accHolder;
	    }
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p = new Person("Kathy", 25);
        Person q = new Person("Smith",26);
        Account acc = new Account(p, 1000);
        Account acc1 = new Account(q , 3000);
        System.out.println("Account number:" + acc.generateaccountnumber());
        System.out.println("Account number:" + acc1.generateaccountnumber());;
        acc.deposit(500);
        acc1.withdraw(3000);
        System.out.println("Balance: " + acc.getBalance());
        System.out.println(acc1.getBalance());
 
	}
 
}