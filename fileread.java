import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileread {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("pk.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);

        }
    }
}
