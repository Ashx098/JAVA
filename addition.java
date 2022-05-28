import java.util.*;
class addition
{
 public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
int a,b;
System.out.println("Enter value of a :");
a=in.nextInt();
System.out.println("Enter value of b :");
b=in.nextInt();

if(a>b) 
{
System.out.println("a is greater than b");
}
else if(b>a)
{
System.out.println("b is greater than a");
}
else 
{
System.out.println("a is equal to b");
}

}
}