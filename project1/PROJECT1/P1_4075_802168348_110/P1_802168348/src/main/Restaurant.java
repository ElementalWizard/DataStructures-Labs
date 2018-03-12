package main;

import Strats.MatStack;
import Strats.MaxProfit;
import Strats.PacFood;
import Strats.PatQueue;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class Restaurant {



    public static void main(String args[]){


        getCSV("./src/input.txt");

    }

    //@Param inPath takes the path of the .csv or .txt file
    public static void getCSV(String inPath){
        //creates an instance of CSVInput class
        CSVInput csvReader = new CSVInput(inPath);

        //if the path was a .txt file it calls all the .csv paths within it, which were saved on paths arraylist
        for(String string:csvReader.getPaths()){
            outPutFile(inPath.replace("input.txt", string));
        }

    }

    //@Param path takes the path of the .csv
    //@Return custumers returns the array of customers generated from the csv file
    public static ArrayList<Customer> customerList(String path){
        CSVInput csvReader = new CSVInput(path);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        for(int i =0; i<csvReader.getTotalPeople();i++){
            customers.add(new Customer(Integer.parseInt(csvReader.getArrivingTurns().get(i)),
                    Integer.parseInt(csvReader.getIDs().get(i)),
                    Integer.parseInt(csvReader.getOrderTime().get(i)),
                    Float.parseFloat(csvReader.getOrderPrice().get(i)),
                    Integer.parseInt(csvReader.getPatienceLevel().get(i))));
        }
        return customers;
    }


    //@Param path takes the path of the .csv
    public static void outPutFile(String inPath){

        //runs each simulation
        MatStack MS = new MatStack(customerList(inPath));
        PatQueue PQ = new PatQueue(customerList(inPath));
        MaxProfit MP = new MaxProfit(customerList(inPath));
        PacFood PF = new PacFood(customerList(inPath));

        //sets output to same input place
        String outPath=inPath.replace(".csv",".out");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(outPath, "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //creates output
        CSVInput csvReader = new CSVInput(inPath);
        writer.println("Maximum profit possible: $" + (String.format("%.02f",csvReader.getMaxProfit())));
        writer.println("Maximum number of customers served possible: " + csvReader.getTotalPeople());
        writer.println("Pat’s approach profit: $"+String.format("%.02f",PQ.getProfit()));
        writer.println("Pat’s approach number of disappointed customers: "+PQ.getUnSatisfiedC());
        writer.println("Mat’s approach profit: $"+String.format("%.02f",MS.getProfit()));
        writer.println("Mat’s approach number of disappointed customers: "+MS.getUnSatisfiedC());
        writer.println("Max’s approach profit: $"+String.format("%.02f",MP.getProfit()));
        writer.println("Max’s approach number of disappointed customers: "+MP.getUnSatisfiedC());
        writer.println("Pac’s approach profit: $"+String.format("%.02f",PF.getProfit()));
        writer.println("Pac’s approach number of disappointed customers: "+PF.getUnSatisfiedC());
        writer.close();
    }

}
