import java.util.*;
class welcomemsg
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter ur name : ");
String name=in.nextLine();
System.out.println("Enter ur age : ");
int age=in.nextInt();

System.out.println(name+" Welcome to presidency at"+ age +" years ");
}
} 