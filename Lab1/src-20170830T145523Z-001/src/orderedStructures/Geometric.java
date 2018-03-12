package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		try{

            current = current * commonFactor;

        }catch(IllegalStateException  e){
		    e.printStackTrace();
		    System.out.println("error");
        }
        return current;
    }

	public String toString(){
		return "Geo"+"( " + super.firstValue() +", "+ this.nextValue()+ " )";
	}
	
	public double getTerm(int n){
		double temp = super.firstValue();
		if(n==1){
			return temp;
		}
		
		for(int i =2;i<=n;i++){
			temp=this.nextValue();
		}
		return temp;
	}
	
}
