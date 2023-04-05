public class matrixpractice 
{
    public static int frequency(int matrix[][])
    {
        int counter=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==7)
                counter++;
            }
        }
        return counter;
    }
    public static int secondrowsum(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==1)
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public static void transpose(int matrix[][])
    {
        int row=2,column=3;
        int trans[][]=new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                trans[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<trans.length;i++)
        {
            for(int j=0;j<trans[0].length;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String args[])
    {
        int matrix[][]={{11,12,13},{21,22,23}};
        transpose(matrix);
    }
}
