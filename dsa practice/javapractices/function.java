import java.util.*;
public class function
{
public static int factorial(int n)
{
if(n>0)
return (n*(n-1));
else
return 0;
}
public static void main(String args[])
{
int f;
Scanner in=new Scanner(System.in);
System.out.println("enter a number to find its factorial");
int n=in.nextInt();
f=factorial(n);
System.out.println("factorial of "+n+" is= "+f);
}
}