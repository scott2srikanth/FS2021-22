package com.app;
class MyLinkedList {

    private class Node{
        private int data;
        private Node next;

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    Node head=null;
    Node tail=null;

    public void addNodeAtStart(int data){
        Node node =new Node(data,null);

        if(isEmpty())
            head=tail=node;
        else {
            node.next = head;
            head = node;
        }
    }

    public void addNodeAtEnd(int data){
        Node node =new Node(data,null);

        if(isEmpty())
            head=tail=node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public int indexOf(int item){
        int index = 0;
        Node current = head;
        while (current!=null) {
            if(current.data == item)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item)!= -1;
    }

    public void removeFirstNode(){
        if(isEmpty())
            System.out.println("List is Empty");
        if(head==tail){
            head=tail=null;
            return;
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
    }

    public void removeLastNode(){
        if(isEmpty())
            System.out.println("List is Empty");
        if(head==tail){
            head=tail=null;
            return;
        }
        Node previous = getPreviousNode(tail);
        tail = previous;
        tail.next=null;
    }

    public Node getPreviousNode(Node node){
        Node current = head;
        while (current.next!=null) {
            if(current.next==node)
                return current;
            current=current.next;
        }
        return null;
    }

    public Node getPreviousNode(int index){
        Node current = head;
        int i=0;
        while (current.next!=null) {
            if(i==index-1)
                return current;
            current=current.next;
            i++;
        }
        return null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void addNodeAtIndex(int index,int data){
        //todo
        if(index==0){
            addNodeAtStart(data);
        }
        else{
            Node previous = getPreviousNode(index);
            Node node = new Node(data,null);
            node.next = previous.next;
            previous.next = node;
        }

    }

    public void removeNodeFromIndex(int index){
        //todo
        if(index==0){
            removeFirstNode();
        }
        else{
            Node previous = getPreviousNode(index);
            Node temp = previous.next.next;
            previous.next.next=null;
            previous.next = temp;
            temp=null;
        }
    }

    public void print(){
        if(isEmpty())
            System.out.println("Empty");
        else {
            Node current = head;
            while (current!=null) {
                System.out.print(current.data);
                if((current=current.next)!=null)
                    System.out.print("->");
            }
        }
    }

    public void reverseList(){
        if(isEmpty()) return;
        //h          t
        // 10 -> 20 ->30
        //  p    c    temp

        Node previous = head;
        Node current = head.next;
        while (current!=null){
            Node temp = current.next;
            current.next = previous;
            previous=current;
            current = temp;
            temp = null;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }
}


public class Main{

    public static void main(String[] args) throws Exception {
        MyLinkedList sl=new MyLinkedList();
        sl.addNodeAtStart(12);
        sl.addNodeAtStart(3);
        sl.addNodeAtStart(4);
        sl.addNodeAtStart(5);
        sl.addNodeAtStart(4);
        sl.addNodeAtEnd(8);
        sl.print();
        System.out.println("");
        sl.addNodeAtIndex(4,14);
        sl.print();
        System.out.println("");
        sl.removeNodeFromIndex(2);
        sl.print();
        System.out.println("");
        sl.reverseList();
        sl.print();
    }

}