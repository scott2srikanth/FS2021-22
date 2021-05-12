package datastructures.linkedlist;

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

    public void reverseBetween(int left, int right) {


        Node first=head;
        Node last=head;
        Node fix=head;

        for(int i=1; i<left; i++){
            first = first.next;
        }
        for(int i=1; i<left-1; i++){
            fix = fix.next;
        }

        for(int i=1; i< right; i++){
            last = last.next;
        }

        Node previous = first;
        Node current = first.next;
        Node temp;

        first.next = last.next;

        if(left != 1){
            fix.next = last;
        }

        while(previous != last){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }


        if(left == 1){
            head = last;
        }

    }

    public void sortList() {
        head = sortList(head);
    }

    public Node sortList(Node head) {
        if(head == null || head.next == null) return head;
        Node slow= head, fast= head, second= null;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        second= slow.next;
        slow.next= null;
        head= sortList(head);
        second= sortList(second);
        return merge(head,second);
    }

    public Node merge(Node head, Node second){
        Node curr1= head, curr2= second, sorted= new Node(0,null), curr= sorted;
        while(curr1 != null && curr2 != null){
            if(curr1.data < curr2.data){
                curr.next= curr1;
                curr1= curr1.next;
            }else{
                curr.next= curr2;
                curr2= curr2.next;
            }
            curr= curr.next;
        }
        if(curr1 != null) curr.next= curr1;
        if(curr2 != null) curr.next= curr2;
        return sorted.next;
    }
}


public class Main1{

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
        System.out.println("");
        sl.reverseBetween(2,4);
        sl.print();
        System.out.println("");
        sl.sortList();
        sl.print();
    }

}
