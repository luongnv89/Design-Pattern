package osx.components;

import abstraction.components.Slider;


public class OSXSlider extends Slider{
	
	@Override
	public void slide() {
		System.out.println("OSXSlider: "+ getCaption());
	}

}
