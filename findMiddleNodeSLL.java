public class findMiddleNodeSLL
{
    private ListNode head ;

    private static class ListNode
    {
        private int data ;
        private ListNode next ;

        public ListNode(int data)
        {
            this.data = data ;
            this.next = null ;
        }
    }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode middle()
    {
        if(head == null)
        {
            return null ;
        }
        ListNode slowPointer = head ;
        ListNode fastPointer = head ;
        while(fastPointer != null && fastPointer.next != null)
        {
            slowPointer = slowPointer.next ;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        findMiddleNodeSLL i =  new findMiddleNodeSLL();
        i.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        i.head.next = second;
        second.next = third;
        third.next = fourth;
        i.display();
        //Here compulsory use .data because without it ...machine is giving weird output
        System.out.println("The middle node is :- " + i.middle().data);
    }
}