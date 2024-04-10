import java.util.Scanner;

class NestFor{

public static void main(String args[]){

System.out.println("Enter Max loop Value");
Scanner sc = new Scanner(System.in);
int fi = sc.nextInt();
System.out.println("J values are \n");
int fj =sc.nextInt();
for(int i=1; i<=fi;i++)
	{
for(int j =1 ; j<=fj;j++){
System.out.println(j);
}
System.out.println("loops"+i);
}
}

}