class  methods
{
int sub()
{
int sub=7-3;
return sub;
}
int sub (int x,int y)
{
int sub=x-y;
return sub;
}
float sub (float m, float n)
{
float sub=m-n;
return sub;
}
double sub(int p,float q)
{
double sub=p-q;
return sub;
}

public static void main(String[] args)
{
methods ampana = new methods();
System.out.println(ampana.sub());
System.out.println(ampana.sub(7.8f,3.6667f));
System.out.println(ampana.sub(10,9));
System.out.println(ampana.sub(12,6.87654f));
}
}