import java.util.*;
class CR
{
String name[]=new String[3];String n;int roll;
int r[]=new int[3];
void read()
{
Scanner in=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("Enter name : ");
name[i]=in.next();
System.out.println("Enter roll no : ");
r[i]=in.nextInt();
}
}
void display()
{
for(int i=0;i<3;i++)
{
System.out.println("name : "+name[i]);

System.out.println("roll no : "+r[i]);
}
}
void read(String n,int roll)
{
this.n=n;
this.roll=roll;
System.out.println("NAme is "+n+" Roll no: "+roll);
}

public static void main(String args[])
{
CR obj=new CR();
obj.read(args[0],21);
obj.read();
obj.display();
}
}