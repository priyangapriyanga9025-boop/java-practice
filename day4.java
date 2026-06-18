public class day4{
    public static void main(String[] args) {      
        office a = new office("priya");
        office a1 = new office("Priya");
        office a2 = new office("priya",20);
         a.display();
        a1.display();
        }
} 
class office{
     office(String name){
        System.out.println("good girl"+ name);
    }
office (String name,int age){
    System.out.println("good girl"+name);
    System.out.println("good "+age);
}

void display(){
    System.out.println("silent girl" );
}

}
void display(){
   