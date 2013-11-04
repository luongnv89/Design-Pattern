package tests;

import models.BallDecorator;
import models.LightsDecorator;
import models.StarDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestMultiDecorators {

	public static void main(String[] args) {

		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranchWithStar = new StarDecorator(
				plainBranch);

		BranchOfTreeSpecification redecoratedBranchWithStarBall = new BallDecorator(
				decoratedBranchWithStar);

		BranchOfTreeSpecification redecoratedBranchWithStarBallLight = new LightsDecorator(
				redecoratedBranchWithStarBall);

		System.out.println("\nplainBranch.getDecorations() ="
				+ plainBranch.getDecorations());
		System.out.println("decoratedBranchWithStar.getDecorations() ="
				+ decoratedBranchWithStar.getDecorations());
		System.out.println("redecoratedBranchWithStarBall.getDecorations() ="
				+ redecoratedBranchWithStarBall.getDecorations());

		System.out
				.println("redecoratedBranchWithStarBallLight.getDecorations() ="
						+ redecoratedBranchWithStarBallLight.getDecorations());

		// Animate the first time
		plainBranch.animate();
		System.out.println("\nplainBranch.animate.getDecorations() ="
				+ plainBranch.getDecorations());

		decoratedBranchWithStar.animate();
		System.out.println("decoratedBranchWithStar.animate.getDecorations() ="
				+ decoratedBranchWithStar.getDecorations());

		redecoratedBranchWithStarBall.animate();
		System.out
				.println("redecoratedBranchWithStarBall.animate.getDecorations() ="
						+ redecoratedBranchWithStarBall.getDecorations());

		redecoratedBranchWithStarBallLight.animate();
		System.out
				.println("redecoratedBranchWithStarBallLight.animate.getDecorations() ="
						+ redecoratedBranchWithStarBallLight.getDecorations());

		// Animate the second time
		plainBranch.animate();
		System.out.println("\nplainBranch.animate.getDecorations() ="
				+ plainBranch.getDecorations());

		decoratedBranchWithStar.animate();
		System.out.println("decoratedBranchWithStar.animate.getDecorations() ="
				+ decoratedBranchWithStar.getDecorations());

		redecoratedBranchWithStarBall.animate();
		System.out
				.println("redecoratedBranchWithStarBall.animate.getDecorations() ="
						+ redecoratedBranchWithStarBall.getDecorations());

		redecoratedBranchWithStarBallLight.animate();
		System.out
				.println("redecoratedBranchWithStarBallLight.animate.getDecorations() ="
						+ redecoratedBranchWithStarBallLight.getDecorations());
	}

}
