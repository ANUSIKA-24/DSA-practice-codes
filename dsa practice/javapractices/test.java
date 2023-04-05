import java.util.*;
public class test
{
public static void maxsubarray(int arr[])
{
    int cursum=0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[arr.length];
    //calculate prefix array
    prefix[0]=arr[0];
    for(int i=1;i<prefix.length;i++)
    {
        prefix[i]=prefix[i-1]+arr[i];
    }
    for(int i=0;i<arr.length;i++)
{
    int start=i;
    for(int j=i;j<arr.length;j++)
    {int end=j;
        cursum=start==0?(prefix[end]):(prefix[end]-prefix[start-1]);
        //for(int k=start;k<=end;k++)
        //{
            //System.out.println(arr[k]+" ");
            //cursum=cursum+arr[k];
        //}
        System.out.println(cursum);
        if(cursum>maxsum)
        maxsum=cursum;
    }
    //System.out.println();
}
//System.out.println();
System.out.println("maximum sum of subarray is "+maxsum);
}
public static void kadanes(int arr[])
{
    int currentsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        currentsum=currentsum+arr[i];
        {
            if(currentsum<0)
            currentsum=0;
        }
        System.out.println(currentsum);
        maxsum=Math.max(currentsum,maxsum);
    }
    System.out.println("maximum subarray sum using kadanes is "+maxsum);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int arr[]=new int[8];
System.out.println("enter 8 elements in an array");
for(int i=0;i<8;i++)
{
arr[i]=in.nextInt();
}
maxsubarray(arr);
}
}