package theSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVInput {
    private String path;
    private ArrayList<String> paths;
    private ArrayList<String> ArrivalTime;
    private ArrayList<String> OrderTime;
    private int totalTask;


    public CSVInput(String path) {
        this.path = path;
        OrderTime = new ArrayList<>();
        ArrivalTime = new ArrayList<>();
        paths = new ArrayList<>();
        totalTask=0;

        if(path.contains(".csv")) {
            readFile();
        }else{
            readtxt();
        }
    }

    public void readtxt(){
        String line;
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
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(separator);
                OrderTime.add(data[1]);
                ArrivalTime.add(data[0]);
                totalTask++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public ArrayList<String> getOrderTime() {
        return OrderTime;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public ArrayList<String> getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(ArrayList<String> arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setOrderTime(ArrayList<String> orderTime) {
        OrderTime = orderTime;
    }

    public int getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(int totalTask) {
        this.totalTask = totalTask;
    }

}