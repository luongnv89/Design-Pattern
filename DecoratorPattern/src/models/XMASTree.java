package models;

import java.util.ArrayList;
import java.util.Random;

import specifications.BranchOfTreeSpecification;

public class XMASTree implements BranchOfTreeSpecification {

	int numberBranch;
	ArrayList<BranchOfTreeSpecification> listBranchs;

	public XMASTree(int numberBranch) {
		super();
		this.numberBranch = numberBranch;
		listBranchs = new ArrayList<BranchOfTreeSpecification>();
		for (int i = 0; i < numberBranch; i++) {
			listBranchs.add(new UndecoratedBranch());
		}
	}

	@Override
	public void animate() {
		for (int i = 0; i < listBranchs.size(); i++) {
			listBranchs.get(i).animate();
		}

	}

	@Override
	public String getDecorations() {
		String str = "";
		for (int i = 0; i < listBranchs.size(); i++) {
			str = str + "\nBranch [" + i + "]: "
					+ listBranchs.get(i).getDecorations();
		}
		return str;
	}

	public void addBranch(BranchOfTreeSpecification newbranch) {
		listBranchs.add(newbranch);
	}

	public void addDecorator(BranchOfTreeSpecification decorateBranch)
			throws Exception {
		if (decorateBranch instanceof UndecoratedBranch) {
			System.out.println("The add decorator doesn't have any decorator!");
		} else {
			boolean replaceOK = false;
			while (!replaceOK) {
				BranchOfTreeSpecification randomBranch = getRandomBranch();
				if (randomBranch.getDecorations().contains(
						decorateBranch.getDecorations())) {
					BranchOfTreeSpecification newBranch = decorate(
							randomBranch, decorateBranch);
					listBranchs.remove(randomBranch);
					listBranchs.add(newBranch);
					replaceOK = true;
				} else {
					randomBranch.animate();
					if (randomBranch.getDecorations().contains(
							decorateBranch.getDecorations())) {
						BranchOfTreeSpecification newBranch = decorate(
								randomBranch, decorateBranch);
						listBranchs.remove(randomBranch);
						newBranch.animate();
						listBranchs.add(newBranch);
						replaceOK = true;
					}
				}
			}
		}

	}

	private BranchOfTreeSpecification decorate(
			BranchOfTreeSpecification randomBranch,
			BranchOfTreeSpecification decorateBranch) throws Exception {
		System.out.println("find decorate");
		if (decorateBranch instanceof LightsDecorator) {
			return new LightsDecorator(randomBranch);
		} else if (decorateBranch instanceof StarDecorator) {
			return new StarDecorator(randomBranch);
		} else if (decorateBranch instanceof BallDecorator) {
			return new BallDecorator(randomBranch);
		} else {
			throw new Exception("Cannot regconize the decorator!");
		}
	}

	private BranchOfTreeSpecification getRandomBranch() {
		System.out.println("Get random branch!");
		Random ran = new Random();
		int index = ran.nextInt(listBranchs.size());
		return listBranchs.get(index);
	}

	public void removeBranch() {
		listBranchs.remove(listBranchs.size() - 1);
	}

}
