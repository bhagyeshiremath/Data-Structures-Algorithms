public class displaySLL
{
    private ListNode head ;
    
    private static class ListNode
    {
        private int data ; 
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data ;
            this.next = null ;
        }
    }

    public void displayList()
    {
        ListNode current = head ;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next ;
        }
        System.out.println("null");     
    }

    public static void main(String[] args) 
    {
        displaySLL f = new displaySLL();
        f.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        f.head.next = second;
        second.next = third;

        f.displayList();       
    }
}
