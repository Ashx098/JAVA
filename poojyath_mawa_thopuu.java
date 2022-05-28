import java.util.*;
class poojyath_mawa_thopuu
{
String g;
String gift(String a)
{g=a; return g;}
void display()
{
System.out.println("This is a gift from Avinash to you with love :"+g);}
public static void main(String[] args)
{String b;
poojyath_mawa_thopuu obj=new poojyath_mawa_thopuu();
Scanner in=new Scanner(System.in);
System.out.println("Mr.pooj what gift u want : ");
b=in.nextLine();
obj.gift(b);
obj.display();
}}