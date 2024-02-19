public class linkeddelbeg {
    Node head,tail;

    public linkeddelbeg(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public void create(int num){
        Node n = new Node(num);
        if(head==null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delbeg(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head = head.next;
        }
    }
    public static void main(String args[]){
        linkeddelbeg l = new linkeddelbeg();
        l.create(3);
        l.create(7);
        l.create(9);
        l.print(l.head);
        System.out.println();
        l.delbeg();
        l.print(l.head);
    }
}
