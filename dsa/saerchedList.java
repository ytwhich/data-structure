// // Question: Write a Java method to find the middle element of a singly linked list. If the list has an even number of elements, return the second of the two middle elements.
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data=data;
//         this.next=null;

//     }
// }
// class List{
//     Node head;
//     void append(int data)
//     {
//         Node newNode=new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//         }
//         else{
//             Node current=head;
//             while(current.next!=null){
//                 current=current.next;

//             }

//         }
//     }
//     void printList(){
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
        

//     }
// }
  

// int findMiddle(){
//     Node current = head;

//     if(head==null){
//         throw new RuntimeException("List is empty");
//     }
//     Node slow=head;
//     Node fast=head;

//     while(fast !=null && fast.next!=null)
//     {
//         slow=slow.next;
//         fast=fast.next.next;

//     }
//    return slow.data;
// }

// public class saerchedList {
//     public static void main(String  args[])
//     {
//       List li=new List();
//       li.append(1);
//       li.append(2);
//       li.append(3);
//       li.append(4);
//       li.append(5);

//       li.printList();
//       int middle = li.findMiddle();
//       System.out.println("Middle element: " + middle);

//     }
    
// }
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    int findMiddle() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

public class saerchedList {
    public static void main(String[] args) {
        List li = new List();
        li.append(1);
        li.append(2);
        li.append(3);
        li.append(4);
        li.append(5);

        li.printList();
        int middle = li.findMiddle();
        System.out.println("Middle element: " + middle);
    }
}

