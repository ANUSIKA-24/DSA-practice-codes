import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two number is = "+sum);
        Sc.close();
    }
}