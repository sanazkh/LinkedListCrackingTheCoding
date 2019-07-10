package com.sjsu.sanaz;

public class Q3 {

    public static void removeMiddleNode(LinkedList.Node n){
        if(n == null || n.next == null){
            return;
        }
        n.data = n.next.data;
        n.next = n.next.next;
    }

}
