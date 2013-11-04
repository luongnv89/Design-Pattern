package tests;

import models.BallDecorator;
import models.LightsDecorator;
import models.StarDecorator;
import models.UndecoratedBranch;
import specifications.BranchOfTreeSpecification;

public class TestAllDecorators {

	public static void main(String[] args) {

		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification decoratedBranchWithStar = new StarDecorator(
				plainBranch);

		BranchOfTreeSpecification redecoratedBranchWithStarBall = new BallDecorator(
				decoratedBranchWithStar);

		BranchOfTreeSpecification redecoratedBranchWithStarBallLight = new LightsDecorator(
				redecoratedBranchWithStarBall);
		BranchOfTreeSpecification redecoratedBranchWithStarBall2Light = new BallDecorator(
				redecoratedBranchWithStarBallLight);
		BranchOfTreeSpecification redecoratedBranchWithStarBall3Light = new StarDecorator(
				redecoratedBranchWithStarBall2Light);
		BranchOfTreeSpecification redecoratedBranchWithStarBall4Light = new LightsDecorator(
				redecoratedBranchWithStarBall3Light);
		BranchOfTreeSpecification redecoratedBranchWithStarBall5Light = new BallDecorator(
				redecoratedBranchWithStarBall4Light);

		System.out.println("At beginning: "
				+ redecoratedBranchWithStarBall5Light.getDecorations());

		// Animate the first time
		redecoratedBranchWithStarBall5Light.animate();
		System.out.println("\nanimate 1: "
				+ redecoratedBranchWithStarBall5Light.getDecorations());

		// Animate the second time
		redecoratedBranchWithStarBall5Light.animate();
		System.out.println("\nanimate 2: "
				+ redecoratedBranchWithStarBall5Light.getDecorations());

		// Animate the second time
		redecoratedBranchWithStarBall5Light.animate();
		System.out.println("\nanimate 3: "
				+ redecoratedBranchWithStarBall5Light.getDecorations());

		// Animate the second time
		redecoratedBranchWithStarBall5Light.animate();
		System.out.println("\nanimate 4: "
				+ redecoratedBranchWithStarBall5Light.getDecorations());

	}

}
