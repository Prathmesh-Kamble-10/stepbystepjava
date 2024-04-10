package filecreate;

import java.io.FileWriter;

public class multiplecreate {
    public static void main(String[] args) {
        try{
            for(int i=0;i<10;i++){
                String filename="filecreate/multifile/text"+i+".txt";
                FileWriter writer = new FileWriter(filename);
                writer.write("Everything will be good sooner"+filename);
                writer.close();
                System.out.println(filename+" created ");
        }
    }catch(Exception e){
                System.out.println("Some error"+e);
            }
        
    }
}
