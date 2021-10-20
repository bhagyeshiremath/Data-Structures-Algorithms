import java.util.Scanner;

public class Search_the_Key_SLL
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

    public boolean search(int searchKey)
    {
        if(head == null)
        {
            return false;
        }
        ListNode current = head;
        while(current != null)
        {
            if(current.data == searchKey)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Search_the_Key_SLL s = new Search_the_Key_SLL();
        s.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        s.head.next = second;
        second.next = third;
        third.next = fourth;
        s.display();

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = scn.nextInt();
        if(s.search(n))
        {
            System.out.println("Key found");
        }
        else
        {
            System.out.println("key not found");
        }
        scn.close();
        
    }
    
}