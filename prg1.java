import java.util.*;
class prg1
{
	public static void main(String[] args)
	{
		String flavour;int n, price=0;
    Scanner in=new Scanner(System.in);
	System.out.println("Ice cream flavour :         Rate per scoop");
	System.out.println("Chocolate :         20");
	System.out.println("mango :         15");
	System.out.println("vanilla :         10");
	System.out.println("any combo :         30");
	System.out.println("Enter Flavour : ");
	flavour=in.nextLine();
	System.out.println("Enter No.of scoops : ");
	n=in.nextInt();
	switch(flavour.toLowerCase())
			{
	          case "chocolate" : price=n*20;  break;
	           case "mango" : price=n*15;  break;
	           case "vanilla" : price=n*10;  break;
	          case "any combo" : price=n*30;  break;
	            default : System.out.println("Wrong input");
	        }
	System.out.println("You are served "+flavour.toUpperCase()+" Softy & price = Rs "+price);
	
	}
}