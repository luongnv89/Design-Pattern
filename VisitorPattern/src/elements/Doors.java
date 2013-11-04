package elements;

import specifications.CarElement;
import specifications.CarElementVisitor;

public class Doors implements CarElement {
	
	private boolean leftDoorLocked;
	private boolean rightDoorLocked;
	
	public Doors(){
		leftDoorLocked = true;
		rightDoorLocked = true;
	}
	
	public boolean invariant(){return !(leftDoorLocked && !rightDoorLocked);}
	
	public String toString(){
		return "LeftDoorLocked is "+leftDoorLocked+" and RightDoorLocked is "+rightDoorLocked;
		}
	
	public void lockLeft(){leftDoorLocked=true; rightDoorLocked=true;}
	public void lockRight() {rightDoorLocked=true;}
	public void unlockLeft(){leftDoorLocked=false; rightDoorLocked=false;}
	public void unlockRight(){rightDoorLocked=false;}
	
	public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

