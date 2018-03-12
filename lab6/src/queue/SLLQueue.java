package queue;


public class SLLQueue<E> implements Queue<E> {

	private int size;
	private Node<E> first;


	public SLLQueue(){

    }


	@Override
	public E dequeue() {
	    if(isEmpty()){
	        return null;
        }

	    Node<E> toBeDel = first;
	    while(toBeDel.getNext()!= null) {
			toBeDel = toBeDel.next;
		}

        E temp = toBeDel.element;
        toBeDel = null;
	    size--;
		return temp;
	}

	@Override
	public void enqueue(E e) {
        first= new Node<>(first,e);
	    size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public E first() {
		return first.element;
	}



	//JUST FOR TESTING
	@Override
	public void showReverse() { 
	    if (size == 0)
		   System.out.println("Queue is empty."); 
		else
		   recSR(first);
    } 
    private void recSR(Node<E> f) { 
		if (f != null) { 
		   recSR(f.getNext()); 
		   System.out.println(f.getElement()); 
	     } 
    } 

    private class Node<E>{

		private Node<E> next;
		private E element;

		public Node(Node<E> next, E elem){

			this.next=next;
			element=elem;

		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}
	}


}
