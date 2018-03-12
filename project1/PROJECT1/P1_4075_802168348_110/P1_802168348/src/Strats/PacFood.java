package Strats;

import main.Customer;

import java.util.ArrayList;

public class PacFood  extends AbsStrategy{

    ArrayList<Customer> customerToAttend;

    //@param cuatomers holds the arraylist of customers generated from the csv file
    public PacFood(ArrayList<Customer> customers) {
        super(customers);

        customerToAttend = new ArrayList<>();
        this.Run();

    }


    public void Run() {
        while (this.getClientsRemaining() != 0) {
            for (int o = 0; o < this.getCustomerList().size(); o++) {
                if(this.getCustomerList().get(o)==null){
                    continue;
                }

                if (this.getCurrentTurn() == this.getCustomerList().get(o).getArrivingTurn()) {

                    customerToAttend.add(this.getCustomerList().get(o));
                    this.getCustomerList().set(o,null);

                }
            }
            if (customerToAttend.isEmpty() && !this.isOrderInProcess()) {
                this.setCurrentTurn(this.getCurrentTurn() + 1);
                continue;
            }
            if (!this.isOrderInProcess()) {
                this.setAttending(getNext());
                if(this.getAttending().getPatienceLvl()<this.getCurrentTurn()){
                    this.setUnSatisfiedCustumers(this.getUnSatisfiedC()+1);
                    this.getAttending().setPleased(false);
                    this.getAttending().setHasLeft(true);
                    this.setClientsRemaining(this.getClientsRemaining()-1);
                    continue;
                }
                this.setOrderInProcess(true);
                this.setProfit(this.getProfit()+(float)this.getAttending().getOrderPrice());
            }

            if (this.getAttending().getOrderTime() == this.getCurrentTurn()) {
                this.setClientsRemaining(this.getClientsRemaining() - 1);
                this.getAttending().setHasLeft(true);
                this.getAttending().setPleased(true);
                this.setOrderInProcess(false);

            }
            this.setCurrentTurn(this.getCurrentTurn()+1);
        }
    }

    public Customer getNext(){
        Customer temp = customerToAttend.get(0);
        for (Customer customer:customerToAttend){
            if(customer.getOrderTime()<temp.getOrderTime()){
                temp = customer;
            }
        }
        customerToAttend.remove(temp);
        temp.setPatienceLvl(temp.getPatienceLvl()+(temp.getArrivingTurn()-1));
        temp.setOrderTime(temp.getOrderTime()+(this.getCurrentTurn()-1));

        return temp;
    }
}
