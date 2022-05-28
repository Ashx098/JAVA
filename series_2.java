import java.util.*;
class series_2
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n1,n2; int sum=0;
System.out.println("Enter the Upper value and lower vales of number to display series :" );
n1=in.nextInt();
n2=in.nextInt();
System.out.print("The NUMBERS are ");
while(n1<=n2)
{
if(n1/2==0)
 {
System.out.print(n1+", ");
sum+=n1;
}

n1++;
}
System.out.println(" sum is "+sum);
}
}