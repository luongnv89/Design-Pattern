package elements;

import specifications.CarElement;
import specifications.CarElementVisitor;

public class Engine implements CarElement {
	
	private int speed;
	
	private final int max;
	
	public Engine(int max){
		
		this.max=max;
		speed=0;
	}
	
	public boolean invariant (){
		return (max >0 && speed>=0 && speed<=max);
	}
	
	public String toString(){
		return "Engine speed is "+speed+" / "+max;
	}
	
    public void accelerate(){if (speed<max)speed++;}
    public void decelerate() {if (speed>0) speed--;}
    
    public void toMax(){speed=max;}
    
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

