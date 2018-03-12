package main;

public class Customer {

    private int ArrivingTurn;
    private int ID;
    private int OrderTime;
    private double OrderPrice;
    private int PatienceLvl;
    private boolean hasLeft;
    private boolean isPleased;


    //@Param AT is arrival time of the customer, @Param id is the ID of the Customer
    //@Param OT os the order Time of the customer, @Param OP is the Order Price of the customer
    //@Param PL is the patience level of the customer
    public Customer(int AT,int id,int OT,double OP, int PL){

        ArrivingTurn = AT;
        ID = id;
        OrderTime = OT;
        OrderPrice = OP;
        PatienceLvl = PL;

    }

    //Getters and Setters for the instance Variables

    public int getArrivingTurn() {
        return ArrivingTurn;
    }

    public void setArrivingTurn(int arrivingTurn) {
        ArrivingTurn = arrivingTurn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(int orderTime) {
        OrderTime = orderTime;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        OrderPrice = orderPrice;
    }

    public int getPatienceLvl() {
        return PatienceLvl;
    }

    public void setPatienceLvl(int patienceLvl) {
        PatienceLvl = patienceLvl;
    }

    public boolean isHasLeft() {
        return hasLeft;
    }

    public void setHasLeft(boolean hasLeft) {
        this.hasLeft = hasLeft;
    }

    public boolean isPleased() {
        return isPleased;
    }

    public void setPleased(boolean pleased) {
        isPleased = pleased;
    }
}
