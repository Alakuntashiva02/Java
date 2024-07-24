public  class LL {

    Node head;

    class Node{
int data;
Node next;

Node(int data){
    this.data=data;
    this.next=null;
}
    }
    //addfirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    //addlast
    public void addLast(int data ){
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
//reverse the list by iteration
    public void reverseIterate(){
        if(head==null||head.next==null){
            return ;
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
   
    //reverse the list by recursion
    public Node reverseRecurse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead=reverseRecurse(head.next);
    head.next.next= head;
    head.next=null;

    return  newhead;
   }

public static void main(String[] args){
    LL list=new LL();
    list.addFirst(3);
    list.addFirst(2);
    list.addFirst(1);
  //  list.addLast(3); 
    //list.deleteFirst();
    //list.deleteLast();
   // list.addFirst(1);
    //list.addFirst(2);
    //list.addFirst(3);
    list.reverseIterate();
 //list.head= list.reverseRecurse(list.head);
    
  list.printList();
}
}