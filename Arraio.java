import java.util.Scanner;

class Arraio{
public static void main(String args[]){
System.out.println("Plz enter total element of Array");
Scanner scan = new Scanner(System.in);
int totalInput = scan.nextInt();
int inputArr[]= new int[totalInput];
System.out.println("Please enter Array Element Values");
for(int i = 0; i<totalInput;i++){
inputArr[i]=scan.nextInt();
}
System.out.println("Array Elements are here");
for(int i=0;i<totalInput; i++){
System.out.println(inputArr[i]);
}
}
}