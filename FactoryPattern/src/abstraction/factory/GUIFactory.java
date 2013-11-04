package abstraction.factory;

import windows.factory.WindowsFactory;
import abstraction.components.Button;



public abstract class GUIFactory{ 
	
    public static GUIFactory getFactory() {
          return WindowsFactory.getInstance();
    }
    
    public abstract Button createButton();
    
}

