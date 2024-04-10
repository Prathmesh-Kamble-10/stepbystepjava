import java.util.Scanner;

class TwoDArrIO{
public static void main(String args[]){
int d1=3;
int d2=3;
String str[][]=new String[d1][d2];
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter 2D Array Values");
for(int i=0;i<d1;i++){
for(int j=0;j<d2;j++){
str[i][j]= sc.next();
}
}
for(int i=0;i<str.length;i++){
for(int j=0;j<str[i].length;j++){
	System.out.println("i: "+i+"  "+"j: "+j+"  "+"==>"+str[i][j]);
}
}
}


}