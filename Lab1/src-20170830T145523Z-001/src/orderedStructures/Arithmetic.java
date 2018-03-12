package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {

		if(current ==1 ){
			throw new IllegalStateException("Error");

		}
		current = current * commonDifference;
		return current;
	}
	
	public String toString(){
		return "Ari"+"( " + super.firstValue() +", "+ this.nextValue()+ " )";
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
