public class string {
    public static boolean palindrome(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static float getpath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            //south
            if(dir=='S')
            {
                y--;
            }
            //north
            else if(dir=='N')
            {
            y++;
        }
            //west
            else if(dir=='W')
            {
            x--;
        }
            //east
            else
            {
                x++;
            }
        }
        int x2=(x*x);
        int y2=(y*y);
        return (float)Math.sqrt(x2+y2);
    }
    //error in the code ....needs debugging
    public static String touppercase(String str)
    {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        int i=1;
        for(i=1;i<=str.length()-2;i++);
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                //i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
public static String compress(String str)
{
    StringBuilder sb=new StringBuilder("");
    for(int i=0;i<str.length();i++)
    {
        Integer count=1;
        while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
        {
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count>1)
        {
            sb.append(count.toString());
        }
    }
    return sb.toString();
}
public static void main(String args[])
{
    //String str="aaabbcccdd";
    //System.out.println(palindrome(str));
    String path="WNEENESENNN";
    //System.out.println(getpath(path));
    String fruits[]={"apple","mango","banana"};
    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++)
    {
        if(largest.compareTo(fruits[i])<0)
        {
            largest=fruits[i];
        }
    }
    //System.out.println("using lexicographic approach -"+largest);
    String str="hi,i am anusika";
    System.out.println(touppercase(str));
    //System.out.println(compress(str));
    
}
    
}
