package ubuntu.factory;

import ubuntu.components.UbuntuButton;
import ubuntu.components.UbuntuMenu;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.factory.GUIFactory2;

public class UbuntuFactory2 extends GUIFactory2 {
	private static UbuntuFactory2 factory = new UbuntuFactory2();

	public static UbuntuFactory2 getInstance() {
		return factory;
	};

	public Button createButton() {
		return (new UbuntuButton());
	}

	public Menu createMenu() {
		return (new UbuntuMenu());
	}

}