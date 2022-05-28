import java.util.*;
class market
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String fruits[]=new String[5];
int cost[]=new int[5]; int totcost=0;
for(int i=0;i<5;i++)
{
System.out.println("Enter name of fruit : ");
fruits[i]=in.next();
System.out.println("Enter cost : ");
int x=in.nextInt();
cost[i]=x;
totcost=totcost+x;
}
System.out.println("Total cost : "+totcost);
for(int j=0;j<5;j++)
{
System.out.println("fruit : "+fruits[j]);
System.out.println("cost : "+cost[j]);
}
}
}