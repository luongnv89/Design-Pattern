package elements;

import specifications.CarElement;
import specifications.CarElementVisitor;

public class Wheel implements CarElement {
    private String name;
    
    private boolean turning;
    private int speed;
 
    public Wheel(String name) {
        this.name = name;
        turning = false;
        speed = 0;
    }
    
    public void accelerate(){speed++; turning = !(speed==0);}
    public void decelerate() {speed--;turning = !(speed==0);}
    
    public void stop(){speed=0; turning = false;}
    
    public boolean invariant(){return !(turning && speed==0);}
 
    public String toString() { 
    if (!turning) return name + " is not turning";
    else return name + " is  turning with speed "+speed;
    }
    
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

