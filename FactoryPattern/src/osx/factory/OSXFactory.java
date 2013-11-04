package osx.factory;

import osx.components.OSXButton;
import abstraction.components.Button;
import abstraction.factory.GUIFactory;


public class OSXFactory extends GUIFactory {

	private static OSXFactory factory = new OSXFactory();

	public static OSXFactory getInstance() {
		return factory;
	};

	@Override
	public Button createButton() {
		return (new OSXButton());
	}
}
