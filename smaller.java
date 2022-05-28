/**
An interviewer asked a job seeker to find the smaller of two numbers 
when numbers are integer
and also when the numbers are real (float numbers) by applying overloading
 and static context
in the program and finally display the output. 
Think you as a job seeker and solve the problem
by satisfying the requirement given by the interviewer.*/

class smaller
{
smaller(int a,int b)
{
if(a<b) System.out.println(a+" is smaller");
else System.out.println(b+" is smaller");
}

smaller(float x,float y)
{
if(x<y) System.out.println(x+" is smaller");
else System.out.println(y+" is smaller");
}

public static void main(String[] args)
{
smaller obj1=new smaller(10,11);
smaller obj2=new smaller(5.9f,4.776f);
}
}