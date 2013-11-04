package windows.factory;

import windows.components.WindowsButton;
import abstraction.components.Button;
import abstraction.factory.GUIFactory;

/**
 * 
 * @author J Paul Gibson
 * @version 1
 * A concrete Windows factory for constructing Windows buttons<br>
 * Implemented as a Singleton4 
 *
 */
public class WindowsFactory extends GUIFactory {
	private static WindowsFactory factory = new WindowsFactory();

	public static WindowsFactory getInstance() {
		return factory;
	};

	public Button createButton() {
		return (new WindowsButton());
	}
}
