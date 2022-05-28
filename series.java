import java.util.*;
class series
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n,a; int product=1;
System.out.println("Enter a number :" );
n=in.nextInt();

System.out.print("The numbers are : ");
for(int i=1;i<=n;i++)
{
a=n+i;
System.out.print(a+" ");
product=product*a;
a=0;
}
System.out.println(" Product is "+product);
}}