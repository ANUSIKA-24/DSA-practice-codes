import java.util.LinkedList;
public class linkedlist2
{
    public static void main(String args[])
    {
        //create
        LinkedList<Integer> ll=new LinkedList<>();
        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}