package ubuntu.factory;

import ubuntu.components.UbuntuButton;
import abstraction.components.Button;
import abstraction.factory.GUIFactory;


public class UbuntuFactory extends GUIFactory {

	private static UbuntuFactory factory = new UbuntuFactory();

	public static UbuntuFactory getInstance() {
		return factory;
	};

	@Override
	public Button createButton() {
		return (new UbuntuButton());
	}
}
