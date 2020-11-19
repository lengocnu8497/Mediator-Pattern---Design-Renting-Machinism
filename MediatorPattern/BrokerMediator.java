package MediatorPattern;

import java.util.ArrayList;
import java.util.Random;

public class BrokerMediator implements Mediator {
    private ArrayList<Colleague> renters;
    private ArrayList<RentContract> currentContracts;
    private ArrayList<RentContract> listingContracts;
    
    public BrokerMediator() {
        renters = new ArrayList<Colleague>();
        currentContracts = new ArrayList<RentContract>();
        listingContracts = new ArrayList<RentContract>();
    }

    public void addListingContract(RentContract contract)
    {
        listingContracts.add(contract);
        System.out.println("Contract " + contract.getContractId() + " is added.");
    }

    public void addColleague(Colleague colleague) {
        renters.add(colleague);
        
        System.out.println(colleague.getId() + " is added.");
    }
    
    public void rentContract(RentContract givenContract, String colleague) {

        for(RentContract rentContract : listingContracts)
        {
            if(rentContract.getContractId() == givenContract.getContractId())
            {
                listingContracts.remove(rentContract);
                System.out.println("\nContrast number " + rentContract.getContractId() + " is no longer in the market.");

                rentContract.setColleagueid(colleague);
                currentContracts.add(rentContract);
                System.out.println("New contract number " + rentContract.getContractId() + " is added to current" +
                        " contract, and is rent by " + colleague);

                break;
            }
        }
    }

    public void getContracts() {
        System.out.println("\nCurrent contracts: ");
        for (RentContract contract : currentContracts)
        {
            System.out.println("Contract " + contract.getContractId() + ": \nOwner: " + contract.getColleagueid() +
                    "\nPrice: " + contract.getPrice());
        }

        System.out.println("\nListing contracts for rent: ");
        for (RentContract contract : listingContracts)
        {
            System.out.println("Contract " + contract.getContractId() + ": \nPrice: " + contract.getPrice());
        }
    }

    public void terminateRentContract(RentContract givenContract, String colleague){
        for(RentContract rentContract : currentContracts)
        {
            if(rentContract.getColleagueid().equals(colleague) && rentContract.getContractId() == givenContract.getContractId())
            {
                currentContracts.remove(rentContract);
                System.out.println("\nTerminating contract" + rentContract.getContractId() + " with " + colleague);

                System.out.println("Resetting owner's name for contract number " + rentContract.getContractId() + " to empty.");
                rentContract.setColleagueid("");

                System.out.println("Contract number " + rentContract.getContractId() + " is now available for rent.");
                listingContracts.add(rentContract);

                break;
            }
        }
    }



}
