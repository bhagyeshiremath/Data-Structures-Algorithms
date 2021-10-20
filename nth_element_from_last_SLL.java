public class nth_element_from_last_SLL
{
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void display()
    {
        if(head == null)
        {
            return ;
        }
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public ListNode getNthNode(int n)
    {
        if(head == null)
        {
            return null;
        }
        if(n <= 0)
        {
            throw new IllegalArgumentException("Invalid value :- n = " + n);
        }
            
        ListNode mainptr = head;
        ListNode refptr = head;
        int count = 0;
        while(count < n)
        {
            if(refptr == null)
            {
                throw new IllegalArgumentException(n + " is greater than number of nodes in the list ");
            }
            refptr = refptr.next;
            count ++;
        }

        while (refptr != null) 
        {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;

    }

    public static void main(String[] args) 
    {
        nth_element_from_last_SLL n = new nth_element_from_last_SLL();
        n.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        n.head.next = second;
        second.next = third;
        third.next = fourth;

        n.display();

        ListNode get = n.getNthNode(0);
        System.out.println(get.data);     
    }
}