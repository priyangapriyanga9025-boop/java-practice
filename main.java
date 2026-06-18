
import java.util.Scanner;

public class main {
    
        int m1,m2,m3,m4,m5,total ,avg;
        String name ;
        public static void main (String []args){
            main o []=new main[5];
            for (int i=1; i<=5; i++) {
                o[i]=new main();
                o[i].input();
                o[i].cal();
            

                
            }
        
        
    }
    void input() {
        Scanner s = new Scanner(System .in);
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        m4=s.nextInt();
        m5=s.nextInt();
        name=s.next();
        
        
    }
    void cal(){
        total = m1+m2+m3+m4+m5;
        avg=total/5;
        System.out.println("total"+total);
        System.out.println( "the result is"+ avg);
    }
}

