package com.sjsu.sanaz;

public class Main {

    public static void main(String[] args) {
	// write your code here

      //  LinkedList test = new LinkedList();
        LinkedList a = new LinkedList();
        a.head = new LinkedList.Node(7);
        LinkedList.Node s = new LinkedList.Node(8);
        LinkedList.Node t = new LinkedList.Node(9);
        LinkedList.Node h = new LinkedList.Node(10);
        LinkedList.Node o = new LinkedList.Node(11);
        a.head.next = s;
        s.next = t;
        t.next = h;
        h.next = o;
        o.next = t;

        System.out.println(Q8.loopDetection(a.head).data);
        System.out.println(Q8.loopDetection1(a.head).data);


//        LinkedList a1 = new LinkedList();
//        a1.head = new LinkedList.Node(6);
//        LinkedList.Node s1 = new LinkedList.Node(5);
//        a1.head.next = s1;
//        s1.next = h;
//
//        Q7 q7 = new Q7();
//        System.out.println(q7.intersection(a.head, a1.head).data);

      //  System.out.println(Q7.hasIntersectionByValue(a.head, a1.head));

      //  System.out.println(Q6.isPalindrome(a.head));
      //  System.out.println(Q6.isPalindrome1(a.head));

     //   printLinkedList(Q5.sumTwoListsReverse(a.head, a1.head));

     //   printLinkedList(Q5.sumTwoLists(a.head, a1.head));


        /*************************************************************/


//        LinkedList circularLL = new LinkedList();
//        circularLL.head = new LinkedList.Node(1);
//        LinkedList.Node sec = new LinkedList.Node(2);
//        LinkedList.Node thi = new LinkedList.Node(3);
//
//        circularLL.head.next = sec;
//        sec.next = thi;
//        thi.next = circularLL.head;
//
//     //   printLinkedList(DeleteAlternate.deleteAlternate(circularLL.head));
//
//        LinkedList ll = new LinkedList();
//
//        LinkedList ll1 = new LinkedList();
//
//
//
//
//        ll.head  = new LinkedList.Node(1);
//        LinkedList.Node second = new LinkedList.Node(2);
//        LinkedList.Node third  = new LinkedList.Node(8);
//        LinkedList.Node fourth  = new LinkedList.Node(4);
//        LinkedList.Node fifth = new LinkedList.Node(5);
//        LinkedList.Node sixth = new LinkedList.Node(3);
//        ll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;
//        fifth.next = sixth;
//        sixth.next = null;
//
//        printLinkedList(Q4.partition(ll.head, 4));
//
//        System.out.println(Q2.findKthNode(ll.head, 3, 6).data);
//        System.out.println(Q2.findKthNode(ll.head, 3).data);
//        System.out.println(Q2.findKthNode1(ll.head, 3).data);
//
//      //  System.out.println(Q6.isPalindrome(ll.head));
//       // System.out.println(ll.isPalindrome(ll.head));
//
//
//       // printLinkedList(Q4.partition(ll.head, 5));
//
//
//        ll1.head  = new LinkedList.Node(3);
//        LinkedList.Node second1 = new LinkedList.Node(6);
//        LinkedList.Node third1  = new LinkedList.Node(8);
//        ll1.head.next = second1;
//        second1.next = third1;
//        third1.next = null;
//
//      //  Q1.removeDup(ll.head);
//      //  printLinkedList(ll.head);
//
//      //  Q1.removeDupWOBuffer(ll.head);
//
//        //printLinkedList(ll.head);
//
//      //  LinkedList.Node result = Q2.findKthNode(ll.head, 8, 6);
//
//      //  LinkedList.Node result = Q2.findKthNodeSizeUnknown1(ll.head, 4);
//
//     //   System.out.println(result.data);
//
//      //  Q3.removeMiddleNode(fourth);
//      //  printLinkedList(ll.head);
//
//      //  System.out.println(Q7.hasIntersection(ll.head, ll1.head));
//
//
//     /*  LinkedList.Node third  = new LinkedList.Node(2);
//        LinkedList.Node fourth  = new LinkedList.Node(3);
//        LinkedList.Node fif  = new LinkedList.Node(4);
//        LinkedList.Node siz  = new LinkedList.Node(5);
//        LinkedList.Node sev  = new LinkedList.Node(6);
//        ll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fif;
//        fif.next = siz;
//        siz.next = sev;
//        sev.next = null;
//
//        LinkedList l2 = new LinkedList();
//        l2.head = new LinkedList.Node(7);
//        LinkedList.Node second1 = new LinkedList.Node(8);
//        l2.head.next = second1;
//        LinkedList.Node third1  = new LinkedList.Node(5);
//        LinkedList.Node fourth1  = new LinkedList.Node(6);
//        l2.head.next = second1;
//        second1.next = third1;
//        third1.next = fourth1;
//        fourth1.next = null;
//
//        printLinkedList(ll.head);
//        printLinkedList(l2.head); */
//
//    //    System.out.println(ll.returnKthNodeToLast(1, ll.head).data);
//
//    //    System.out.println(ll.returnKthNodeToLastIt(1, ll.head).data);
//
//     //   printLinkedList(ll.partition(ll.head, 5));
//
//     //   System.out.println(ll.sumList(ll.head, l2.head).data);
//
//      //  printLinkedList(ll.sumList(ll.head, l2.head));

    }



    public static void printLinkedList(LinkedList.Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println("****************");
    }
}
