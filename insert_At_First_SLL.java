public class insert_At_First_SLL
{
    ListNode head ;

    private static class ListNode
    {
        private int data;
        private ListNode next ;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertfirst(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {
        insert_At_First_SLL i = new insert_At_First_SLL();
        i.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        i.head.next = second;
        second.next = third;
        third.next = fourth;
        i.display();
        i.insertfirst(2);
        i.display();
        
    }
}