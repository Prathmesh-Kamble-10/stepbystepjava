package filecreate;
import java.io.FileWriter;


public class writefileex {
    public static void main(String[] args){
       try{
        FileWriter myfw = new FileWriter("text.txt") ;
        myfw.write("reditional i will keep secure");
        myfw.close();
       }catch(Exception e){
        System.out.println("Exception"+e);
       }
     }
}


