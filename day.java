/**
Write a prog to take a date from the user and display 
which week is that day of a month.
day 1 of the month is monday
2........tuesday
3...........wed

7...........sunday */

import java.util.*;
class day
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter date of the month ");
int day=in.nextInt();
if(day>=1&&day<=31)
{
switch(day%7)
{
case 1: System.out.println("Monday"); break;
case 2: System.out.println("tuesday"); break;
case 3: System.out.println("wednesday"); break;
case 4: System.out.println("thursday"); break;
case 5: System.out.println("friday"); break;
case 6: System.out.println("satday"); break;
case 7: System.out.println("sunday"); break;
}
}
else 
{
System.out.println("wrong input");
}
}
}









