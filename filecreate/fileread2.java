package filecreate;
import java.io.File;
import java.util.Scanner;

public class fileread2 {
    public static void main(String[] args){
        try{
        File filex = new File("pk.txt");
        Scanner reader = new Scanner(filex);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);

        }
    }catch(Exception e){
System.out.println("Enternal error"+e);
    }
    }
}
