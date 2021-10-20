public class delete_At_Last_SLL 
{
    private ListNode head;
    
    private static class ListNode
    {
        private int data; //generic data
        private ListNode next; // reference to a next node in a list

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        ListNode current = head ;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next ;
        }
        System.out.println("null");     
    }

    public ListNode deletelast()
    {
        if(head == null)
        {
            return null;
        }
        ListNode current  = head;
        ListNode previous = null ;
        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null ;
        return current; 
    }

    public static void main(String[] args) 
    {
        delete_At_Last_SLL f = new delete_At_Last_SLL();
        f.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        f.head.next = second;
        second.next = third;

        f.display();   
        f.deletelast();    
        f.display();
    }
}