import java.util.*;
public class selection
{
public static void sorting(int a[])
{
int min_value=0;
int n=a.length;
for(int i=0;i<n-1;i++)
{
min_value=i;
for(int j=i+1;j<n;j++)
{
min_value=j;
if(a[j]<a[min_value])
{
int temp=a[j];
a[j]=a[min_value];
a[min_value]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
public static void main(String args[])
{
int a[]={2,4,5,6,1,8};
sorting(a);
}
}

