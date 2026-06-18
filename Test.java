public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
class UPI implements payment{
    public void pay(double amount){
        System.out.println("paid"+amount+"using UPI");
        
    }
} 
