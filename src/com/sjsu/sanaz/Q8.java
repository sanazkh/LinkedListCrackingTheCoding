package com.sjsu.sanaz;

import java.util.HashSet;
import java.util.Set;

public class Q8 {
    public static LinkedList.Node loopDetection(LinkedList.Node head){
        if(head == null){
            return null;
        }

        Set<LinkedList.Node> set = new HashSet<>();
        LinkedList.Node current = head;
        while (current != null){
            if(!set.add(current)){
                return current;
            }
            set.add(current);
            current = current.next;
        }
        return null;
    }

    public static LinkedList.Node loopDetection1(LinkedList.Node head){
        if(head == null){
            return null;
        }
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while (fast != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
