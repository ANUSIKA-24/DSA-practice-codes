public class bubble 
{
   public static void bubble(int nums[])
   {
   int temp=0;
   for(int i=0;i<nums.length-1;i++)
   {//temp=0;
    for(int j=0;j<(nums.length-1-i);j++)
    {
        if(nums[j]>nums[j+1])
        { 
            temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
        }
    }
}
public static void selection(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
        int smallest=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[smallest]>arr[j])
            smallest=j;
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    /*for(int i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();*/
}
   public static void printarr(int arr[])
   {
    for(int i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();

   }
public static void main(String args[])
{
    int arr[]={2,4,5,7,6,3,0};
    selection(arr);
    printarr(arr);
    
}
}
