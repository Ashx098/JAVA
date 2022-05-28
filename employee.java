import java.util.*;
class Employee
{
String Id, Name;
int Age;
float Salary;
static float totalsalary;
Scanner input=new Scanner(System.in);
void read(){
System.out.println(“enter the employee Name, Id, Age and Salary”);
Id=input.nextLine();
Name=input.nextLine();
Age=input.nextInt();
Salary=next.Float();
totalsalary+= Salary;
}
void read(String Id){
this.Id=Id;
System.out.println(“enter the employee Name, Age and Salary”);
Name=input.nextLine();
Age=input.nextInt();
Salary=next.Float();
totalsalary+= Salary;
}
void read(String Id, String Name){
this.Id=Id;
this.Name=Name;
System.out.println(“enter the employee Age and Salary”);
Age=input.nextInt();
Salary=next.Float();
totalsalary+= Salary;
}
Employee(){
Id=”123”;
Name=”Presi”;
Age=25;
Salary=20000.00;
totalsalary+= Salary;
}
Employee(String Id, String Name, int Age, float Salary){
this.Id=Id;
this.Name=Name;
this.Age=Age;
this.Salary=Salary;
totalsalary+= Salary;
}
Employee(Employee emp){
Id=emp.Id;
Name=emp.Name;
Age=emp.Age;
Salary=emp.Salary;
totalsalary+= Salary;
}
void Display()
{
System.out.println(“Employee Details are:”)
System.out.println(“Name= “+Name+”\nId= “+Id+”\nAge= “+Age+”\nSalary=
”+Salary )
System.out.println(“Total Salary Expenditure = ”+totalsalaryary);
}
}