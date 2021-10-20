public class delete_At_Given_Position_SLL
{
    private ListNode head ;

    private static class ListNode
    {
        private int data ;
        private ListNode next ;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertGiven(int value , int position)
    {
        ListNode newNode = new ListNode(value);
        if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            ListNode previous = head ;
            int count = 1;
            while(count < position -1)
            {
                previous = previous.next;
                count ++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    public void display()
    {
        ListNode current = head ;
        while(current != null)
        {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void deleteGiven(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head ;
            int count = 1;
            while(count < position -1)
            {
                previous = previous.next;
                count ++;
            }
            ListNode current = previous.next;
            previous.next = current.next;         
        }
    }

    public static void main(String[] args) 
    {
        delete_At_Given_Position_SLL g = new delete_At_Given_Position_SLL();
        g.insertGiven(1, 1);
        g.insertGiven(5, 2);
        g.insertGiven(10, 3);
        g.display();
        g.deleteGiven(2);
        g.deleteGiven(1);
        g.deleteGiven(1);
        g.display();
    }
}