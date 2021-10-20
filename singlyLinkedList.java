//Single linkedlist in action
//1st
public class singlyLinkedList
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

    //This function is to display the the elements present in a linked list in a proper mannner
    //3rd
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

    //This function is used to display the length of a linked List
    //4th
    public int length_of_list()
    {
        if(head == null)
        {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null)
        {
            count ++;
            current = current.next;
        }
        return count;
    }

    //We are creating this function just to add new element in the begining of the singlelinkedlist
    //5th
    public void insertFirst(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    } 

    //We are creating this function just to add new element in the end of the singlelinkedlist
    //6th
    public void insertLast(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head == null)
        {
            head = newNode;
            return ;
        }
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    //We are creating this function just to add new element in the given posiion of the singlelinkedlist
    //7th
    public void insertGivenPosition(int position , int value)
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
            while (count < position - 1)
            {
                previous = previous.next;
                count ++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    //We are creating this function just to delete the first element of the singlelinkedlist
    //8th
    public ListNode deleteFirst()
    {
        if(head == null)
        {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //We are creating this function just to delete last element of the singlelinkedlist
    //9th
    public ListNode deleteLast()
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null)
        {
            previous = current ;
            current = current.next;
        } 
        previous.next = null;
        return current ;
    }

    //We are creating this function just to delete the element ata the given position of the singlelinkedlist
    //10th
    public void deleteGivenPosition(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while (count < position -1 )
            {
                previous = previous.next;
                count ++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    //This function is used to search the element in tha linked list
    //11th
    public boolean searchElement(ListNode head , int searchkey)
    {
        if(head == null)
        {
            return false;
        }
        ListNode current = head ;
        while (current != null)
        {
            if(current.data == searchkey)
            {
               return true;
            }
            current = current.next;
        }
       return false;
    }

    //This function is used to reverse the linkedlist
    //12th
    public ListNode reverse(ListNode head)
    {
        if(head == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null ;
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

    //2nd
    public static void main(String[] args) {
        singlyLinkedList sl = new singlyLinkedList();
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // //Now we doing this because we want to connect this nodes
        head.next = second;//10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11

        //sl.insertFirst(11);
        //sl.insertFirst(15);

        //sl.insertLast(11);
        //sl.insertLast(15);

        //sl.insertGivenPosition(1, 8);
        //sl.insertGivenPosition(2, 10);
        //sl.insertGivenPosition(1, 3);
        //sl.insertGivenPosition(2, 9);

        //sl.display();

        //System.out.println(sl.deleteFirst().data);

        //System.out.println(sl.deleteLast().data);

        //sl.deleteGivenPosition(4);

        //singlyLinkedList sl = new singlyLinkedList();
        sl.display();

        /*if(sl.searchElement(head,15))
        {
            System.out.println("key found");
        }
        else
        {
            System.out.println("key not found");
        }*/

        //ListNode temp = sl.reverse(head);
        //sl.display(temp);

        
        //System.out.println("Length of single list is :- " + sl.length_of_list());
    }
}