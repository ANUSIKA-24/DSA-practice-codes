import java.util.*;
public class table
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=0,i,m;
System.out.println("enter a number to print its multiplication table");
n=in.nextInt();
for(i=1;i<=10;i++){
m=n*i;
System.out.println(n+"x"+i+"="+m);}
in.close();
}
}