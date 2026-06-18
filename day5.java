public class day5 { 
    public static void main(String[] args) { 
        A obj = new B(); 
        obj.display(); 
        B obj = new A();
        obj.display();
    } 
} 
class A { 
    void display() { 
        System.out.println("A"); 
    } 
} 
 
class B extends A { 
    void display() { 
        System.out.println("B"); 
    } 
} 
 
