
class sum
{

sum(int x)
{
System.out.println(x+7);
}
sum()
{
System.out.println("I'm gng to display the sum");
}
sum(int a,int b)
{
System.out.println(a+b);
}
public static void main(String args[])
{
sum obj1=new sum();
sum obj2=new sum(10);
sum obj3=new sum(10,5);



}
}