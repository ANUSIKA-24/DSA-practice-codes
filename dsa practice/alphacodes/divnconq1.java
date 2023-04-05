public class divnconq1
{
    //function to merge sort 2 arrays
    public static String[] mergesort(String[] arr,int lo,int hi)
    {
        if(lo==hi)
        {
            String[] A={arr[lo]};
            return A;
        }
        int mid=lo+(hi-lo)/2;
        String[] arr1=mergesort(arr,lo,mid);
        String[] arr2=mergesort(arr,mid+1,hi);
        String[] arr3=merge(arr1,arr2);
        return arr3;
    }
    static String[] merge(String[] arr1, String[] arr2)
    {
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m&&j<n)
        {
            if(isalphabeticallysmaller(arr1[i],arr2[j]))
            {
                arr3[idx]=arr1[i];
                i++;
                idx++;
            }
            else{
                arr3[idx]=arr2[j];
                j++;
                idx++;
            }
        }
        while(i<m)
        {
            arr3[idx]=arr1[i];
            i++;
            idx++;
        }
        while(j<n)
        {
            arr3[idx]=arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    //return true if str1 appears before str2 in alphabetical order
    static boolean isalphabeticallysmaller(String str1,String str2)
    {
        if(str1.compareTo(str2)<0)
        {
            return true;
        }
        return false;
    }
    //return the majority element
    private static int countinrange(int[]nums,int num,int lo,int hi)
    {
        int count=0;
        for(int i=lo;i<=hi;i++)
        {
            if(nums[i]==num)
            {
                count++;
            }
        }
        return count;
    }
    private static int majorityelementrec(int[]nums,int lo,int hi)
    {
        //base case-the only element in an array of size 1 is the majority element
        if(lo==hi)
        {
            return nums[lo];
        }
        //recurse on left and right halves of this slice
        int mid=(hi-lo)/2+lo;
        int left=majorityelementrec(nums,lo,mid);
        int right=majorityelementrec(nums,mid+1,hi);
        //if the two halves agree on the majority element,return it.
        if(left==right)
        {
            return left;
        }
        //otherwise count each element and return the "winner"
        int leftcount=countinrange(nums,left,lo,hi);
        int rightcount=countinrange(nums,right,lo,hi);
        return leftcount>rightcount?left:right;
    }
    public static int majorityelement(int[]nums)
    {
        return majorityelementrec(nums,0,nums.length-1);
    }
    //inversion count in the array
    public static int merge(int arr[],int left,int mid,int right)
    {
        int i=left,j=mid,k=0;
        int invcount=0;
        int temp[]=new int[(right-left+1)];
        while((i<mid)&&(j<=right))
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                invcount+=(mid-1);
                k++;
                j++;
            }
        }
        while(i<mid)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=right)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=left,k=0;i<=right;i++,k++)
        {
            arr[i]=temp[k];
        }
        return invcount;
    }
    private static int mergesort(int arr[],int left,int right)
    {
        int invcount=0;
        if(right>left)
        {
            int mid=(right+left)/2;
            invcount=mergesort(arr,left,mid);
            invcount+=mergesort(arr,mid+1,right);
            invcount+=merge(arr,left,mid+1,right);
        }
        return invcount;
    }
    public static int getinversions(int arr[])
    {
        int n=arr.length;
        return mergesort(arr,0,n-1);
    }
    public static void main(String args[])
    {
        //String[] arr={"sun","earth","mars","mercury"};
        //String[] a=mergesort(arr,0,arr.length-1);
        //for(int i=0;i<a.length;i++)
        //{
        //    System.out.println(a[i]);
        //}
        //int nums[]={3,2,3};
        //System.out.println(majorityelement(nums));
        int arr[]={2,4,1,3,5};
        System.out.println("inversion count= "+getinversions(arr));
    }
}
