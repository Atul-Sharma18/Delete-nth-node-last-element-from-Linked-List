public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }}

        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            Node newNode = new Node(data); // create a node

            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;// add next to new node
            head = newNode;// assign head to head
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail =newNode;
                return;
            }
        
        tail.next = newNode;
      tail= newNode;
    }

    public void print(){
        if(head ==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i==idx-1 ;temp-prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }
        public void deleteNthfromEnd(int n){
            int sz=0;
            Node temp = head;
            while(temp !=null){
                temp = temp.next;
                sz++;
            }
            if(n==sz){
                head = head.next;
                return;

            }
            int i=1;
            int iToFind =sz-n;
            Node prev = head;
            while(i<iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

    

        public static void main(String args[]) {
            LinkedList ll = new LinkedList();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(4);
            ll.addFirst(5);
            ll.add(2,3);
            ll.print();
            ll.deleteNthfromEnd(3);
            ll.print();

        
    }
}
