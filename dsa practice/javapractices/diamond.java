public class diamond
{
public static void diamond(int n)
{
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=(n-i);j++)
{
System.out.print(" ");
}
for(j=1;j<=(2*i-1);j++)
{
System.out.print("*");
}
System.out.println();
}
for(i=n;i>=1;i--)
{
for(j=1;j<=(n-i);j++)
{
System.out.print(" ");
}
for(j=1;j<=(2*i-1);j++)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[])
{
diamond(10);
}
}