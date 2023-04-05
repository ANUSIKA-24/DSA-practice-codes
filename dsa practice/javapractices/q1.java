import java.util.*;
public class q1 
{
    public static boolean check(int nums[])
    {
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {counter=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                counter++;
            }
        }
        if(counter>=2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int nums[]={1,2,4,5,6,7,8};
        System.out.println(check(nums));
    }
}
