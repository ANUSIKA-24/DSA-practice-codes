public class stringpractice {
    public static int vowels(String str)
    {   int counter=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                counter++;
            }
        }
        return counter;
    }
    public static void anagram(String str1, String str2)
    {
        int c=0;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                c=1;
            }
        }
        if(c==1)
        {
            System.out.println("it is a anagram");
        }
        else
        System.out.println("not a anagram");
    }
    public static void main(String args[])
    {
        //String str="hello i am anusika";
        //System.out.println(vowels(str));
        String str1="race";
        String str2="rare";
        anagram(str1,str2);
    }
}
