package ubuntu.components;

import abstraction.components.Button;


public class UbuntuButton extends Button {

	@Override
	public void paint() {
		System.out.println("UbuntuButton: "+ getCaption());

	}

}
