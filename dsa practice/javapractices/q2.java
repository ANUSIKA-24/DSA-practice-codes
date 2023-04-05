import java.util.*;
public class q2 
{
    public static boolean check(int nums[],int target)
    {
        int counter=0;
        int nuarray[]=new int(nums.length);
        for(int i=0;i<nums.length;i++)
        {counter=0;
            for(int j=0;j<nums.length;j++)
            {
                if(target==nums[i])
                nuarray[j]=nums[j];
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
        int target=3;
        System.out.println(check(nums),target);
    }
}
