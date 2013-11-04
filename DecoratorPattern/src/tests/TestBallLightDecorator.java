package tests;

import models.BallDecorator;
import models.LightsDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestBallLightDecorator {

	public static void main(String[] args) {

		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranchLightBall = new LightsDecorator(
				new BallDecorator(plainBranch));

		BranchOfTreeSpecification reDecoratedBallLight = new BallDecorator(
				new LightsDecorator(plainBranch));

		System.out.println("plainBranch.getDecorations() ="
				+ plainBranch.getDecorations());
		System.out.println("decoratedBranchLightBall.getDecorations() ="
				+ decoratedBranchLightBall.getDecorations());
		System.out.println("reDecoratedBallLight.getDecorations() ="
				+ reDecoratedBallLight.getDecorations());

		// Animate the first time
		System.out.println();
		plainBranch.animate();
		System.out.println("plainBranch.animate.getDecorations() ="
				+ plainBranch.getDecorations());

		decoratedBranchLightBall.animate();
		System.out
				.println("decoratedBranchLightBall.animate.getDecorations() ="
						+ decoratedBranchLightBall.getDecorations());
		reDecoratedBallLight.animate();

		System.out.println("reDecoratedBallLight.animate.getDecorations() ="
				+ reDecoratedBallLight.getDecorations());

		// Animate the second time
		System.out.println();
		plainBranch.animate();
		System.out.println("plainBranch.animate.getDecorations() ="
				+ plainBranch.getDecorations());

		decoratedBranchLightBall.animate();
		System.out
				.println("decoratedBranchLightBall.animate.getDecorations() ="
						+ decoratedBranchLightBall.getDecorations());

		reDecoratedBallLight.animate();
		System.out.println("reDecoratedBallLight.animate.getDecorations() ="
				+ reDecoratedBallLight.getDecorations());
	}

}
