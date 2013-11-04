package osx.components;

import abstraction.components.Menu;


public class OSXMenu extends Menu{
	
    public void display(){
        System.out.println("OSXMenu: "+ getCaption());
    }

}
