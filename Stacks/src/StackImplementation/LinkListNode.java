package StackImplementation;

public class LinkListNode<E> {
    private E element;
    private LinkListNode<E> next;
    public LinkListNode(E elem, LinkListNode<E> n){

        element=elem;
        next=n;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public LinkListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkListNode<E> next) {
        this.next = next;
    }
}
