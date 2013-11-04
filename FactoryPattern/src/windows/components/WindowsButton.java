package windows.components;

import abstraction.components.Button;



public class WindowsButton extends Button{
	
    public void paint(){
        System.out.println("WindowsButton: "+ getCaption());
    }
} 
