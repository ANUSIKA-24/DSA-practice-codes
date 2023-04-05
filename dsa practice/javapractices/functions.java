import java.util.*;
public class functions
{
public static void factorial(int n)
{
if(n>0)
System.out.println("factorial of "+n+" is= "+(n*(n-1)));
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter a number to find its factorial");
int n=in.nextInt();
factorial(n);
}
}