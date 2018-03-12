public class Main {
    public static void main(String[] args){
        DLLJ<Integer> doubleListOfNums = new DLLJ<Integer>();
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addFirst(17);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addFirst(15);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addFirst(16);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addFirst(15);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addLast(18);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addLast(19);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addLast(18);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addLast(20);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.removeFirst(15);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.removeLast(18);
        doubleListOfNums.PrintDLLValues();
        //17 -->27
        doubleListOfNums.replaceByXValueAtY(27,2);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.addFirst(10);
        doubleListOfNums.addLast(10);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.replaceAllByXValue(10,20);
        doubleListOfNums.PrintDLLValues();
        doubleListOfNums.replaceFirstByXValue(20,10);
        doubleListOfNums.replaceLastByXValue(20,22);
        doubleListOfNums.PrintDLLValues();
}
}
