package theSystem;

import queue.ArrayQueue;
import queue.SLLQueue;


public class main {



    public static void main(String[] args){

        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input.csv"));
        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input2.csv"));
        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input3.csv"));
        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input4.csv"));
        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input5.csv"));
        System.out.println("Average Time in System is: " + Run("D:/Code/Java/lab6/input6.csv"));


    }

    public static double Run(String path){
        CSVInput csvReader = new CSVInput(path);
        ArrayQueue<Task> taskQueue = new ArrayQueue<>();
        Task[] tasks = TaskList(path);
        int Turn =0;
        int TasktoDo = csvReader.getTotalTask();

        while(TasktoDo!=0){
            if(taskQueue.isEmpty()){
                for(Task e: tasks){
                    if(e.getArrivalTime()==Turn){
                        taskQueue.enqueue(e);
                    }
                }
                Turn++;
                continue;
            }
            taskQueue.first().setOrderTime(taskQueue.first().getOrderTime()-1);

            if(taskQueue.first().getOrderTime()==0){
                taskQueue.first().setTurnLeft(Turn);
                taskQueue.dequeue();
                TasktoDo--;
                if(TasktoDo==0){
                    continue;
                }
            }
            else{taskQueue.enqueue(taskQueue.dequeue());}
            for(Task e: tasks){
                if(e.getArrivalTime()==Turn){
                    taskQueue.enqueue(e);
                }
            }

            Turn++;

        }
        float sumOfTotalTurns =0;
        for(Task e: tasks){
            sumOfTotalTurns+=(e.getTurnLeft()-e.getArrivalTime());
        }
        return sumOfTotalTurns/csvReader.getTotalTask();
    }


    public static Task[] TaskList(String path){
        CSVInput csvReader = new CSVInput(path);
        Task[] tasks = new Task[csvReader.getTotalTask()];
        for(int i =0; i<tasks.length;i++){
            tasks[i] = new Task(Integer.parseInt(csvReader.getArrivalTime().get(i)),
                    Integer.parseInt(csvReader.getOrderTime().get(i)));
        }
        return tasks;

    }
}
