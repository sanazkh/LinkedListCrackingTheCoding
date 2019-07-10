package com.sjsu.sanaz;

import java.util.HashSet;

/**
 * Created by sanazk on 6/27/18.
 */
public class LinkedList {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int item){
            data = item;
            next = null;
        }
    }

    public Node deleteNode(int d, Node head){
        if(head == null){
            return null;
        }
        if(head.data == d){
            return head.next;
        }
        Node n = head;
        while (n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

}
