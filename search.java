import java.util.*;
class search
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int ar[]=new int[5]; System.out.println("enter elements ");
for(int i=0;i<ar.length;i++)
{
int temp=in.nextInt();  ar[i]=temp;
}

for(int i=0;i<ar.length;i++)
{
for(int j=i+1;j<ar.length;j++)
{ 
int temp=0;
if(ar[i]<ar[j]){ temp=ar[i]; ar[i]=ar[j]; ar[j]=temp;
}
}
}
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}

//Arrays.sort(ar);
//for(int i=0;i<ar.length;i++)
//{
//System.out.print(ar[i]+" ");
//}
}
}