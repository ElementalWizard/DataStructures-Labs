package StackImplementation;

import Interface.StackInterface;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBasedStack<E> implements StackInterface<E> {

    private int topPointer;

    private E[]myArray;

    public ArrayBasedStack(int initSize){
        myArray = (E[])new Object[initSize];
        topPointer=0;
    }
    @Override
    public void push(E v) {

        if((myArray.length*3/4) <= topPointer){
            E[] temp =  (E[])new Object[myArray.length*2];
            System.arraycopy(myArray, 0, temp, 0, myArray.length);
            myArray = temp;
        }

        topPointer++;
        myArray[topPointer]=v;

    }


    @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        E removed = myArray[topPointer];
        myArray[topPointer]=null;
        topPointer--;


        if((myArray.length*(0.75))>=topPointer ){
//            E[] temp2 =  (E[])new Object[myArray.length/2];
//            for(int i=0; i<temp2.length;i++ ){
//                temp2[i]=myArray[i];
//            }
            myArray = Arrays.copyOf(myArray,myArray.length/2);
        }





        return removed;
    }

    @Override
    public int size() {
        return topPointer;
    }

    @Override
    public E top() {
        return (E) myArray[topPointer];
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    public void printThis(){
        for(E elements:myArray){
            System.out.print(elements + " , ");
        }
        System.out.println();
        System.out.println(myArray.length + " , " + size());
        System.out.println();

    }
}
