import java.util.*;
public class oops
{
    public static void main(String args[])
    {
        number(10);
    }
public static void number(int num)
{
    if(num==1)
    {
        System.out.println(num+" ");
        return;
    }
    System.out.println(num+" ");
    number(num-1);
}
}