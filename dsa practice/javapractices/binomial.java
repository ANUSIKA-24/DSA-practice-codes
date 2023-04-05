import java.util.*;
public class binomial
{
public static int binomial(int n,int r)
{
int f,rf;
rf=n-r;
if(n>0){
f=(n*(n-1))/(r*(r-1))*(rf*(rf-1));
return f;
}
else
return 0;
}
public static void main(String args[])
{
int f;
Scanner in=new Scanner(System.in);
System.out.println("enter value of n and r to find its binomial coefficient");
int n=in.nextInt();
int r=in.nextInt();
f=binomial(n,r);
System.out.println("binomial coefficient is= "+f);
}
}