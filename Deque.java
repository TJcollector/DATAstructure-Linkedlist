package org.example;
import java.util.Scanner;
public class Deque<T> implements newDeque<T>{
    private static class Nodes<T> {
        T head;
        Nodes next, prev;
        public Nodes(T head, Nodes next, Nodes prev) {
            this.head = head;
            this.next = next;
            this.prev = prev;
        }
    }
    private  Nodes sen;

    private int size;
    public Deque(){
        sen=new Nodes(null,null,null);
        sen.next=sen;
        sen.prev=sen;

        size=0;
    }
    public Deque(Deque<T> other){
        sen=new Nodes(null,null,null);
        sen.next=sen;
        sen.prev=sen;
        for(int i=0;i<other.size;i++){
            this.addLast(other.get(i));
        }
    }
    public void addLast(T data) {
        Nodes old =sen.prev;
        Nodes n=new Nodes(data,sen,old);
        sen.prev=n;
        old.next=n;
        size++;
    }
    public void addFirst(T data) {
        Nodes old=sen.next;
        Nodes n=new Nodes(data,old,sen);
        sen.next=n;
        old.prev=n;
        size++;
    }
    public T removeFirst() {
        T result=(T) sen.next.head;
        sen.next=sen.next.next;
        sen.next.prev=sen;
        size--;
        return result;
    }

    public T removeLast() {
        T result=(T) sen.prev.head;
        sen.prev=sen.prev.prev;
        sen.prev.next=sen;
        size--;
        return result;
    }

    public T first() {
        return (T) sen.next.head;
    }

    public T last() {
        return (T) sen.prev.head;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void insertat(int index, T value) {
        Nodes p=sen;
        while(index-1>=0){
            p=p.next;
            index--;
        }
        Nodes old=p.next;
        Nodes n=new Nodes(value, old,p);
        p.next=n;
        old.prev=n;
        size++;
    }
    public void removeAt(int value) {

        if(value-1<=size){
        Nodes p=sen;
        while(value-1>=0){
            p=p.next;
            value--;
        }
        p.next=p.next.next;
        p.next.prev=p;
        size--;
    }
    }
    public void printing() {
        Nodes p=sen;
        for(int i=0;i<size;i++){
            System.out.print(p.next.head+" ");
            p=p.next;
        }
        System.out.println();
    }
    public void selectionSort() {
        Nodes current = sen.next;

        while (current != sen.prev) {
            Nodes minNode = findMinNode(current);
            swap(current, minNode);
            current = current.next;
        }
    }
    private Nodes findMinNode(Nodes start) {
        Nodes minNode = start;
        Nodes current = start.next;
        while (current != sen) {
            if (((Comparable<T>) current.head).compareTo((T) minNode.head) < 0) {
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }
    private void swap(Nodes node1, Nodes node2) {
        T temp = (T) node1.head;
        node1.head = node2.head;
        node2.head = temp;
    }
    public void deleteList() {
        sen.next=sen;
        sen.prev=sen;
        size=0;
    }
    public void reverseList(Deque<T> l) {
        T[] result= (T[]) new Object[size];
        Nodes p=sen.prev;
        int i=0;
        while(p!=sen){
            result[i]=(T)p.head;
            p=p.prev;
            i++;
        }
        l.deleteList();
        for(int j=0;j<result.length;j++){
            l.addLast(result[j]);
        }
    }
    public T get(int index){
        Nodes p=sen;
        while(index>=0){
            p=p.next;
            index--;
        }
        return (T) p.head;
    }
    private Nodes getMiddle(Nodes start) {
        Nodes slow = start;
        Nodes fast = start.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public String toString(){
        String s="";
        Nodes p=sen;
        for(int i=0;i<size;i++){
            s+=p.next.head.toString()+" ";
            p=p.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Deque<Integer> lst1=new Deque<>();
        lst1.addFirst(1);
        lst1.addFirst(2);
        lst1.addFirst(3);
        System.out.println(lst1.toString());
        lst1.printing();
        lst1.reverseList(lst1);
        lst1.printing();
        lst1.insertat(1,10);
        lst1.printing();
        lst1.removeAt(1);
        lst1.printing();
//        Scanner mobj=new Scanner(System.in);
//        System.out.println("Command that can be use: void addLast(T data);\n" +
//                "    void addFirst(T data);\n" +
//                "    T removeFirst();\n" +
//                "    T removeLast();\n" +
//                "    T first();\n" +
//                "    T last();\n" +
//                "    int size();\n" +
//                "    boolean isEmpty();\n" +
//                "    void insertat(int index,T value);\n" +
//                "    void removeAt(int value);\n" +
//                "    void printing();\n" +
//                "    void selectionSort();\n" +
//                "    void deleteList();\n" +
//                "    T get(int i);\n" +
//                "    String toString();\n" +
//                "    void reverseList(Deque<T> l);");
//        String useri=mobj.nextLine();
//        while(!useri.equals("quit")){

        //}
    }
}
