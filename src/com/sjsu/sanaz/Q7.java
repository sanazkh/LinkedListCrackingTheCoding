package com.sjsu.sanaz;

public class Q7 {

    public static boolean hasIntersectionByValue(LinkedList.Node head1, LinkedList.Node head2){
        if(head1 == null || head2 == null){
            return false;
        }

        int aLen = findLen(head1);
        int bLen = findLen(head2);
        int delta = Math.abs(aLen - bLen);
        if(aLen > bLen){
            head1 = move(head1, delta);
        }else if(bLen > aLen){
            head2 = move(head2, delta);
        }

        while (head1 != null){
            if(head1.data == head2.data){
                return true;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return false;
    }

    public static int findLen(LinkedList.Node node){
        int res = 0;
        if(node == null){
            return res;
        }
        while (node != null){
            res++;
            node = node.next;
        }
        return res;
    }

    public static LinkedList.Node move(LinkedList.Node node, int delta){
        while (delta > 0){
            node = node.next;
            delta--;
        }
        return node;
    }

    /******************************************************************/

    public LinkedList.Node intersection(LinkedList.Node head1, LinkedList.Node head2){
        if(head1 == null || head2 == null){
            return null;
        }
        Result res1 = getTailSize(head1);
        Result res2 = getTailSize(head2);
        if(res1.tail != res2.tail){
            return null;
        }

        int delta = Math.abs(res1.size = res2.size);
        if(res1.size > res2.size){
            head1 = move(head1, delta);
        }else if(res2.size > res1.size){
            head2 = move(head1, delta);
            System.out.println(head2.data);
        }
        while (head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }

    public Result getTailSize(LinkedList.Node n){
        int res = 1;
        while (n.next != null){
            res++;
            n = n.next;
        }
        return new Result(res, n);
    }

    public class Result{
        int size;
        LinkedList.Node tail;
        public Result(int size, LinkedList.Node tail){
            this.size = size;
            this.tail = tail;
        }
    }


}
