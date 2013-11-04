package reflection.tests;

import java.util.LinkedList;
import java.util.List;

import models.domesticpets.Cats;
import models.domesticpets.Dogs;
import models.domesticpets.Poodles;
import models.domesticpets.Spaniels;
import models.wild.Crocodiles;

import reflection.models.ListReflector;

//import models.Dice;

/**
 * 
 * @author J Paul Gibson
 * 
 *         Template test code for reflection problem (OOD)<br>
 * 
 * @todo <em> The students </em> are to improve the test to show that the method
 *       {@link ListReflector#lowestCommonSuperclass} is currently not working
 *       correctly<br>
 * 
 *       They are then to fix the method
 *       {@link ListReflector#lowestCommonSuperclass} and show that their fix is
 *       correct (by executing the updated test)
 * 
 */
public class TestListReflector {

	public static void main(String[] args) {

		// DomesticPets list
		List<Object> listDomesticPets = new LinkedList<Object>();

		listDomesticPets.add(new Spaniels());
		listDomesticPets.add(new Poodles());
		listDomesticPets.add(new Poodles("non default poodles"));
		listDomesticPets.add(new Cats());

		ListReflector.reflect(listDomesticPets);

		Class<? extends Object> lowest1 = ListReflector
				.lowestCommonSuperclass(listDomesticPets);

		System.out
				.println("ListReflector.lowestCommonSuperclass(listOfObjects) = "
						+ lowest1);

		// Dogs list
		List<Object> listDogs = new LinkedList<Object>();

		listDogs.add(new Spaniels());
		listDogs.add(new Poodles("non default poodle 2"));
		listDogs.add(new Dogs("Line of dog"));

		ListReflector.reflect(listDogs);

		Class<? extends Object> lowest2 = ListReflector
				.lowestCommonSuperclass(listDogs);

		System.out
				.println("ListReflector.lowestCommonSuperclass(listOfObjects) = "
						+ lowest2);

		// Animals list
		List<Object> listAnimals = new LinkedList<Object>();

		listAnimals.add(new Spaniels());
		listAnimals.add(new Poodles("non default poodle 2"));
		listAnimals.add(new Crocodiles("Hoan Kiem lake"));

		ListReflector.reflect(listAnimals);

		Class<? extends Object> lowest3 = ListReflector
				.lowestCommonSuperclass(listAnimals);

		System.out
				.println("ListReflector.lowestCommonSuperclass(listOfObjects) = "
						+ lowest3);

	}
}
