import java.util.ArrayList;

public class day8 {
    public static void main(String[] args) {
        ArrayList<Object> p= new ArrayList<>();
        p.add("10");
        p.add("30.4");
        p.add("priya");
        System.out.println(p);
        p.add("java");
        System.out.println(p);
        p.set(0,"python");
        System.out.println(p);
        p.remove("0");
        System.out.println(p);
        p.add(1,"java");
        System.out.println(p);
        p.clear();
        System.out.println(p);
        p.indexOf("java");
        System.out.println(p);
        p.lastIndexOf("java");
    }
}
