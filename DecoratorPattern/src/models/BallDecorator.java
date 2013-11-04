package models;

import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;


public class BallDecorator extends BranchDecoratorSpecification{
	
	boolean spinning;
	
	public BallDecorator(BranchOfTreeSpecification branchOfTree){
		
		super(branchOfTree);
		spinning = true;
			}
	
        public String getDecorations(){
		
        	String str = decoratedBranch.getDecorations();
        	if (spinning) str = str +" Spinning";
        	str = str+ " Ball.";
		return str;
		}
        
        public void animate(){
        	decoratedBranch.animate();
        	spinning = !spinning;
        	}  
}
