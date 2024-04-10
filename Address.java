public class Address{
String city;
String houseno;
String country;

public Address(String city, String houseno, String country){
this.houseno=houseno;
this.city=city;
this.country=country;
}

}

class Emp{
String name;
Address address;
public Emp(String name, Address address){
this.name=name;
this.address=address;
}
public void display(){
    System.out.println(this.name+" "+address.city+" "+address.houseno+" "+address.country);
}

public static void main (String args[])
{
Address a1 = new Address("Tokyo","h23", "Japan");
Emp e1 = new Emp("prathmesh",a1);
e1.display();
}
}
