interface animal{
    void sound();
}
public class day {
    public static void main(String[] args) {
        animal a= new animal() {
            public void sound(){
                System.out.println("anonymous animal");

            };

            };
        a.sound();
    }

}
;
