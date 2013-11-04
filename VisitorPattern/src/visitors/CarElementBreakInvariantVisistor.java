package visitors;

import elements.Car;
import elements.Doors;
import elements.Engine;
import elements.Wheel;
import specifications.CarElementVisitor;

public class CarElementBreakInvariantVisistor implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		// wheel.

	}

	@Override
	public void visit(Engine engine) {

	}

	/**
	 * Break the invariant of {@link Doors}.
	 * public boolean invariant(){return !(leftDoorLocked && !rightDoorLocked);}
	 * break:
	 * unlockRight(){rightDoorLocked=false;}
	 * */
	@Override
	public void visit(Doors doors) {
		doors.lockLeft();
		doors.unlockRight();
		System.out.println("\nDOOR: BREAKED successfull!");
	}

	@Override
	public void visit(Car car) {

	}

}
