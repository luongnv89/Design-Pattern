package services;

/**
 * Service executed the checking a number is a positive or negative number
 * @author crocode
 *
 */
public class OriginalService2 implements ServiceInterface {

	@Override
	public boolean checkNumber(int number) throws Exception {
		boolean even = (number > 0);
		if (even)
			System.out.println(number + " is a positive number");
		else
			System.out.println(number + " is a negative number");
		return even;
	}

}
