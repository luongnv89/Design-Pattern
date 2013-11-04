package specifications;


public abstract class BranchDecoratorSpecification implements BranchOfTreeSpecification{
	
	protected BranchOfTreeSpecification decoratedBranch; 
	
	public BranchDecoratorSpecification(BranchOfTreeSpecification branchToDecorate){
		decoratedBranch= branchToDecorate;
	}
	
	public void animate(){decoratedBranch.animate(); }  
	
	
	
}
