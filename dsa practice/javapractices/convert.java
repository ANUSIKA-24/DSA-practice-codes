import java.util.*;
public class convert
{
public static void dectobin(int n)
{
int pow=0,rem;
int bin=0;
int no=n;
while(n>0)
{
rem=n%2;
bin=bin+(rem*(int)Math.pow(10,pow));
pow++;
n=n/2;
}
System.out.println("value of "+no+" in binary is= "+bin);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("enter a no. to convert from decimal to binary");
n=in.nextInt();
dectobin(n);
}
}