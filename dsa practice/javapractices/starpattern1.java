public class starpattern1
{
public static void main(String args[])
{
int i,j,a=65;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
char value=(char)a;
System.out.print(value);
a++;
}
System.out.println();
}
}
}