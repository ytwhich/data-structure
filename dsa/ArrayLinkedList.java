class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}
class List{
    Node head;

    void append(int data)
    {
      Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node current=head; 
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        

    }
    
}

public class ArrayLinkedList{
    public static void main(String args[])
    {
        int[] arr1={1,3,5,7,8};
        List li=new List();
        for(int i=0;i<arr1.length;i++){
            li.append(arr1[i]);
        }

        li.printList();

    }
}