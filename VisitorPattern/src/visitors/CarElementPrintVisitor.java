package visitors;

import elements.Car;
import elements.Doors;
import elements.Engine;
import elements.Wheel;
import specifications.CarElementVisitor;

public class CarElementPrintVisitor implements CarElementVisitor {
	
    public void visit(Wheel wheel) {      
        System.out.println(wheel);
    }
 
    public void visit(Engine engine) {
        System.out.println(engine);
    }
 
    public void visit(Doors doors) {
        System.out.println(doors);
    }
 
    public void visit(Car car) {      
        System.out.println(car);
    }
}

