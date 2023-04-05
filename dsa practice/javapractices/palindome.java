import java.util.*;
public class palindrome
{
public static void palindrome(int n)
{
int d,r=0,no;
no=n;
while(n>0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
if(no==r)
System.out.println("it is a palindrome no.");
else
System.out.println("not a palindome no.");
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int x;
System.out.println("enter a no. to check palindome or not");
x=in.nextInt();
palindrome(x);
}
}