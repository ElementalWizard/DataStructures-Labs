package Strats;

import main.Customer;

import java.util.ArrayList;

public abstract class AbsStrategy {

    private int clientsRemaining,UnSatisfiedCustumers,currentTurn;
    private ArrayList<Customer> customerList;
    private Customer Attending;
    private boolean OrderInProcess;
    private float Profit;


    //@param cuatomers holds the arraylist of customers generated from the csv file
    public AbsStrategy(ArrayList<Customer> customers){
        this.customerList = customers;
        Profit=0;
        UnSatisfiedCustumers=0;
        OrderInProcess=false;
        clientsRemaining=customerList.size();
        currentTurn=1;
    }

    //Runs the simulation that determines the profit.
    public void Run(){

    }


    // Getters and Setters for Instance Variables
    public float getProfit() {
        return Profit;
    }

    public void setProfit(float profit) {
        Profit = profit;
    }

    public int getUnSatisfiedC() {
        return UnSatisfiedCustumers;
    }

    public void setUnSatisfiedCustumers(int unSatisfiedCustumers) {
        UnSatisfiedCustumers = unSatisfiedCustumers;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public int getClientsRemaining() {
        return clientsRemaining;
    }

    public void setClientsRemaining(int clientsRemaining) {
        this.clientsRemaining = clientsRemaining;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public Customer getAttending() {
        return Attending;
    }

    public void setAttending(Customer attending) {
        Attending = attending;
    }

    public boolean isOrderInProcess() {
        return OrderInProcess;
    }

    public void setOrderInProcess(boolean orderInProcess) {
        OrderInProcess = orderInProcess;
    }
}
