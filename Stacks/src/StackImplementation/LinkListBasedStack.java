package StackImplementation;

import Interface.StackInterface;

public class LinkListBasedStack<E> implements StackInterface<E> {
    private LinkListNode<E> First;
    private LinkListNode<E> head;
    private int size = 0;

    public LinkListBasedStack(){
        head=new LinkListNode<>(null,First);
    }



    @Override
    public void push(E v) {
        First= new LinkListNode(v,null);
        if(isEmpty()){
            head.setNext(First);
            size++;
            return;
        }
        First.setNext(head.getNext());
        head.setNext(First);
        size++;
    }

    public E pop() {
        if(isEmpty()){
            return null;
        }
        head.setNext(First.getNext());
        First=First.getNext();
        size--;
        return head.getNext().getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E top() {
        return head.getNext().getElement();
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }
}
