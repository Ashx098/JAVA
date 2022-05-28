import java.util.*;
class Bill
{
void Bill(Stringcard_type)
{
int Total_Pay,Pay_after_Discount;
System.out.println(“Enter the Total amount to be paid”);
Scannersc=newScanner(System.in);
Total_Pay=sc.nextInt();
switch(card_type){
case “HDFC”:
Pay_after_Discount=Total_Pay-0.15*Total_Pay;
System.out.println(“The Payable Amount after Discount=”+Pay_after_Discount);
break;
case “SBI”:
Pay_after_Discount=Total_Pay-0.10*Total_Pay;
System.out.println(“The Payable Amount after Discount=”+Pay_after_Discount);
break;
case “AXIS”:
Pay_after_Discount=Total_Pay-0.08*Total_Pay;
System.out.println(“The Payable Amount after Discount=”+Pay_after_Discount);
break;
default:
System.out.println(“wrongchoice”);
}
public static void main(String[] args)
{
Bill ob=new Bill();
Bill.ob();
}
}