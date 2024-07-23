public  class LL {

    Node head;

    class Node{
String data;
Node next;

Node(String data){
    this.data=data;
    this.next=null;
}
    }
    //addfirst
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    //addlast
    public void addLast(String data ){
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
            System.out.println("Node is empty");
        }
        Node currNode=head;
        while(currNode!=null){
System.out.print(currNode.data + "->") ;
        currNode=currNode.next;
}
System.out.println("null");
}

//deletefirst
public void deleteFirst(){
    if(head==null){
        System.out.println("List is empty");
    }
    head=head.next;
    }

    //deletelast
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node secondLast=head;
        Node LastNode=head.next;
        while(LastNode.next!=null){
            secondLast=secondLast.next;
            LastNode=LastNode.next;
        }
        secondLast.next=null;
    }

public static void main(String[] args){
    LL list=new LL();
    list.addFirst("is");
    list.addFirst("this");
    list.addLast("list"); 
    list.deleteFirst();
    list.deleteLast();
    
  list.printList();
}
}