public class doubleLL {
    public class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addfirst
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //addlast
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    //print
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove-remove first
    public int removefirst()
    {
        if(head==null)
        {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    //remove last
    public int removelast()
    {
        if(head==null)
        {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    //reverse dll
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[])
    {
        doubleLL dll=new doubleLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        
        /*dll.print();
        System.out.println(dll.size);

        dll.removefirst();
        dll.print();
        System.out.println(dll.size);

        dll.addlast(4);
        dll.print();
        System.out.println(dll.size);

        dll.removelast();
        dll.print();
        System.out.print(dll.size);*/

        dll.print();
        dll.reverse();
        dll.print();
    }
}
