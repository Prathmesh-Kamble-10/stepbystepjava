package filecreate;
import java.io.File;
import java.io.IOException;

public class Createfileex{
    public static void main(String[] args)throws IOException {
       File myfile = new File("pk.txt") ;
       if(myfile.createNewFile()){
        System.out.println("File is created");
       }else{
        System.out.println("file is already exist");
       }
    }
}
