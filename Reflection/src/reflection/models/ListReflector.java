package reflection.models;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import reflection.tests.TestListReflector;

public class ListReflector {

	/**
	 * 
	 * @param <T>
	 *            is the abstract type/class of the List objects
	 * @return the most concrete class of which all the list elements are
	 *         members
	 * @todo <em> The students</em> are to write this code so that it functions
	 *       correctly as tested in {@link TestListReflector}.
	 */
	public static <T> Class<? extends Object> lowestCommonSuperclass(
			List<T> listOfObjects) {

		Class<? extends Object> result = null;

		Iterator<T> iterator = listOfObjects.iterator();

		ArrayList<ArrayList<Class<? extends Object>>> listSupperClass = new ArrayList<ArrayList<Class<? extends Object>>>();

		while (iterator.hasNext()) {

			T element = iterator.next();
			ArrayList<Class<? extends Object>> listSupper = new ArrayList<>();
			Class<? extends Object> classOfObject = element.getClass();
			Class<? extends Object> superClass = classOfObject.getSuperclass();
			listSupper.add(classOfObject);

			while (superClass != null) {
				listSupper.add(superClass);
				classOfObject = superClass;
				superClass = classOfObject.getSuperclass();
			}

			listSupperClass.add(listSupper);
		}

		Class<? extends Object> result2 = null;
		for (int k = listSupperClass.get(0).size() - 1; k >= 0; k--) {
			result2 = listSupperClass.get(0).get(k);
			boolean stop = false;

			for (int j = 0; j < listSupperClass.size(); j++) {
				if (!listSupperClass.get(j).contains(result2)) {
					stop = true;
					break;
				}
			}

			if (stop) {
				break;
			} else {
				result = result2;
			}
		}
		return result;

	}

	/**
	 * 
	 * @param <T>
	 *            is the generic type of list elements
	 * @param list
	 *            is the list elements whose information (gathered using
	 *            reflection) will be printed to the screen
	 */
	public static <T> void reflect(List<T> list) {

		Iterator<T> iterator = list.iterator();

		Class<? extends Object> classOfListElement;
		Class<? extends Object> superclassOfListElement;

		Constructor<? extends Object>[] constructorsOfListElement;
		Field[] fieldsOfListElement;
		Method[] methodsOfListElement;
		Class<? extends Object>[] parameterTypes;
		int length;

		Object defaultOfListElement = null;

		while (iterator.hasNext()) {

			T listElement = iterator.next();
			System.out.println(listElement);

			System.out
					.println("---------------------------------------------------");
			classOfListElement = listElement.getClass();
			System.out.println(classOfListElement);

			System.out
					.println("---------------------------------------------------");
			try {
				defaultOfListElement = classOfListElement.newInstance();
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
			if (defaultOfListElement != null) {
				System.out.println("Default for "
						+ defaultOfListElement.getClass());
				System.out.println(defaultOfListElement);
			} else
				System.out.println("No default constructor");

			System.out
					.println("---------------------------------------------------");
			superclassOfListElement = classOfListElement.getSuperclass();
			System.out.println("Superclass\n" + superclassOfListElement);

			System.out
					.println("---------------------------------------------------");
			constructorsOfListElement = classOfListElement.getConstructors();
			System.out.println("Constructors");

			for (int i = 0; i < constructorsOfListElement.length; i++) {
				parameterTypes = constructorsOfListElement[i]
						.getParameterTypes();
				length = parameterTypes.length;
				System.out.print(constructorsOfListElement[i].getName()
						+ "  = (");

				if (length == 0)
					System.out.println(")");
				for (int j = 0; j < length; j++) {
					System.out.print(parameterTypes[j]);
					if (j < length - 1)
						System.out.print(", ");
					else
						System.out.println(")");
				}
			}

			System.out
					.println("---------------------------------------------------");
			fieldsOfListElement = classOfListElement.getFields();
			System.out.println("Fields");

			for (int i = 0; i < fieldsOfListElement.length; i++)

				System.out.println(fieldsOfListElement[i].getName());

			System.out
					.println("---------------------------------------------------");
			methodsOfListElement = classOfListElement.getMethods();
			System.out.println("Methods");

			for (int i = 0; i < methodsOfListElement.length; i++)

				System.out.println(methodsOfListElement[i].getName());

			System.out
					.println("\n===================================================\n");

		}

	}
}
