package specifications;

import elements.*;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Doors doors);
    void visit(Car car);
}
 

 
