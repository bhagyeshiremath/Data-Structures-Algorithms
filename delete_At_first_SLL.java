public class delete_At_first_SLL
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

    public ListNode deletefirst()
    {
        if(head == null)
        {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null ;
        return temp;
    }

    public static void main(String[] args) 
    {
        delete_At_first_SLL f = new delete_At_first_SLL();
        f.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        f.head.next = second;
        second.next = third;

        f.display();   
        f.deletefirst();    
        f.display();
    }
}