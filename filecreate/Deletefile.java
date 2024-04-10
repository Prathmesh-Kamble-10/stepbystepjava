package filecreate;

import java.io.File;

public class Deletefile {
    public static void main(String[] args) {
        try{
            File file = new File("filecreate/multifile/text0.txt");
            file.delete();
        
        }catch(Exception e)
        {
            System.out.println("Detected erroer"+e);
        }
    }
}
