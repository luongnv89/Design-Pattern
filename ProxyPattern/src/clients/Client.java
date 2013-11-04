package clients;

import services.ServiceInterface;

/**
 * Client using service to check a number
 * @author crocode
 *
 */
public class Client {

	/**
	 * Service provide for user
	 */
	ServiceInterface services;

	public Client(ServiceInterface services) {
		this.services = services;
	}

	/**
	 * Call service
	 * @param number the input number of service
	 * @return Depend on the provide service 
	 * @throws Exception
	 */
	public boolean callService(int number) throws Exception {
		return this.services.checkNumber(number);
	}

}
