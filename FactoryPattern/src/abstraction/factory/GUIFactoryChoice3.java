package abstraction.factory;

import osx.factory.OSXFactory3;
import ubuntu.factory.UbuntuFactory3;
import windows.factory.WindowsFactory3;
import abstraction.components.Slider;

/**
 * 
 * @author J Paul Gibson
 * @version 1 
 * Extend factory with menus
 *
 */
public abstract class GUIFactoryChoice3 extends GUIFactoryChoice2 {

	public static GUIFactory3 getFactory() {

		OS_Type sys = readFromConfigFile("OS_TYPE");
		switch (sys) {
		case Win:
			return WindowsFactory3.getInstance();
		case OSX:
			return OSXFactory3.getInstance();
		case Ubuntu:
			return UbuntuFactory3.getInstance();
		}
		throw new IllegalArgumentException("The OS type " + sys
				+ " is not recognized.");
	}

	public abstract Slider createSlider();
}
