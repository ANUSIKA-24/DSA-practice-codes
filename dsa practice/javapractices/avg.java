import java.util.*;
public class avg
{
public static void average(int a,int b,int c)
{
int aver=0;
aver=(a+b+c)/3;
System.out.println("average of 3 no. is= "+aver);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int x,y,z;
System.out.println("enter 3 no.s to find its average");
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
average(x,y,z);
}
}