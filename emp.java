import java.util.*;
class emp
{
int salary;
String name;
String date;
int id;
int expenditure=0;
emp()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Employee name : ");
name=in.next();
System.out.println("Enter Employee joining date : ");
date=in.next();
System.out.println("Enter Employee id : ");
id=in.nextInt();
System.out.println("Enter Employee salary : ");
salary=in.nextInt();
expenditure=expenditure+salary;
}
emp(String n,String dt,int sal,int i)
{
name=n; date=dt; salary=sal; id=i; expenditure+=salary;
System.out.println("Expenditure on salaries is "+expenditure);

}

void display()
{
System.out.println("Expenditure on salaries is "+expenditure);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String x,d; int a,b;
emp o=new emp();
o.display();
for(int j=1;j<=5;j++){
System.out.println("Enter name , date, salary and id ");
x=in.next();d=in.next();a=in.nextInt();b=in.nextInt();
 emp o1=new emp(x,d,a,b);}
}
}
class test
{
public static void main(String args[])
{
emp obj=new emp();
emp obj1=new emp();
emp obj2=new emp("Kamal","22/11/2014",60000,101); 
}
}