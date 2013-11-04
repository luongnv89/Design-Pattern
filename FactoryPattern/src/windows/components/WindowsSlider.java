package windows.components;

import abstraction.components.Slider;



public class WindowsSlider extends Slider{
	
    public void slide(){
        System.out.println("WindowsSlider: "+ getCaption());
    }
} 
