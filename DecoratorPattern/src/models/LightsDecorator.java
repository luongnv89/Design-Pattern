package models;


import specifications.BranchDecoratorSpecification;
import specifications.BranchOfTreeSpecification;

public class LightsDecorator extends BranchDecoratorSpecification{
	
	String colour;
	
	public LightsDecorator(BranchOfTreeSpecification branchOfTree){
		
		super(branchOfTree);
		colour =  "red";
			}
	
        public String getDecorations(){
		
        	String str = decoratedBranch.getDecorations();
        	str =str+ " colour = "+colour;
		return str;
		}
        
        public void animate(){
        	decoratedBranch.animate();
        	if (colour.equals("red")) colour ="white";
        	else if (colour.equals("white")) colour ="blue";
        	else colour = "red";
        	}  
}
