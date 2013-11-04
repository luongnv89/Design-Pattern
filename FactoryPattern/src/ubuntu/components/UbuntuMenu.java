package ubuntu.components;

import abstraction.components.Menu;


public class UbuntuMenu extends Menu{
	
    public void display(){
        System.out.println("UbuntuMenu: "+ getCaption());
    }

}
