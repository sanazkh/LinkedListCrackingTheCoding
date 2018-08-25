package com.sjsu.sanaz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList ll = new LinkedList();



        ll.head  = new LinkedList.Node(5);
        LinkedList.Node second = new LinkedList.Node(1);
      //  LinkedList.Node third  = new LinkedList.Node(2);
     //   LinkedList.Node fourth  = new LinkedList.Node(1);
        ll.head.next = second;
       // second.next = third;
      //  third.next = fourth;
     //   second.next = null;


       LinkedList.Node third  = new LinkedList.Node(2);
        LinkedList.Node fourth  = new LinkedList.Node(3);
        LinkedList.Node fif  = new LinkedList.Node(4);
        LinkedList.Node siz  = new LinkedList.Node(5);
        LinkedList.Node sev  = new LinkedList.Node(6);
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fif;
        fif.next = siz;
        siz.next = sev;
        sev.next = null;

        LinkedList l2 = new LinkedList();
        l2.head = new LinkedList.Node(7);
        LinkedList.Node second1 = new LinkedList.Node(8);
        l2.head.next = second1;
        LinkedList.Node third1  = new LinkedList.Node(5);
        LinkedList.Node fourth1  = new LinkedList.Node(6);
        l2.head.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        fourth1.next = null;

        printLinkedList(ll.head);
        printLinkedList(l2.head);

    //    System.out.println(ll.returnKthNodeToLast(1, ll.head).data);

    //    System.out.println(ll.returnKthNodeToLastIt(1, ll.head).data);

     //   printLinkedList(ll.partition(ll.head, 5));

        System.out.println(ll.sumList(ll.head, l2.head).data);

        printLinkedList(ll.sumList(ll.head, l2.head));

    }



    public static void printLinkedList(LinkedList.Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println("****************");
    }
}
