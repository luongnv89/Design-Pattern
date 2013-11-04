package windows.factory;

import windows.components.WindowsButton;
import windows.components.WindowsMenu;
import windows.components.WindowsSlider;
import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.components.Slider;
import abstraction.factory.GUIFactory3;



public class WindowsFactory3 extends GUIFactory3{
	private static WindowsFactory3 factory = new WindowsFactory3();
	
    public static WindowsFactory3 getInstance () {return factory;};
    
    public Button createButton(){
        return(new WindowsButton());
    }
    
    public Menu createMenu(){
        return(new WindowsMenu());
    }

	@Override
	public Slider createSlider() {
		return (new WindowsSlider());
	}
    
}
