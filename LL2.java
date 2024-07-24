public class LL2{
    Node head;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;    
            }
    }
    
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void printList(){
        if(head==null){
            System.out.println("Node is empty");
        }
        Node currNode=head;
        while(currNode!=null){
System.out.print(currNode.value + "->") ;
        currNode=currNode.next;
}
System.out.println("null");
}




    public Node removeNthNodeFromLast(Node head,int n){
        int size=0;
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch=size-n;
        Node prevNode=head;
        int i=1;
        while(i<indexToSearch){
            prevNode=prevNode.next;
            i++;
        }
prevNode.next=prevNode.next.next;
return head; 
    }
    public static void main(String[] args){
        LL2 list=new LL2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeNthNodeFromLast(list.head,1);
        list.printList();


    }
}