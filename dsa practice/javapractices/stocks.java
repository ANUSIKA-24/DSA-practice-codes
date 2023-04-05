import java.util.*;
public class stocks 
{
 public static int buyandsellstock(int prices[])
 {
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++)
    {
        if(buyprice<prices[i])
        {
            //profit
            int profit=prices[i]-buyprice;//todays profit
            maxprofit=Math.max(maxprofit,profit);
        }
        else
        {
            buyprice=prices[i];
        }
    }
    return maxprofit;
 }
 public static void main(String args[])
 {
    int prices[]={7,6,4,3,1};
    System.out.println(buyandsellstock(prices));
 }   
}
