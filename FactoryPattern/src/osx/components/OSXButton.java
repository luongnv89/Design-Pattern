package osx.components;

import abstraction.components.Button;


public class OSXButton extends Button {

	@Override
	public void paint() {
		System.out.println("OSXButton: "+ getCaption());

	}

}
