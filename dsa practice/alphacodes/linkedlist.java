public class linkedlist {
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
    public static Node head;
    public static Node tail;
    public static int size;
    
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
        head=newnode;
    }

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
        tail=newnode;
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
    public void add(int idx,int data)
    {
        if(idx==0)
        {
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast()
    {
        if(size==0)
        {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //search(iterative)
    public int itrsearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    //search(recursive)
    public int recsearch(int key)
    {
        return helper(head,key);
    }
    //helper function for search(recursive)
    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    //reverse a linked list
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    //remove nth node from end
    public void deletenthfromend(int n)
    {
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        if(n==sz)
        {
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //check if linked list is palindrome or not
    public Node findmid(Node head)//helper function
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow=midnode
    }
    public boolean checkpalindrome()
    {
        //base case
        if(head==null||head.next==null)
        {
            return true;
        }
        //step 1=find mid
        Node midnode=findmid(head);
        //step 2=reverse 2nd half
         Node prev=null;
         Node curr=midnode;
         Node next;
         while(curr!=null)
         {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         Node right=prev;//right half head
         Node left=head;
         //step 3=check left half and right half
         while(right!=null)
         {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
         }
         return true;
    }
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
    //code for merge sort
    public Node mergesort(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        //find mid
        Node mid=getmid(head);
        //left and right merge sort
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);
        //merge
        return merge(newleft,newright);
    }
    //getmid function
    private Node getmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast !=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }
    //merge function
    private Node merge(Node head1,Node head2)
    {
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1!=null&& head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
    public void zigzag()
    {
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node Next;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        Node left=head;
        Node right=prev;
        Node nextl,nextr;
        //alt merge/zig-zag merge
        while(left!=null && right!=null)
        {
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;
            left=nextl;
            right=nextr;
        }
    }
    public static void main(String args[])
    {
        /*linkedlist ll=new linkedlist();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        ll.add(2,3);*/
        //ll.print();
        //System.out.println(ll.size);
        //ll.removefirst();
        //ll.print();
        //ll.removelast();
        //ll.print();
        //System.out.println(ll.size);
        //System.out.println(ll.itrsearch(3));
        //System.out.println(ll.itrsearch(10));
        //System.out.println(ll.recsearch(3));
        //System.out.println(ll.recsearch(10));
        //ll.reverse();
        //ll.print();
        //ll.deletenthfromend(3);
        //ll.print();
        /*linkedlist ll2=new linkedlist();
        ll2.addlast(1);
        ll2.addlast(2);
        ll2.addlast(2);
        ll2.addlast(6);
        ll2.print();//1->2->2->1->null
        System.out.println(ll2.checkpalindrome());*/
        /*head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(iscycle());*/
        linkedlist ll=new linkedlist();
        //add
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        //ll.head=ll.mergesort(ll.head);
        ll.zigzag();
        ll.print();
    }
}

