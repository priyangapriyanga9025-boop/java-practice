import java.util.ArrayList;
public class day8 {
  public static void main(String[] args) {
      ArrayList<Object> priya=new ArrayList<>();
      priya.add("priya");
      priya.add("java");
      priya.add(10);
      System.out.println(priya);
      priya.add(3,"mary");
      System.out.println(priya);
      priya.set(1,"python");
      System.out.println(priya);
      priya.get(0);
      System.out.println(priya);
      priya.remove(2);
      System.out.println(priya);
      System.out.println(priya.indexOf(10));
      System.out.println(priya.contains(priya));
  }
  } 