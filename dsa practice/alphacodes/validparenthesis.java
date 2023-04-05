import java.util.*;
public class validparenthesis {
    public static boolean isvalid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //opening
            if(ch=='('||ch=='{'||ch=='[')
            {
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']'))
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
    //duplicate braces
    public static boolean isduplicate(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //closing
            if(ch==')')
            {
                int count=0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String str="({})[])";
        //System.out.println(isvalid(str));
        //valid string
        String str1="((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(isduplicate(str1));
    }
}
