import java.util.*;
public class largest
{
public static int largest(int arr[])
{
int l=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>l)
l=arr[i];
}
return l;
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int arr[]=new int[10];int n;
System.out.println("enter 10 elements in an array");
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
}
int result=largest(arr);
System.out.println("largest element is= "+result);
}
}
