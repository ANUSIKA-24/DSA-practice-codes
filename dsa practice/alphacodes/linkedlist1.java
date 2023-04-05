public class linkedlist1
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static Node head;
    public static Node tail;
    public static boolean iscycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void removecycle()
    {
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        {
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;//last node
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;
    }
    public static void main(String args[])
    {
        head=new Node(1);
        //head.next=new Node(2);
        //head.next.next=new Node(3);
        //head.next.next.next=head;
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }
}