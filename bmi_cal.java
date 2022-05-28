import java.util.*;
class bmi_cal
{
int w; double bmi,h;
void BMI(int weight,int height)
{
w=weight; h=height*0.305;
double r=w/(h*h);
bmi=r;
}
void display()
{
if(bmi<18.5)
{
System.out.println("\n BMI value is "+bmi+" it is underweight");
}
else if(bmi>18.5 && bmi<=24.9)
{
System.out.println("\n BMI value is "+bmi+" it is Normal");
}
else
{
System.out.println("\n BMI value is "+bmi+" it is OBESE");
}
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int a,b;
bmi_cal obj=new bmi_cal();
System.out.print("Enter Weight(in KGS) : ");
a=in.nextInt();
System.out.print("Enter Height(in Feet) : ");
b=in.nextInt();
obj.BMI(a,b);
obj.display();
}
}