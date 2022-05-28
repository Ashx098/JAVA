class sponsorship
{
public static void main(String[] args)
{
//int balls[]={12,15}; int bats[]={45,38};int gloves[]={15,17};
int team_a[]={12,45,15}; int team_b[]={15,38,17};
int prices[]={9,80,60}; int price_a=0,price_b=0;
for(int i=0;i<3;i++)
{
price_a+=team_a[i]*prices[i];
price_b+=team_b[i]*prices[i];
}
System.out.println("The expenditure on team A : "+price_a);
System.out.println("The expenditure on team B : "+price_b);
}
}