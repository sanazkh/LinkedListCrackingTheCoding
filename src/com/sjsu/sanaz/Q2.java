package com.sjsu.sanaz;

import java.security.PublicKey;

public class Q2 {

    // Return kth node when length is known or can be calculated

    public static LinkedList.Node findKthNode(LinkedList.Node head, int k, int length){
        if(k > length){
            return null;
        }
        LinkedList.Node current = head;
        int index = (length - k) + 1;
        int i = 1;
        while (i != index){
            current = current.next;
            i++;
        }
        return current;
    }

    public static LinkedList.Node findKthNode(LinkedList.Node head, int k){
        int length = findLeng(head);
        if(k >= length){
            return null;
        }
        int delta = length - k;
        LinkedList.Node n = head;
        for (int i = 0; i < delta; i++){
            n = n.next;
        }
        return n;
    }

    public static int findLeng(LinkedList.Node head){
        int len = 0;
        LinkedList.Node n = head;
        while (n != null){
            len++;
            n = n.next;
        }
        return len;
    }


    // Length is not known or can't be calculated
    public static LinkedList.Node findKthNode1(LinkedList.Node head, int k){
        if(head == null){
            return null;
        }
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    // When size of Linked List is unknown
    public static LinkedList.Node findKthNodeSizeUnknown(LinkedList.Node head, int k){
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        while (fast.next != null){
            slow = slow.next;
            int i = 0;
            while (i < k && fast.next != null){
                fast = fast.next;
                i++;
            }
        }
        return slow;
    }

    public static LinkedList.Node findKthNodeSizeUnknown1(LinkedList.Node head, int k){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        int i = 0;
        while (i < k && fast != null){
            fast = fast.next;
            i++;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
