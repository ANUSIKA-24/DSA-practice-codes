public class pyramid
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(k=1;k<=i;k++)
{
System.out.print(" ");
}
for(j=1;j<=4-i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}