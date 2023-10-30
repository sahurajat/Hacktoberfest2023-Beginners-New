//wap to implement of queue using linked list
public class three 
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class queue
    {
        static Node head=null;
        static Node tail=null;

        //isempty
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        //push(we have add the element in the rear side so ll add last operation will be performed )
        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
           tail.next=newNode;
            tail=newNode;
        }

        //remove element(we have to remove the element in the front so remove fast operation of ll will performed)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("ll is empty");
                return -1;
            }
            int first=head.data;
            if(tail==head)
            {
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return first;
        }

        //peek function
        public static int peek()
        {
           //check is empty condition
           if(isEmpty())
           {
               System.out.println("queue is empty");
               return -1;
           }
           return head.data;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        while(! q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
