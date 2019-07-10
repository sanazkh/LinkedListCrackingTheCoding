package com.sjsu.sanaz;

public class Q4 {

    public static LinkedList.Node partition(LinkedList.Node node, int x){
        if(node == null){
            return null;
        }
        LinkedList.Node leftHead = null;
        LinkedList.Node leftTail = null;
        LinkedList.Node rightHead = null;
        LinkedList.Node rightTail = null;

        while (node != null){
            LinkedList.Node next = node.next;
            node.next = null;
            if(node.data < x){
                if(leftHead == null){
                    leftHead = node;
                    leftTail = leftHead;
                }else{
                    leftTail.next = node;
                    leftTail = node;
                }
            }else{
                if(rightHead == null){
                    rightHead = node;
                    rightTail = rightHead;
                }else{
                    rightTail.next = node;
                    rightTail = node;
                }
            }
            node = next;
        }
        if(leftHead == null){
            return rightHead;
        }
        leftTail.next = rightHead;
        return leftHead;
    }
}
