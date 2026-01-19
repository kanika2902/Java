package pac3;

import java.util.ArrayList;
import java.util.Collections;

public class Lab4_4 {
    public static void main(String[] args) {
 
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Keyboard");
 
        Collections.sort(products);
 
        System.out.println("Sorted Product Names:");
        for (String p : products) {
            System.out.println(p);
        }
    }
}