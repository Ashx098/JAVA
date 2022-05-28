class arr
{
public static void main(String[] args)
{
int a[]={8,1,22,3,44,5};
int b[]=new int[a.length];
for(int i=5;i>=0;i--)
{
for(int j=0;j<=5;j++)
{
b[j]=a[i];
}
}
System.out.print("Array A is :");
for(int l=0;l<=5;l++)
{
System.out.print(a[l]+" ");
}
System.out.print("\n Array rev is :");
for(int k=0;k<=5;k++)
{
System.out.print(b[k]+" ");
}}}