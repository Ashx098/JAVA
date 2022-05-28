import java.util.*;
class stackimp
{
	public int top=-1,size;
	int a[];
	stackimp(int size)
	{
		this.size=size;
		a=new int[size];
	}
	void push(int ele)

	{
		if (isfull()!=true) 
		{
			a[++top]=ele;	
		}
		else
		{
			System.out.println("THE STACK IS FULL, CANNOT INSERT");
		}
	}

	void pop()

	{
		if (isempty()!=true) 
		{
				System.out.println(a[top--]);
		}
		else
		{
			System.out.println("THE STACK IS Empty");
		}
	}

	void peak()

	{
		System.out.println(a[top]);
	}

	boolean isfull()
	{

		if(top+1==size) return true;
		else return false;

	}

	boolean isempty()
	{

		if(top==-1) return true;
		else return false;
		
	}

	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+"  ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of stack : "); int cap=in.nextInt();
		stackimp obj=new stackimp(cap);
		System.out.println(" 1. To push \n 2. To pop \n 3. To peak \n 4. To display Stack elements \n 5. To exit" );
		while(true)
		{
			System.out.print("Enter your choice : "); int c=in.nextInt();
			switch(c)
			{
			
			case 1: System.out.print("Enter element to scan : ");int item=in.nextInt();obj.push(item); break;

			case 2: System.out.print("Enter element to pop : "); obj.pop(); break;

			case 3: System.out.print("Enter element to peak : "); obj.peak(); break;

			case 4: obj.display(); break;

			case 5: System.out.println("Thanks for using stacks"); System.exit();
			default: System.out.println("Wrong choice");
			}
		}
	}
}