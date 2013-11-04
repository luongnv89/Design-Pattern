package models;

import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;

public class StarDecorator extends BranchDecoratorSpecification {

	boolean fliping;

	public StarDecorator(BranchOfTreeSpecification branchOfTree) {

		super(branchOfTree);
		fliping = true;
	}

	public String getDecorations() {

		String str = decoratedBranch.getDecorations();
		if (fliping)
			str = str + " fliping";
		str = str + " Star.";
		return str;
	}

	public void animate() {
		decoratedBranch.animate();
		fliping = !fliping;
	}
}
