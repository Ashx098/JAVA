import java.util.*;
class Softy_ice_cream
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter flavour : ");
String flavour=in.nextLine();
System.out.println("Enter No.Of scoops : ");
int scoops=in.nextInt();
int price=0;
switch(flavour)
{
case "chocolate" :
price=20*scoops;
System.out.println(scoops+" scoops of chocolte costs : "+price);
break;
case "mango" :
price=15*scoops;
System.out.println(scoops+" scoops of mango costs : "+price);
break;
case "vanilla" :
price=10*scoops;
System.out.println(scoops+" scoops of vanilla costs : "+price);
break;
default :
price=30*scoops;
System.out.println(" two scoops of any other flavour costs : "+price);
}
}
}