import Interface.ListInterface;

public class DLLJ<E> implements ListInterface {
    private Node<E> h;
    private Node<E> t;
    private int size = 0;

    public DLLJ(){
        h=new Node<>(null,null,null);
        t=new Node<>(null,h,null);
        h.setNext(t);
    }


    public void addFirst(E element){
        Node<E> temp = new Node<>(element,h,h.getNext());
        h.setNext(temp);
        temp.getNext().setPrev(temp);
        size++;
    }
    public void addLast(E element){
        Node<E> temp = new Node<>(element,t.getPrev(),t);
        t.setPrev(temp);
        temp.getPrev().setNext(temp);
        size++;
    }



    //remove first()
    @SuppressWarnings("Duplicates")
    public void removeFirst(E element){
        if(getSize()==0){
            return;
        }else{
            Node<E> pointer = h.getNext();
            while(pointer.getNext()!= null){
                if(pointer.getElement()==element){
                    pointer.getNext().setPrev(pointer.getPrev());
                    pointer.getPrev().setNext(pointer.getNext());
                    pointer.setNext(null);
                    pointer.setPrev(null);
                    pointer.setElement(null);
                    size--;
                    return;
                }
                pointer=pointer.getNext();
            }

        }
    }

    //remove last()
    @SuppressWarnings("Duplicates")
    public void removeLast(E element){
        if(getSize()==0){
            return;
        }else{
            Node<E> pointer = t.getPrev();
            while(pointer.getPrev()!= null){
                if(pointer.getElement()==element){
                    pointer.getNext().setPrev(pointer.getPrev());
                    pointer.getPrev().setNext(pointer.getNext());
                    pointer.setNext(null);
                    pointer.setPrev(null);
                    pointer.setElement(null);
                    size--;
                    return;
                }
                pointer=pointer.getPrev();
            }

        }
    }

    //replace from first by value(E oldvalue, E new value)
    public void replaceFirstByXValue(E oldvalue, E newvalue){
        Node<E> pointer = h;
        while(pointer.getNext()!= null){
            if(pointer.getElement()==oldvalue){
                pointer.setElement(newvalue);
                return;
            }
            pointer=pointer.getNext();

        }


    }

    //replace from last by value(E oldvalue, E new value)
    public void replaceLastByXValue(E oldvalue, E newvalue){
        Node<E> pointer = t;
        while(pointer.getPrev()!= null){
            if(pointer.getElement()==oldvalue){
                pointer.setElement(newvalue);
                return;
            }
            pointer=pointer.getPrev();

        }
    }

    //replace all by value (E oldvalue, E new value)
    public void replaceAllByXValue(E oldvalue, E newvalue){
        Node<E> pointer = h;
        while(pointer.getNext()!= null){
            if(pointer.getElement()==oldvalue){
                pointer.setElement(newvalue);
            }
            pointer=pointer.getNext();
        }
        return;

    }

    //replaceAtIndex(E newvalue, int index
    public void replaceByXValueAtY(E newValue, int index){
        Node<E> pointer = h;
        //assumes dummy head is in index -1
        int counter =0;
        while(counter != index){
            pointer=pointer.getNext();
            counter++;
        }
        pointer.setElement(newValue);
    }

    public void PrintDLLValues(){
        Node<E> pointer = h.getNext();
        while (pointer.getNext()!= null){
            System.out.print(pointer.getElement() + " , ");
            pointer=pointer.getNext();
        }
        System.out.println("");
    }


    public int getSize() {
        return size;
    }

}
