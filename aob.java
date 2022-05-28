class aob
{
public static void main(String[] args)
{
product[] obj= new product[6];
obj[0]= new product(1, "Dell");
obj[1]= new product(11, "hp");
obj[2]= new product(111, "lenovo");
obj[3]= new product(1111, "asus");
obj[4]= new product(2, "lrgion 5");
obj[5]= new product(22, "mcqueen");

System.out.println("Product obj 1 ");
obj[0].display();
System.out.println("Product obj 2 ");
obj[1].display();
System.out.println("Product obj 3 ");
obj[2].display();
System.out.println("Product obj 4 ");
obj[3].display();
System.out.println("Product obj 5 ");
obj[4].display();
System.out.println("Product obj 6 ");
obj[5].display();
}
}
class product
{
int id; String name;
product(int p, String n)
{
id=p; name=n;
}
public void display()
{
System.out.println("Product ID "+id+ " Product name : "+name+"\n");
}}