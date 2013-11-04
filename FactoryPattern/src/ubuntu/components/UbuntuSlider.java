package ubuntu.components;

import abstraction.components.Slider;


public class UbuntuSlider extends Slider{
	
	@Override
	public void slide() {
		System.out.println("UbuntuSlider: "+ getCaption());
	}

}
