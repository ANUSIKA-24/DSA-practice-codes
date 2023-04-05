import java.util.*;
public class sumofdigits
{
public static void sum(int n)
{
int d,s=0;
while(n>0)
{
d=n%10;
s=s+d;
n=n/10;
}
System.out.println("sum of the digits is= "+s);
}
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("enter a number to find sum of its digits");
n=in.nextInt();
sum(n);
}
}
