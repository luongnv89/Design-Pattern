package tests;

import specifications.BranchOfTreeSpecification;
import models.BallDecorator;
import models.LightsDecorator;
import models.StarDecorator;
import models.UndecoratedBranch;
import models.XMASTree;

public class TestXMASTree {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BranchOfTreeSpecification plainBranch = new UndecoratedBranch();
		BranchOfTreeSpecification lightBranch = new LightsDecorator(plainBranch);
		BranchOfTreeSpecification ballBranch = new BallDecorator(plainBranch);
		BranchOfTreeSpecification starBranch = new StarDecorator(plainBranch);

		XMASTree myTree2Light2Ball = new XMASTree(4);
		myTree2Light2Ball.addDecorator(lightBranch);
		myTree2Light2Ball.animate();
		myTree2Light2Ball.addDecorator(lightBranch);
		myTree2Light2Ball.addDecorator(ballBranch);
		myTree2Light2Ball.addDecorator(ballBranch);

		System.out.println("\nXMAS tree with 2 lights - 2 ball");
		System.out.println("myTree2Light2Ball.getDecorations():"
				+ myTree2Light2Ball.getDecorations());
		myTree2Light2Ball.animate();
		System.out.println("myTree2Light2Ball.animate.getDecorations():"
				+ myTree2Light2Ball.getDecorations());

//		XMASTree myTree2Light3Star = new XMASTree();
//		myTree2Light3Star.addBranch(new LightsDecorator(plainBranch));
//		myTree2Light3Star.addBranch(new LightsDecorator(plainBranch));
//		myTree2Light3Star.addBranch(new StarDecorator(plainBranch));
//		myTree2Light3Star.addBranch(new StarDecorator(plainBranch));
//		myTree2Light3Star.addBranch(new StarDecorator(plainBranch));
//
//		System.out.println("\nXMAS tree with 2 lights - 3 star");
//		System.out.println("myTree2Light3Star.getDecorations():"
//				+ myTree2Light3Star.getDecorations());
//		myTree2Light3Star.animate();
//		System.out.println("myTree2Light3Star.animate.getDecorations():"
//				+ myTree2Light3Star.getDecorations());
//
//		XMASTree myTree2Star3Ball = new XMASTree();
//		myTree2Star3Ball.addBranch(new StarDecorator(plainBranch));
//		myTree2Star3Ball.addBranch(new StarDecorator(plainBranch));
//		myTree2Star3Ball.addBranch(new BallDecorator(plainBranch));
//		myTree2Star3Ball.addBranch(new BallDecorator(plainBranch));
//		myTree2Star3Ball.addBranch(new BallDecorator(plainBranch));
//
//		System.out.println("\nXMAS tree with 2 star - 3 ball");
//		System.out.println("myTree2Star3Ball.getDecorations():"
//				+ myTree2Star3Ball.getDecorations());
//		myTree2Star3Ball.animate();
//		System.out.println("myTree2Star3Ball.animate.getDecorations():"
//				+ myTree2Star3Ball.getDecorations());
//
//		XMASTree myTree2Star2Ball2Light = new XMASTree();
//		myTree2Star2Ball2Light.addBranch(new StarDecorator(plainBranch));
//		myTree2Star2Ball2Light.addBranch(new StarDecorator(plainBranch));
//		myTree2Star2Ball2Light.addBranch(new BallDecorator(plainBranch));
//		myTree2Star2Ball2Light.addBranch(new BallDecorator(plainBranch));
//		myTree2Star2Ball2Light.addBranch(new LightsDecorator(plainBranch));
//		myTree2Star2Ball2Light.addBranch(new LightsDecorator(plainBranch));
//		System.out.println("\nXMAS tree with 2 star- 2 lights - 2 ball");
//		System.out.println("myTree2Star2Ball2Light.getDecorations():"
//				+ myTree2Star2Ball2Light.getDecorations());
//		myTree2Star2Ball2Light.animate();
//		System.out.println("myTree2Star2Ball2Light.animate.getDecorations():"
//				+ myTree2Star2Ball2Light.getDecorations());

	}
}
