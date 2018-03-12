package Testers;

import StackImplementation.ArrayBasedStack;

public class ArrayTest {
    public static ArrayBasedStack<Integer> ArrayBSatck1 = new ArrayBasedStack(100);

    public static void main(String[] args){
        ArrayBSatck1.printThis();
        ArrayBSatck1.push(45);
        ArrayBSatck1.printThis();
        ArrayBSatck1.pop();
        ArrayBSatck1.printThis();

        for(int i =1; i<50;i++){
            ArrayBSatck1.push(i);
        }
        ArrayBSatck1.printThis();
        ArrayBSatck1.pop();
        ArrayBSatck1.printThis();


    }

    }
