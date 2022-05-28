class employee
{
    int id; String name; float salary;
    void insert(int i, String n, float s)
    {
        id=i; name=n; salary=s;
    }
    void dispaly()

        {
            System.out.println(id+" "+name+" "+salary);
        }
         
}
public class TestEmployee
{

    public static void main(String[] args)
    {
        employee e1=new employee();
        employee e2=new employee();
        
        e1.insert(1,"Aviinash",100000.0f);
        e2.insert(1,"krish",890000.0f);
            e1.dispaly();
    }
}