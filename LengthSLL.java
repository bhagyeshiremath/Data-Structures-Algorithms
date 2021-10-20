public class LengthSLL
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

    public int lengthOfList()
    {
        if(head == null)
        {
            return 0 ;
        }
        ListNode current = head ;
        int count = 1;
        while(current != null)
        {
            current = current.next ;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        LengthSLL f = new LengthSLL();
        f.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        f.head.next = second;
        second.next = third;
        third.next = fourth;
 
        System.out.println("The length of LL is :- " + f.lengthOfList());      
    }
}
