import java.util.*;
class CABS
{
private int cabNumber,chargesPerKm,distance,amount; private char cityType;

CABS()
{
cityType='A';
cabNumber=1737;
System.out.println("City Type: "+cityType+"   Cab Number: "+cabNumber);
}
CABS(char cityType, int cabNumber)
{
this.cityType=cityType; this.cabNumber=cabNumber;
System.out.println("City Type: "+cityType+"   Cab Number: "+cabNumber);
}
int charges(char cityType)
{
this.cityType=cityType;
switch(cityType)
{
case 'A': return 25; 
case 'B': return 20; 
case 'C': return 15; 
default : System.out.println("Wrong input"); return 0;
}
}
public static void main(String[] args)
{}
}
class Taxi extends CABS
{

public static void main(String[] args)
{
Taxi obj1=new Taxi();
//Taxi obj2=new Taxi('B',1887);

System.out.println("CABS");
}
}