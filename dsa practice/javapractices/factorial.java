import java.util.*;
public class factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=0,f=1,i;
System.out.println("enter a number to find its factorial");
n=in.nextInt();
for(i=1;i<=n;i++)
f=f*i;
System.out.println("factorial is="+f);
in.close();
}
}