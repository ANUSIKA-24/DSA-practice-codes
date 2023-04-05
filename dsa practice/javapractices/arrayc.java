import java.util.*;
public class arrayc
{
public static int linear(int arr[],int n)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==n)
return 1;
}
return -1;
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
System.out.println(" enter the value to be searched");
int s=in.nextInt();
int result=linear(arr,s);
if(result==1)
System.out.println("element is present in the array");
else
System.out.println("element is not present in the array");
}
}
