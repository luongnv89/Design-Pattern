package abstraction.factory;

import osx.factory.OSXFactory;
import ubuntu.factory.UbuntuFactory;
import windows.factory.WindowsFactory;
import abstraction.components.Button;

/**
 * 
 * @author J Paul Gibson
 * @version 1 
 * Simulate the setting of OS type by reading from a configuration file.<br>
 * A random choice will lead to construction of either a Windows or an OSX factory
 */
public abstract class GUIFactoryChoice {
	public enum OS_Type {
		Win, OSX, Ubuntu
	}

	protected static OS_Type readFromConfigFile(String param) {
		double choice = Math.random();
		if (choice < 0.33)
			return OS_Type.Win;
		else if (choice < 0.67)
			return OS_Type.Ubuntu;
		else
			return OS_Type.OSX;
	}

	public static GUIFactory getFactory() {

		OS_Type sys = readFromConfigFile("OS_TYPE");
		switch (sys) {
		case Win:
			return WindowsFactory.getInstance();
		case OSX:
			return OSXFactory.getInstance();
		case Ubuntu:
			return UbuntuFactory.getInstance();
		}
		throw new IllegalArgumentException("The OS type " + sys
				+ " is not recognized.");
	}

	public abstract Button createButton();
}
