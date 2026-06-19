import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class folder {
    public static void main(String[] args) throws IOException {
      // File f=new File("priyu.java");
       // f.createNewFile();
        //System.out.println(f.getCanonicalFile());
        BufferedWriter fw =new BufferedWriter(new FileWriter("priyu.txt"));
        fw.write("winning is based on the hardworking ");
        fw.close();
        System.out.println(fw);
        BufferedReader fr=new BufferedReader(new FileReader("priyu.txt"));
        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
