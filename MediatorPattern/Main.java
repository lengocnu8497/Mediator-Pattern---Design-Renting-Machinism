package MediatorPattern;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    BrokerMediator brokerMediator = new BrokerMediator();

	    CPPVillage cppBroker = new CPPVillage(brokerMediator);

	    CaliforniaApartments caBroker = new CaliforniaApartments(brokerMediator);

		Random random = new Random();
	    RentContract rentContract1 = new RentContract(random.nextInt(10000));
		RentContract rentContract2 = new RentContract(random.nextInt(10000));
		RentContract rentContract3 = new RentContract(random.nextInt(10000));
		RentContract rentContract4 = new RentContract(random.nextInt(10000));

		brokerMediator.addListingContract(rentContract1);
		brokerMediator.addListingContract(rentContract2);
		brokerMediator.addListingContract(rentContract3);
		brokerMediator.addListingContract(rentContract4);

		cppBroker.rentContract(rentContract1);
		cppBroker.rentContract(rentContract2);
		cppBroker.rentContract(rentContract3);
		cppBroker.terminateRentContract(rentContract2);

		caBroker.rentContract(rentContract4);
		caBroker.rentContract(rentContract2);
		caBroker.terminateRentContract(rentContract4);

		brokerMediator.getContracts();

    }
}
