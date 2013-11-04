package visitors;

import elements.Car;
import elements.Doors;
import elements.Engine;
import elements.Wheel;
import specifications.CarElementVisitor;

public class CarElementCheckInvariantVisitor implements CarElementVisitor {
	
    public void visit(Wheel wheel) {
        if (!wheel.invariant()){
        	System.out.println(wheel +" in unsafe state, so it is stopped");
        	wheel.stop();
        }
        
    }
 
    public void visit(Engine engine) {
    	if (!engine.invariant()) {
    		System.out.println(engine +",  this is an unsafe state, so it is set to max");
    	engine.toMax();}
    }
 
    public void visit(Doors doors) {
    	if (!doors.invariant()){
    		System.out.println(doors +" in unsafe state, so both are locked");
        	doors.lockLeft();
    	}
    }
 
    public void visit(Car car) {
     	if (!car.invariant()){
    		System.out.println(car +"in unsafe state");

    }
}
    
}
