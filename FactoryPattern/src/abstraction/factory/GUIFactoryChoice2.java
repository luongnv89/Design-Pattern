package abstraction.factory;

import osx.factory.OSXFactory2;
import ubuntu.factory.UbuntuFactory2;
import windows.factory.WindowsFactory2;
import abstraction.components.Menu;




/**
 * 
 * @author J Paul Gibson
 * @version 1 
 * Extend factory with menus
 *
 */
public abstract class GUIFactoryChoice2 extends GUIFactoryChoice {

    public static GUIFactory2 getFactory(){
    	
        OS_Type sys = readFromConfigFile("OS_TYPE");
        switch (sys) {
            case Win:
                return WindowsFactory2.getInstance();
            case OSX:
                return  OSXFactory2.getInstance();
            case Ubuntu:
            	return UbuntuFactory2.getInstance();
        }
        throw new IllegalArgumentException("The OS type " + sys + " is not recognized.");
     }
    
    public abstract Menu createMenu();
}
