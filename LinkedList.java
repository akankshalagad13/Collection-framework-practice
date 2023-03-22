public class LinkedList {
    Node head;
    private int size;
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //addLast
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //printlist
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    //deletefirst
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //deleteLast
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public int getSize(){
        return size;

    }
   public void reverseIterate(){
    if(head==null||head.next==null){
        return;
    }
    Node prevNode=head;
    Node currNode=head.next;
    while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
    }
    head.next=null;
    head=prevNode;


 }
    public static void main(String[] args) {
        LinkedList LL=new LinkedList();
        LL.addFirst("a");
        LL.addFirst("is");
        LL.printList();
        LL.addLast("LinkedList");
        LL.printList();
        LL.addFirst("this");
        LL.printList();
        LL.deleteFirst();
        LL.printList();
        LL.addLast("Example");
        LL.printList();
        LL.deleteLast();
        LL.printList();
        System.out.println(LL.getSize());
        LL.reverseIterate();
        LL.printList();
        
    }
    
}
