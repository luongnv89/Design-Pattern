package osx.factory;

import osx.components.OSXButton;
import osx.components.OSXMenu;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.factory.GUIFactory2;

public class OSXFactory2 extends GUIFactory2 {
	private static OSXFactory2 factory = new OSXFactory2();

	public static OSXFactory2 getInstance() {
		return factory;
	};

	public Button createButton() {
		return (new OSXButton());
	}

	public Menu createMenu() {
		return (new OSXMenu());
	}

}