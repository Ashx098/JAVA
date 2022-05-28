import java.util.*;
class covidprotocol
{
int n=0;
void A(int roll_number)
{
n=roll_number;
if(n%2==0)
{
System.out.println("You have to come to collage on Tuesday, Thursday, Saturday");
}
else
{
System.out.println("You have to come to collage on Monday, Wednesday, Thursday");
}
}

public static void main(String[] args)
{
int a;
Scanner in=new Scanner(System.in);
covidprotocol obj= new covidprotocol();
System.out.println("Enter your roll number : ");
a=in.nextInt();
obj.A(a);
}
}