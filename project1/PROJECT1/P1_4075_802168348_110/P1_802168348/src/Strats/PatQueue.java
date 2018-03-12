package Strats;

import main.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PatQueue extends AbsStrategy{

    private Queue<Customer> customerToAttend;


    //@param cuatomers holds the arraylist of customers generated from the csv file
    public PatQueue(ArrayList<Customer> customers) {
        super(customers);

        customerToAttend = new LinkedList<>();
        this.Run();

    }
    public void Run() {
        while(this.getClientsRemaining()!= 0){
            for(int o =0; o<this.getCustomerList().size();o++){
                if(this.getCustomerList().get(o)==null){
                    continue;
                }
                if(this.getCurrentTurn()==this.getCustomerList().get(o).getArrivingTurn()){
                    customerToAttend.add(this.getCustomerList().get(o));
                    this.getCustomerList().set(o,null);
                }
            }

            if(customerToAttend.isEmpty() && !this.isOrderInProcess()){
                this.setCurrentTurn(this.getCurrentTurn()+1);
                continue;
            }
            if(!this.isOrderInProcess()){
                this.setAttending(customerToAttend.remove());
                this.getAttending().setPatienceLvl(this.getAttending().getPatienceLvl()+(this.getAttending().getArrivingTurn()));
                this.getAttending().setOrderTime(this.getAttending().getOrderTime()+(this.getCurrentTurn()-1));
                if(this.getAttending().getPatienceLvl()<this.getCurrentTurn()){
                    this.setClientsRemaining(this.getClientsRemaining()-1);
                    this.setUnSatisfiedCustumers(this.getUnSatisfiedC()+1);
                    this.getAttending().setPleased(false);
                    this.getAttending().setHasLeft(true);
                    continue;
                }
                this.setOrderInProcess(true);
                this.setProfit(this.getProfit()+(float)this.getAttending().getOrderPrice());
            }
            if(this.getAttending().getOrderTime()==this.getCurrentTurn()){
                this.getAttending().setPleased(true);
                this.getAttending().setHasLeft(true);
                this.setClientsRemaining(this.getClientsRemaining()-1);
                this.setOrderInProcess(false);
            }

            this.setCurrentTurn(this.getCurrentTurn()+1);
        }
    }
}
