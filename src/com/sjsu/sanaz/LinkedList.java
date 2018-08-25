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

    public void removeDuplicatesFromUnsortedLinkedList(Node head){
        Node sp = head;
        Node fp = head;

        while(sp != null){
            fp = sp.next;
            while (fp.next != null){
                if(sp.data == fp.data){
                    fp.data = fp.next.data;
                    fp.next = fp.next.next;
                }
                fp = fp.next;
            }
            sp = sp.next;
        }
    }


    //Return kth node to the last in a singly linked list when the size is known
    public Node returnKthNodeToLast(int k, Node head){
        int size = 0;
        Node current = head;
        while(head != null){
            size++;
            head = head.next;
        }
        if(k > size){
            return null;
        }
        int i = 1;

        while(i < size - k){
            if(i == size - k){
                return current;
            }else{
                i++;
                current = current.next;
            }
        }

        return current;
    }


    //Iterative Solution when size is unknown
    public Node returnKthNodeToLastIt(int k, Node head){
        Node slowPointer = head;
        Node kPointer = head;

        //Moving the kPointer for k
       for(int i = 0; i < k; i++){
           if(kPointer == null){
               return null;
           }
           kPointer = kPointer.next;

       }

       while (kPointer.next != null){
           kPointer = kPointer.next;

           slowPointer = slowPointer.next;

       }

       return slowPointer;
    }

    public boolean deleteMiddleNode(Node n){
        if(n == null || n.next == null){
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

    public Node partition(Node n, int x){
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while(n != null){
            Node next = n.next;
            n.next = null;
            if(n.data < x){
                if(beforeStart == null){
                    beforeStart = n;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = n;
                    beforeEnd = n;
                }
            }else{
                if(afterStart == null){
                    afterStart = n;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = n;
                    afterEnd = n;
                }
            }
            n = next;
        }
        if(beforeEnd == null){
            return afterStart;
        }

        // Merge two lists
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    // Is Palindrome
    public boolean isPalindrome(Node head) {
        if(head == null){
            return true;
        }

        Node current = head;
        Node previousNode = new Node(head.data);

        while (current.next != null){
            Node temp = new Node(current.next.data);
            temp.next = previousNode;
            previousNode = temp;
            current = current.next;
        }

        Node p1 = head;
        Node p2 = previousNode;
        while (p1 != null){
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    public Node findIntersectionByValue(Node headA, Node headB){
        if(headA == null || headB == null){
            return null;
        }
        HashSet<Integer> tracker = new HashSet<>();

        while(headA != null){
            tracker.add(headA.data);
            headA = headA.next;
        }

        while (headB != null){
            if (tracker.contains(headB.data)){
                return headB;
            }else{
                headB = headB.next;
            }
        }
        return null;
    }

    public Node findIntersectionByReference(Node headA, Node headB){
        if(headA == null || headB == null){
            return null;
        }

        Result result1 = getTailAndSize(headA);
        Result result2 = getTailAndSize(headB);

        if(result1 != result2){
            return null;
        }

        Node shorter = result1.size < result2.size ? headA : headB;
        Node longer = result2.size < result2.size ? headB : headA;

         int difference = Math.abs(result1.size - result2.size);

         while(difference > 0 && longer != null){
             longer = longer.next;
             difference--;
         }

         while (longer != shorter){
             longer = longer.next;
             shorter = shorter.next;
         }

         return longer;
    }

    class Result{
        public Node tail;
        public int size;

        public Result(Node tail, int size){
            this.size = size;
            this.tail = tail;
        }
    }

    Result getTailAndSize(Node node){
        if(node == null){
            return null;
        }
        int size = 1;
        Node cureent = node;
        while (cureent.next != null){
            size++;
            cureent = cureent.next;
        }

        return new Result(cureent, size);
    }

    // Loop detection without using an auxilary space
    Node loopDetection(Node head){
        Node slowPointer = head;
        Node fastPonter = head;

        while (fastPonter != null && fastPonter.next != null){
            slowPointer = slowPointer.next;
            fastPonter = fastPonter.next.next;
            if(slowPointer == fastPonter){
                break;
            }
        }

        if(fastPonter == null || fastPonter.next == null){
            return null;
        }

        slowPointer = head;
        while (slowPointer != fastPonter){
            slowPointer = slowPointer.next;
            fastPonter = fastPonter.next;
        }
        return fastPonter;
    }

    // Sum two lists when the digits are reversed
    public Node sumTwoLists(Node a, Node b){
        Node aHead = a;
        Node bHead = b;
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while(aHead != null || bHead != null){
            int x;
            int y;
            if(aHead != null){
                x = aHead.data;
            }else{
                x = 0;
            }
            if(bHead != null){
                y = bHead.data;
            }else{
                y = 0;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new Node(sum%10);
            current = current.next;
            if(aHead != null){
                aHead = aHead.next;
            }
            if(bHead != null){
                bHead = bHead.next;
            }
            if(carry > 0){
                Node newNode = new Node(carry);
                current.next = newNode;
            }
        }
        return dummyHead.next;
    }

    //Sum list
    Node sumList(Node a, Node b){
        Node result1 = reverseALinkedList(a);
        Node result2 = reverseALinkedList(b);
        return reverseALinkedList(sumTwoLists(result1, result2));
    }


    Node reverseALinkedList(Node head){
        Node current = head;
        Node previous = null;

        while (current != null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;

    }
}
