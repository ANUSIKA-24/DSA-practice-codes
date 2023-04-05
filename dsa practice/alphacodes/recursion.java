public class recursion
{
    public static void main(String args[])
    {
        //int arr[]={8,3,6,9,5,10,2,5,3};
        //String str="appnnacollege";
        //removeduplicates(str,0,new StringBuilder(""),new boolean[26]);
        printbinstring(3,0,"");
    }
//to print numbers in decreasing order
public static void numberdecrease(int num)
{
    if(num==1)
    {
        System.out.println(num+" ");
        return;
    }
    System.out.println(num+" ");
    numberdecrease(num-1);
}
//to print numbers in increasing order
public static void numberincrease(int num)
{
    if(num==1)
    {
        System.out.println(num+" ");
        return;
    }
    numberincrease(num-1);
    System.out.println(num+" ");
}
//to print factorial of a number 
public static int factorial(int num)
{
    if(num==0)
    {
        return 1;
    }
    return num*(factorial(num-1));
}
//to print sum of n natural numbers
public static int sum(int num)
{
    if(num==1)
    {
        return 1;
    }
    return num+sum(num-1);
}
//print the nth fibonacci number
public static int fibonacci(int num)
{
    if((num==0)||(num==1))
    {
        return num;
    }
    int f=fibonacci(num-1);
    int s=fibonacci(num-2);
    int result=f+s;
    return result;
}
//check if a given array is sorted or not
public static boolean issorted(int arr[], int i)
{
    if(i==arr.length-1)//base case
    {
        return true;
    }
    if(arr[i]>arr[i+1])
    {
        return false;
    }
    return issorted(arr,i+1);
}
//to find the first occurance of an element in an array
public static int firstoccurance(int arr[],int i,int key)
{
    if(arr[i]==arr.length)
    {
        return -1;
    }
    if(arr[i]==key)
    {
        return i;
    }
    return firstoccurance(arr,i+1,key);
}
//to find the last occurance of an element in an array
public static int lastoccurance(int arr[],int key,int i)
{
    if(i==arr.length)
    {
        return -1;
    }
    int isfound=lastoccurance(arr,key,i+1);
    if(isfound==-1&&arr[i]==key)
    {
        return i;
    }
    return isfound;
}
//to calculate x^n
public static int power(int x,int n)
{
    if(n==0)
    {
        return 1;
    }
    //int xnm1=power(x,n-1);
    //int xn=x*xnm1;
    //return xn;
    return x*power(x,n-1);
}
// x^n optimized
public static int optimizedpower(int a,int n)
{
    if(n==0)
    {
        return 1;
    }
    int halfpower=optimizedpower(a,n/2);
    int halfpowersq=halfpower*halfpower;
    //if n is odd
    if(n%2!=0)
    {
        halfpowersq=a*halfpowersq;
    }
    return halfpowersq;
}
//tiling problem
public static int tilingproblem(int n)
{
    //basecase
    if(n==0||n==1)
    {
        return 1;
    }
    //vertical choice
    int fnm1=tilingproblem(n-1);
    //horizontal choice
    int fnm2=tilingproblem(n-2);
    int totalways=fnm1+fnm2;
    return totalways;
}
//remove duplicates in a string
public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[])
{
    if(idx==str.length())
    {
        System.out.println(newstr);
        return;
    }
    //kaam
    char currchar=str.charAt(idx);
    if(map[currchar-'a']==true)
    {
        //duplicate
        removeduplicates(str,idx+1,newstr,map);
    }
    else{
        map[currchar-'a']=true;
        removeduplicates(str,idx+1,newstr.append(currchar),map);
    }
}
//friends pairing problem
public static int friendspairing(int n)
{
    //base case
    if(n==1||n==2)
    {
        return n;
    }
    //choice
    //single
    int fnm1=friendspairing(n-1);
    //pair
    int fnm2=friendspairing(n-2);
    int pairways=(n-1)*fnm2;
    //totalways
    int totalways=fnm1+pairways;
    return totalways;
    //in one line return fiendspairing(n-1)+(n-1)*friendspairing(n-2);
}
//print all binary strings of size n without consecutive ones
public static void printbinstring(int n,int lastplace,String str)
{
    //basecase
    if(n==0)
    {
        System.out.println(str);
        return;
    }
    //kaam
    printbinstring(n-1,0,str+"0");
    if(lastplace==0)
    {
        printbinstring(n-1,1,str+"1");
    }
}
}
