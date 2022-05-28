import java.util.*;
class CABS
{
private int cabNumber,chargesPerKm,distance,amount; public char cityType; int ch;

CABS()
{
cityType='A';
cabNumber=1737;
System.out.println("City Type: "+cityType+"   Cab Number: "+cabNumber);
}
CABS( char cityType, int cabNumber)
{
this.cityType=cityType; this.cabNumber=cabNumber;
System.out.println("City Type: "+cityType+"   Cab Number: "+cabNumber);
}
public int charges(char cityType)
{
this.cityType=cityType;
switch(cityType)
{
case 'A': ch= 25; break;
case 'B': ch=20; break;
case 'C': ch=15; break;
default : System.out.println("Wrong input"); 
}
return ch;
}

CABS(char cityType){this.cityType=cityType; 
System.out.println(cityType);}}
class Taxi extends CABS

{

public static void main(String[] args)
{
  
}
void registerCab()
{
System.out.println(charges('B'));
}
}
class x
{
  public static void main(String[] args)
  {
    Taxi obj1=new Taxi(); //Taxi obj=new Taxi();
    //char c='C'; int i=779;

    Taxi obj2=new Taxi('c');

    System.out.println("CABS"); 

    obj1.registerCab();
  }
}