
class sum
{

sum(int x)
{
System.out.println(x+7);
}
sum(int x,int y)
{
System.out.println(x+y);
}
sum(int e,int f,int g)
{
System.out.println(e+f+g);
}

sum(int c,double d)
{
System.out.println(c+d);
}
public static void main(String args[])
{
calculator obj1=new calculator();
obj1.sum(7);
calculator obj2=new calculator();
obj2.sum(8,9);
calculator obj3=new calculator();
obj3.sum(7,10,3);
calculator obj4=new calculator();
obj4.sum(5,10.5);


}
}