package windows.factory;

import windows.components.WindowsButton;
import windows.components.WindowsMenu;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.factory.GUIFactory2;



public class WindowsFactory2 extends GUIFactory2{
	private static WindowsFactory2 factory = new WindowsFactory2();
	
    public static WindowsFactory2 getInstance () {return factory;};
    
    public Button createButton(){
        return(new WindowsButton());
    }
    
    public Menu createMenu(){
        return(new WindowsMenu());
    }
    
}
