package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVInput {
    private String path;
    private ArrayList<String> paths;
    private ArrayList<Integer> totalArrest;
    private int totalPaths;

    //@Param path is the path of the .txt input
    public CSVInput(String path) {
        this.path = path;
        paths = new ArrayList<>();
        totalArrest=new ArrayList<>();
        readtxt();
    }

    public void readtxt(){
        String line;
        String separator = " ";
        //separates on a list all the log paths
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                //data[0] holds total arrest, data[1] holds corresponding log file
                String[] data = line.split(separator);
                paths.add(data[1]);
                totalArrest.add(Integer.parseInt(data[0]));
                totalPaths++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Getters and Setters for the instance Variables

    public ArrayList<String> getPaths() {
        return paths;
    }

    public ArrayList<Integer> getTotalArrest() {
        return totalArrest;
    }

    public int getTotalPaths() {
        return totalPaths;
    }
}