public class priya  {
    public static void main(String[]args){
        AIDSb B=new AIDSb();
        AIDSc C=new AIDSc();
        B.book();
        B.bag();
        C.box();
        
        
    }
}
   class AIDSa {
     void book() {

            System.out.println("book");
        
    }
    }
     class AIDSb extends AIDSa{
        void bag(){
            System.out.println("bag");
        }
     }
     class AIDSc extends AIDSa{
        void box(){
            System.out.println("box");
        }
     }

