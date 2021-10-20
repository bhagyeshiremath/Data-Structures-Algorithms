import java.util.Scanner;

public class insert_At_Last_SLL
{
    private ListNode head;

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
            System.out.print(current.data  + " --> ");
            current = current.next;
       }
       System.out.println("Null");
    }

    public void insertLast(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        insert_At_Last_SLL l = new insert_At_Last_SLL();
        // l.head = new ListNode(10);
        // ListNode second = new ListNode(20);
        // ListNode third = new ListNode(30);
        // ListNode fourth = new ListNode(40);

        // l.head.next = second;
        // second.next = third;
        // third.next = fourth;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no of values of you want to insert :- ");
        int n = scn.nextInt();
        for(int i = 0 ; i < n ; i ++)
        {
            System.out.print("Enter " + n +" values you want to insert :- ");
            int insert = scn.nextInt();
            l.insertLast(insert);
            l.display();
        }   
        scn.close();
    }
}