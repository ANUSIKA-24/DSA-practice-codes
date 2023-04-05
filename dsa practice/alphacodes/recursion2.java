public class recursion2
{
//find all occurances of the given element in the array
    public static void alloccurances(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==key)
        {
            System.out.print(i+" ");
        }
        alloccurances(arr,key,i+1);
    }
//2019="two zero one nine"
static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
public static void printdigits(int number)
{
    if(number==0)
    {
        return;
    }
    int lastdigit=number%10;
    printdigits(number/10);
    System.out.print(digits[lastdigit]+" ");
}
//find length of a string using recursion
public static int length(String str)
{
    if(str.length()==0)
    {
        return 0;
    }
    return length(str.substring(1))+1;
}
//count of all contiguous substring starting and ending with the same character
public static int countsubstrs(String str,int i,int j,int n)
{
    if(n==1)
    {
        return 1;
    }
    if(n<=0)
    {
        return 0;
    }
    int res=countsubstrs(str,i+1,j,n-1)+countsubstrs(str,i,j-1,n-1)-countsubstrs(str,i+1,j-1,n-2);
    if(str.charAt(i)==str.charAt(j))
    {
        res++;
    }
    return res;
}
//tower of hanoi
public static void towerofhanoi(int n,String src,String helper,String dest)
{
    if(n==1)
    {
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        return;
    }
    //transfer top n-1 from src to helpeer using dest as helper
    towerofhanoi(n-1,src,dest,helper);
    //transfer nth fronm src to dest
    System.out.println("transfer disk"+n+"from"+src+"to"+helper);
    //transfer n-1 from helper to dest during src as helper
    towerofhanoi(n-1,helper,src,dest);
}
public static void main(String args[])
{
    int arr[]={3,2,4,5,6,2,7,2,2};
    int key=2;
    alloccurances(arr,key,0);
    System.out.println();
    printdigits(1234);
    System.out.println();
    String str="abcab";
    System.out.println(length(str));
    int n=str.length();
    System.out.println(countsubstrs(str,0,n-1,n));
    int num=4;
    towerofhanoi(num,"A","B","C");
}
}