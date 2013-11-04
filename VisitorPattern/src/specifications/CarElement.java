package specifications;



public interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
    
	public boolean invariant (); // Car elements must also be able to check if they are in a safe state
}

