package org.example;
public class new_Deques<T> implements newDeque<T>{
    //complete each method by referencing how Deque works using data structure called LinkedList.
    //For starters, create a constructor for new_Deques
    //Remember how generic type works
    //the sorting method and the private method..you can implement yourself or you can copy and try to understand it since i got it from the internet
    //but i do recommend to also implement a mergesort or other kinds of sorting to help you learn more about the algorithms part
    //A good advice would be drawing out and visualizing what deque linkedlist look like while using "sentinel" as like a helper node to go from next or previous nodes.
    //I also created a test cases(most from chat which created for me) for all the methods which can be found in the test folder

    //creating Node inside new_Deques class
    private static class Node<T>{

    }
    //Constructor
    public new_Deques(){

    }
    //add value at the end
    @Override
    public void addLast(T data) {
        //add T data to the last node
        //example lst = 1 2 3
        // lst.addLast(4)
        //after addLast -> 1 2 3 4
    }
    //add value at the front, shift everything to the left
    @Override
    public void addFirst(T data) {
        //add data to the first node
        //example lst = 1 2 3
        // lst.addFirst(4)
        //after addLast -> 4 1 2 3
    }
    //removing the first value
    @Override
    public T removeFirst() {
        //remove first node
        //example lst = 1 2 3
        // lst.removeFirst()
        //after addLast -> 2 3
        return null;
    }
    //removing the last value
    @Override
    public T removeLast() {
        //remove last node
        //example lst = 1 2 3
        // lst.removeLast()
        //after addLast -> 1 2
        return null;
    }
    //return the first value
    @Override
    public T first() {
        //get first node
        //example lst = 1 2 3
        // lst.first()
        //after addLast -> 1
        return null;
    }
    //return the last value
    @Override
    public T last() {
        //get last node
        //example lst = 1 2 3
        // lst.last()
        //after addLast -> 3
        return null;
    }

    @Override
    public int size() {
        //get total nodes in the deque linkedList
        return 0;
    }

    @Override
    public boolean isEmpty() {
        //determine if the linkedlist has any node other sentinel or not
        return false;
    }

    @Override
    public void insertat(int index, T value) {
        //insert the value according to the index.
        //remember the index cannot exceed the size or below 0
    }

    @Override
    public void removeAt(int index) {
        //remove the value according to the index.
        //remember the index cannot exceed the size or below 0
    }

    @Override
    public void printing() {
        //print the whole deque
        //example
        //lst1.addFirst(1);
        //lst1.addFirst(0);
        //lst1.addFirst(-1);
        //lst1.printing(); -> -1 0 1
    }

    @Override
    public void selectionSort() {
        //sorting value in deque from small to large
    }

    @Override
    public void deleteList() {
        //delete the whole deque
    }

    @Override
    public T get(int i) {
        //get value according to the index i
        //remember i cannot exceed size or below 0
        return null;
    }

    @Override
    public void reverseList(Deque<T> l) {
        //reverse the linkedlist
        // example: initial -> 1 2 3 4
        //after reverse -> 4 3 2 1
    }
}
