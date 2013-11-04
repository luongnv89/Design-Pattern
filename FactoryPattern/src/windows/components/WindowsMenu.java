package windows.components;

import abstraction.components.Menu;

public class WindowsMenu extends Menu{
	
    public void display(){
        System.out.println("WindowsMenu: "+ getCaption());
    }

}
