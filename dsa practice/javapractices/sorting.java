public class sorting
{
 public static void insertionsort(int arr[])
 {
    for(int i=1;i<arr.length;i++)
    {
        int current=arr[i];
        int prev=i-1;
        //finding out the correct pos to insert
        while((prev>=0)&&(arr[prev]<current))
        {
            arr[prev+1]=arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1]=current;
    }
 }
 public static void printarr(int arr[])
 {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();    
 }
 public static void countingsort(int arr[])
 {
    int largest=Integer.MIN_VALUE;
    {
        for(int i=0;i<arr.length;i++)
        largest=Math.max(largest,arr[i]);
    }
    int count[]=new int[largest+1];
    for(int i=0;i<arr.length;i++)
    {
        count[arr[i]]++;
    }
    //sorting
    int j=0;
    for(int i=count.length-1;i>=0;i--)
    {
        while(count[i]>0)
        {
            arr[j]=i;
            j++;
            count[i]--;
        }
    }

 }
 public static void bubblesort(int nums[])
 {
 int temp=0;
 for(int i=0;i<nums.length-1;i++)
 {
  for(int j=0;j<(nums.length-1-i);j++)
  {
      if(nums[j]<nums[j+1])
      { 
          temp=nums[j];
          nums[j]=nums[j+1];
          nums[j+1]=temp;
      }
  }
}
}
public static void selectionsort(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
        int smallest=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[smallest]<arr[j])
            smallest=j;
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
}
 public static void main(String args[])
 {
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    //int arr1[]={4,5,7,4,6,7,5,2,1,8,3};
    //int arr2[]={1,3,2,5,6,7,4,0,9,8,2};
    //int arr3[]={8,0,5,4,6,8,9,2,1,5,7,8};
    System.out.println("using bubble sort:");
    bubblesort(arr);
    printarr(arr);
    System.out.println("using selection sort:");
    selectionsort(arr);
    printarr(arr);
    System.out.println("using insertion sort:");
    insertionsort(arr);
    printarr(arr);
    System.out.println("using counting sort:");
    countingsort(arr);
    printarr(arr);
 }   
}
