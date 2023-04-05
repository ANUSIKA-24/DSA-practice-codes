import java.util.*;
public class reverse
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,d,r=0;
System.out.println("enter a number to find its reverse");
n=in.nextInt();
while(n>0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
System.out.println("reverse is:- "+r);
in.close();
}
}
