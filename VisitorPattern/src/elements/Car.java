package elements;

import specifications.CarElement;
import specifications.CarElementVisitor;

public class Car implements CarElement{
    CarElement[] elements;
 
    public CarElement[] getElements() {
        return elements.clone(); // Return a copy of the array of references.
    }
 
    public Car() {
        this.elements = new CarElement[]
          { new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left") , new Wheel("back right"),
            new Doors(), new Engine(8) };
    }
    
    public String toString(){
    	  	return "\n  *** A Car *** \n";
    }
    
    public boolean invariant (){
    	return (elements!=null && elements.length>0);
    }
 
    public void accept(CarElementVisitor visitor) {	
        visitor.visit(this);
        for(CarElement element : this.getElements()) {
            element.accept(visitor);
        }
	
    }
}

