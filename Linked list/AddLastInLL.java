public class AddLastInLL{
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public void addLast(int data){
            // step1 -> create a new Node
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            // step2 -> tail.next = newNode;
            tail.next = newNode;
            // step3-> tail = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(3);
        ll.addLast(4);

    }
}