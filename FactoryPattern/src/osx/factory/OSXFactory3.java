package osx.factory;

import osx.components.OSXButton;
import osx.components.OSXMenu;
import osx.components.OSXSlider;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.components.Slider;
import abstraction.factory.GUIFactory3;

public class OSXFactory3 extends GUIFactory3 {
	private static OSXFactory3 factory = new OSXFactory3();

	public static OSXFactory3 getInstance() {
		return factory;
	};

	public Button createButton() {
		return (new OSXButton());
	}

	public Menu createMenu() {
		return (new OSXMenu());
	}

	@Override
	public Slider createSlider() {
		return (new OSXSlider());
	}

}