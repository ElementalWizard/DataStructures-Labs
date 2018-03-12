package theSystem;

public class Task {

    private int arrivalTime;
    private int orderTime;
    private float turnleft;

    public Task( int aT, int oT){

        arrivalTime=aT;
        orderTime=oT;
        turnleft=0;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(int orderTime) {
        this.orderTime = orderTime;
    }

    public float getTurnLeft() {
        return turnleft;
    }

    public void setTurnLeft(float turnTaken) {
        this.turnleft = turnTaken;
    }
}
