public class insert_At_Given_Position
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

    public static void main(String[] args) 
    {
        insert_At_Given_Position g = new insert_At_Given_Position();
        g.insertGiven(1, 1);
        g.insertGiven(5, 2);
        g.insertGiven(10, 3);
        g.display();
    }
}