public class backtracking {
    //backtracking arrays
    public static void changearr(int arr[],int i,int val)
    {
        //base case
        if(i==arr.length)
        {
            printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changearr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //find and print subsets of a given string
    public static void findsubsets(String str,String ans,int i)
    {
        //base case
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findsubsets(str,ans,i+1);
    }
    //find permutations of the given string
    public static void findpermutation(String str,String ans)
    {
        //base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            //"abcde"="ab"+"de"="abde"
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+curr);
        }
    }
    //n-queens problem
    public static boolean nqueens(char board[][],int row)
    {
        //base
        if(row==board.length)
        {
            //printboard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++)
        {
            if (issafe(board,row,j))
            {
                board[row][j]='Q';
                //nqueens(board,row+1);//function call
                if(nqueens(board,row+1))
                {
                    return true;
                }
                board[row][j]='X';//backtracking step
            }
        }
        return false;
    }
    //print board function
    public static void printboard(char board[][])
    {
        System.out.println("--------chess board---------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    //issafe function
    public static boolean issafe(char board[][],int row,int col)
    {
        //vertical up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    //grid ways
    public static int gridways(int i,int j,int n,int m)
    {
        //base case
        if(i==n-1&&j==m-1)//condition for last call
        {
            return 1;
        }
        else if(i==n||j==n)
        {
            return 0;
        }
        int w1=gridways(i+1,j,n,m);
        int w2=gridways(i,j+1,n,m);
        return w1+w2;
    }
    //grid ways optimized
    public static void gridwayoptimized(int n,int m)
    {
        int result=(factorial((n-1)+(m-1)))/(factorial(n-1)*factorial(m-1));
        System.out.println(result);
    }
    public static int factorial(int x)
    { int f1=1;
        for(int i=1;i<=x;i++)
        {
            f1=f1*i;
        }
        return f1;
    }
    static int count=0;
    public static void main(String args[])
    {
        int arr[]=new int[5];
        changearr(arr,0,1);
        printarr(arr);
        String str="abc";
        findsubsets(str,"",0);
        findpermutation(str,"");
        int no=4;
        char board[][]=new char[no][no];
        //initialize
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<no;j++)
            {
                board[i][j]='X';
            }
        }
        if(nqueens(board,0))
        {
            System.out.println("solution is possible");
            printboard(board);
        }
        else{
            System.out.println("solution is not possible");
        }
        System.out.println("total ways to solve n queen= "+count);
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
        gridwayoptimized(3,3);
    }
}
