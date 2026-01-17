package pac3;
import java.util.Arrays;
import java.util.Scanner;
 
public class Lab3_4 {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	
    	 System.out.println("Enter number of products:");
    	
    	 int n = sc.nextInt();
    	 sc.nextLine();
    	
    	 String[] products = new String[n];
    	
    	 for(int i=0; i<n ;i++) {
    		 System.out.print("Enter product Names:");
    		 products[i] = sc.nextLine();
    	 }
    	 Arrays.sort(products);
    	 System.out.println("Sorted Product Names");
    	 for(String p : products) {
    		 System.out.println(p);
    	 }
     }
}