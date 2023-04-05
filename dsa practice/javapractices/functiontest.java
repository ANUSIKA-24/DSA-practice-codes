import java.util.*;
public class functiontest
{
public static void function(int a,int b)
{
System.out.println("minimum is="+(Math.min(a,b)));
System.out.println("maximum is="+(Math.max(a,b)));
System.out.println("a to the power b="+(Math.pow(a,b)));
}
public static void avg(int a,int b,int c)
{
int average=a+b+c/3;
System.out.println("average is"+average);
}
public static void function(int a)
{
System.out.println("square root is"+(Math.sqrt(a)));
System.out.println("absolute value is="+(Math.abs(a)));
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int x,a,b,c;
System.out.println("enter 2 no. to check maximum,minimum,power");
System.out.println("enter 3 no. to check average");
System.out.println("enter 1 no. to check squareroot and absolute value");
x=in.nextInt();
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
function(x);
function(a,b);
avg(a,b,c);
}
}