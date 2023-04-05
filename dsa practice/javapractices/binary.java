import java.util.*;
public class binary
{
public static int binary(int arr[],int n)
{
int l=0,m,value=0;
m=(arr.length)/2;
if(n==m)
return m;
if(n>m)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==n)
value=arr[i];
}
}
else
{
for(int i=0;i<m;i++)
{
if(arr[i]==n)
value=arr[i];
}
}
return value;
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int arr[]=new int[10];int s;
System.out.println("enter 10 elements in an array in ascending order");
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
}
System.out.println("enter search element");
s=in.nextInt();
int result=binary(arr,s);
if(result==s)
System.out.println("FOUND");
else
System.out.println("NOT FOUND");
}
}
