package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVInput {
    private String path;
    private ArrayList<String> paths;
    private ArrayList<String> ArrivingTurns;
    private ArrayList<String> IDs;
    private ArrayList<String> OrderTime;
    private ArrayList<String> OrderPrice;
    private ArrayList<String> PatienceLevel;
    private int totalPeople;

    //@Param path is the path of the .txt or .csv input
    public CSVInput(String path) {
        this.path = path;
        ArrivingTurns = new ArrayList<>();
        IDs = new ArrayList<>();
        OrderTime = new ArrayList<>();
        OrderPrice = new ArrayList<>();
        PatienceLevel = new ArrayList<>();
        paths = new ArrayList<>();
        totalPeople=0;

        //determines if its .csv or .txt
        if(path.contains(".csv")) {
            readFile();
        }else{
            readtxt();
        }
    }

    public void readtxt(){
        String line;
        //if its .txt, separates on a list all the .csv paths
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                paths.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void readFile() {
        String line;
        String separator = ",";
        // reads .csv and separates data to 5 array, one per data in it
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(separator);
                ArrivingTurns.add(data[0]);
                IDs.add(data[1]);
                OrderTime.add(data[2]);
                String x= data[3].replace("$","");
                if(x.contains(" ")){x.replace(" ","");}
                OrderPrice.add(x);
                PatienceLevel.add(data[4]);
                totalPeople++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Getters and Setters for the instance Variables

    public ArrayList<String> getArrivingTurns() {
        return ArrivingTurns;
    }

    public ArrayList<String> getIDs() {
        return IDs;
    }

    public ArrayList<String> getOrderTime() {
        return OrderTime;
    }

    public ArrayList<String> getOrderPrice() {
        return OrderPrice;
    }

    public ArrayList<String> getPatienceLevel() {
        return PatienceLevel;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public float getMaxProfit(){
        float temp=0;
        for(String string: OrderPrice){
            temp+= Float.parseFloat(string);
        }
        return temp;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }
}