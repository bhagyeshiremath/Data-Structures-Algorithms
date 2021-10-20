public class Reverse_a_SLL
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

    public void display(ListNode head)
    {
        ListNode current = head ;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next ;
        }
        System.out.println("null");     
    }

    public ListNode reverse(ListNode head)
    {
        if(head == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        Reverse_a_SLL s = new Reverse_a_SLL();
        s.display(head);

        ListNode rev = s.reverse(head);  
        s.display(rev);       
    }
    
}