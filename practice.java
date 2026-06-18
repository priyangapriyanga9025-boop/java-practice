
   import java.util.*;
public class practice {
    public static void main(String[] args) {
       
String fruit = fruits.get(2);
System.out.println("Fruit at index 2: " + fruit)
fruits.set(1, "Orange");
System.out.println(fruits); // [Apple, Orange, Banana, Mango]
fruits.remove(2);               // by index
fruits.remove("Apple");         // by value
System.out.println(fruits);

fruits.clear();                 // remove all
System.out.println(fruits);     // []
System.out.println(fruits.size());   // number of elements
System.out.println(fruits.isEmpty()); // true or false
    }
}


