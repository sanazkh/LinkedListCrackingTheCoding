package com.sjsu.sanaz;

import java.util.HashSet;

/**
 * Created by sanazk on 6/27/18.
 */
public class LinkedList {
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int item){
            data = item;
            next = null;
        }
    }

    public Node deleteNode(Node head, int value){

        Node n = head;
        if(n.data == value){
            return n.next;
        }
        while (n.next != null){
            if(n.data == value){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    //using a temporary buffer
    public void deleteDup(Node n){
        HashSet<Integer> tracker = new HashSet<>();
        Node previousNode = null;

        while(n != null){
            if(tracker.contains(n.data)){
                previousNode.next = n.next;
            }else{
                tracker.add(n.data);
                previousNode = n;
            }

            n = n.next;
        }
    }

    //without using a temporary buffer
    public void deleteDupWOBuffer(Node n){
        Node current = head;

        while(current != null){
            Node runnerPointer = current.next;
            while (runnerPointer.next != null){
                if(current.data == runnerPointer.data){
                    runnerPointer.next = runnerPointer.next.next;
                }else{
                    runnerPointer = runnerPointer.next;
                }
            }
            current = current.next;
        }
    }
}
