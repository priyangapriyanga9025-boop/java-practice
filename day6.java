 interface College {
    void idcard();
    default void uniform(){
      System.out.println("red uniform");
    }

}
 class Red implements College {
public void idcard(){
    System.out.println("red idcard");

}
 }
  
 
public class day6 {
 public static void main(String[] args) {
    College c =new Red();
      c.idcard();
      c.uniform();
    

 }
} 