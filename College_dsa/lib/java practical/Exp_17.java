import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
public class Exp_17 {
    public static void main(String[] args) {
        try{
            File myObj = new File("test.txt");
            FileOutputStream fout = new FileOutputStream(myObj);
            String s = "Welcome to java class";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success.....");
        }
        catch(IOException e){
            System.out.println("An error occured:"+e.getMessage());
        }
    }
}
