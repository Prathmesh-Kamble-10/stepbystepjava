import java.util.Scanner;

class Test{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Your age , Name and Salary");
int a = sc.nextInt();
System.out.println("YOur Age is = "+a);

String name = sc.nextLine();
System.out.println(" ,name is = "+name);

float salary = sc.nextFloat();
System.out.println("and your salary is =" + salary);

}
}