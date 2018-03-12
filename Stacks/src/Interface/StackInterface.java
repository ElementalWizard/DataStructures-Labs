package Interface;


public interface StackInterface<E> {
    void push(E v);
    E pop();
    int size();
    E top();
    boolean isEmpty();

}
