public class divnconq
{
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //mergesort first part(recursion applied)
    public static void mergesort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;//(si+ei)/2
        mergesort(arr,si,mid);//left part
        mergesort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    //merge sort second part(sorting,adding of value from temp to original arr is done)
    public static void merge(int arr[],int si,int mid,int ei)
    {
        //temp array created, +1 is added to balance indexing as it is from 0
        int temp[]=new int[ei-si+1];
        int i=si;//iterate for left part
        int j=mid+1;//iterate for right part
        int k=0;///iterate for temp array
        //elements are compared here
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part(left over sorting)
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
    //quick sort
    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        //last element
        int pidx=partition(arr,si,ei);
        quicksort(arr,si,pidx-1);//left
        quicksort(arr,pidx+1,ei);//right
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;//to make space for elements smaller than pivot
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    //search in rotated sorted array
    public static int search(int arr[],int tar,int si,int ei)
    {
        //base case
        if(si>ei)
        {
            return -1;
        }
        //kaam
        int mid=si+(ei-si)/2;//(si+ei)/2
        //case found
        if(arr[mid]==tar)
        {
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid])
        {
            //case a:left
            if(arr[si]<=tar&&tar<=arr[mid])
            {
                return search(arr,tar,si,mid-1);
            }
            else{
                //case b:right
                return search(arr,tar,mid+1,ei);
            }
        }
        //mid on L2
        else{
            //case c:right
            if(arr[mid]<=tar&&tar<=arr[ei])
            {
                return search(arr,tar,mid+1,ei);
            }
            else
            {
                //case d:left
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[])
    {
        //int arr[]={6,3,9,8,2,5,-2};
        //mergesort(arr,0,arr.length-1);
        //printArr(arr);
        //quicksort(arr,0,arr.length-1);
        //printArr(arr);
        int arr1[]={4,5,6,7,0,1,2};
        int target=0;//output=4
        int taridx=search(arr1,target,0,arr1.length-1);
        System.out.println(taridx);
    }
}