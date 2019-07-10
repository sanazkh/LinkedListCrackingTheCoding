package com.sjsu.sanaz;

import java.util.Stack;

public class Q6 {
    public static boolean isPalindrome(LinkedList.Node head) {
        if(head == null){
            return false;
        }

        LinkedList.Node current = head;
        LinkedList.Node newHead = cloneLinkedList(head);
        newHead = Q5.reverseLinkedList(newHead);

        while (current != null){
            if(current.data != newHead.data){
                return false;
            }
            current = current.next;
            newHead = newHead.next;
        }
        return true;
    }

    static LinkedList.Node cloneLinkedList(LinkedList.Node head){
        LinkedList.Node nHead = head;
        while (head.next != null){
            nHead.next = head.next;
            head = head.next;
        }
        return nHead;
    }

    // Without cloning and reversing
    public static boolean isPalindrome1(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        Stack<Integer> s = new Stack<>();
        while (fast != null && fast.next != null){
            s.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the length is odd, ignore the middle value
        if(fast != null){
            slow = slow.next;
        }

        while (!s.isEmpty()){
            if(s.pop() != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
