package ubuntu.factory;

import ubuntu.components.UbuntuButton;
import ubuntu.components.UbuntuMenu;
import ubuntu.components.UbuntuSlider;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.components.Slider;
import abstraction.factory.GUIFactory3;

public class UbuntuFactory3 extends GUIFactory3 {
	private static UbuntuFactory3 factory = new UbuntuFactory3();

	public static UbuntuFactory3 getInstance() {
		return factory;
	};

	public Button createButton() {
		return (new UbuntuButton());
	}

	public Menu createMenu() {
		return (new UbuntuMenu());
	}

	@Override
	public Slider createSlider() {
		return (new UbuntuSlider());
	}

}