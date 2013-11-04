package tests;

import abstraction.components.Button;
import abstraction.components.Menu;
import abstraction.factory.GUIFactory2;
import abstraction.factory.GUIFactory3;
import abstraction.factory.GUIFactoryChoice2;
import abstraction.factory.GUIFactoryChoice3;

/**
 * 
 * @author J Paul Gibson
 * @version 1
 * Check that different factories can be used but only 1 factory object of each type is ever created
 * Also check that we never mix component types (buttons and menus) in factories
 *<br>
 EXPECTED (TYPICAL) OUTPUT
 <pre>
Using factory p_factory.OSXFactory2@1b67f74 to construct aButton
OSXButton: Push a
Using factory p_factory.OSXFactory2@1b67f74 to construct aMenu
OSXMenu: Menu a
Using factory p_factory.OSXFactory2@1b67f74 to construct bButton
OSXButton: Push b
Using factory p_factory.OSXFactory2@1b67f74 to construct bMenu
OSXMenu: Menu b
</pre>
 */
public class OSXorWindowsFactory2 {

	public static void main(String[] args) {

		GUIFactory2 aFactory = GUIFactoryChoice2.getFactory();
		System.out.println("Using factory " + aFactory
				+ " to construct aButton");
		Button aButton = aFactory.createButton();
		aButton.setCaption("Push a");
		aButton.paint();
		System.out.println("\nUsing factory " + aFactory
				+ " to construct aMenu");
		Menu aMenu = aFactory.createMenu();
		aMenu.setCaption("Menu a");
		aMenu.display();

		GUIFactory2 bFactory = GUIFactoryChoice2.getFactory();
		System.out.println("\nUsing factory " + bFactory
				+ " to construct bButton");
		Button bButton = bFactory.createButton();
		bButton.setCaption("Push b");
		bButton.paint();
		System.out.println("\nUsing factory " + bFactory
				+ " to construct bMenu");
		Menu bMenu = bFactory.createMenu();
		bMenu.setCaption("Menu b");
		bMenu.display();
		
		GUIFactory3 cFactory = GUIFactoryChoice3.getFactory();
		System.out.println("\nUsing factory " + cFactory
				+ " to construct bButton");
		Button cButton = cFactory.createButton();
		cButton.setCaption("Push b");
		cButton.paint();
		System.out.println("\nUsing factory " + cFactory
				+ " to construct bMenu");
		Menu cMenu = cFactory.createMenu();
		cMenu.setCaption("Menu b");
		cMenu.display();
	}

}
