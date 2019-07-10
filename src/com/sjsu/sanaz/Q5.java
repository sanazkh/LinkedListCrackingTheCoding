package com.sjsu.sanaz;

public class Q5 {

    public static LinkedList.Node sumTwoLists(LinkedList.Node a, LinkedList.Node b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        LinkedList.Node dummyHead = new LinkedList.Node(0);
        LinkedList.Node current = dummyHead;
        int carry = 0;
        while (a != null || b != null){
            int x = 0;
            int y = 0;
            if(a != null){
                x = a.data;
            }
            if(b != null){
                y = b.data;
            }

            int sum = x + y + carry;
            carry = sum / 10;
            LinkedList.Node newNode = new LinkedList.Node(sum%10);
            current.next = newNode;
            current = current.next;
            if(a != null){
                a = a.next;
            }
            if(b != null){
                b = b.next;
            }
            if(carry > 0){
                LinkedList.Node n = new LinkedList.Node(carry);
                current.next = n;
            }
        }
        return dummyHead.next;
    }


    public static LinkedList.Node sumTwoListsReverse(LinkedList.Node a, LinkedList.Node b){
        if(a != null){
            a = reverseLinkedList(a);
        }
        if(b != null){
            b = reverseLinkedList(b);
        }
        LinkedList.Node res = sumTwoLists(a, b);
        return reverseLinkedList(res);
    }

    public static LinkedList.Node reverseLinkedList(LinkedList.Node head){
        if (head == null){
            return null;
        }
        LinkedList.Node dummyHead = null;
        LinkedList.Node current = head;
        while (current != null){
            LinkedList.Node temp = current.next;
            LinkedList.Node pre = current;
            current.next = dummyHead;
            current = temp;
            dummyHead = pre;
        }
        return dummyHead;
    }
}
