/** class Rectangle
{
int area=0;
void area()
{
int length=10;int breadth=5;
area=length*breadth;
System.out.println("Area is : "+area); 
}
void area(int s)
{
area=s*s;
System.out.println("Area is : "+area); 
}
void area(int l, int b)
{
area=l*b;
System.out.println("Area is : "+area);
}
public static void main(String[] args)
{
Rectangle o=new Rectangle();
o.area();o.area(15);o.area(2,3);
}
} */

class Rectangle
{
int area=0,length,breadth;
Rectangle()
{
length=10; breadth=5;
}
Rectangle (int s)
{
length=s; breadth=s; 
}
Rectangle(int l, int b)
{
length=l; breadth=b; }

int area()
{
  area=length*breadth; return area;
}

public static void main(String[] args)
{
Rectangle o=new Rectangle(); 
System.out.println("Area 1 is : "+o.area());
Rectangle o1=new Rectangle(10);
System.out.println("Area 2 is : "+o1.area());
Rectangle o2=new Rectangle(5,7);
System.out.println("Area 3 is : "+o2.area());
}
}



/* class temp{
public static void main(String[] args)
{
Rectangle o=new Rectangle();
Rectangle o1=new Rectangle(10);
Rectangle o2=new Rectangle(5,7);
}
} */