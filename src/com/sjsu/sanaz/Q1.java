package com.sjsu.sanaz;

import java.util.HashSet;

public class Q1 {
    // Using a temp buffer
    public static LinkedList.Node removeDup(LinkedList.Node head){
        HashSet<Integer> set = new HashSet<>();
        LinkedList.Node pre = null;
        LinkedList.Node current = head;
        while (current != null){
            if(!set.add(current.data)){
                pre.next = current.next;
                current = current.next;
            }else{
                set.add(current.data);
                pre = current;
                current = current.next;
            }
        }
        return head;
    }

    // Without temp buffer
    public static LinkedList.Node removeDupWOBuffer(LinkedList.Node head){
        LinkedList.Node current = head;
        while (current != null && current.next != null){
            LinkedList.Node runner = current;
            while (runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}
