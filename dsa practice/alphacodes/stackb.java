//stack implementation using array list
import java.util.ArrayList;
public class stackb {
    static class stack{
        static ArrayList<Integer> List=new ArrayList<>();
        public static boolean isEmpty()
        {
            return List.size()==0;
        }
        //push
        public static void push(int data)
        {
            List.add(data);
        }
        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return List.get(List.size()-1);
        }
    }
    public static void main(String args[])
    {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
