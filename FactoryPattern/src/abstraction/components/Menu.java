package abstraction.components;

public abstract class Menu {

	 private String caption;
	    public abstract void display();
	 
	    public String getCaption() {return caption;}
	 
	    public void setCaption(String caption){
	        this.caption = caption;
	    }
}
