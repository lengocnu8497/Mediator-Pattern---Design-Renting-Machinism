package MediatorPattern;

import java.util.ArrayList;

public class BrokerMediator implements Mediator {
    private ArrayList<Colleague> renters;
    private ArrayList<RentContract> contracts;
    private ArrayList<RentContract> terminatedContracts;
    
    public BrokerMediator() {
        renters = new ArrayList<Colleague>();
        contracts = new ArrayList<RentContract>();
        terminatedContracts = new ArrayList<RentContract>();
    }
    
    
    public void addColleague(Colleague colleague) {
        renters.add(colleague);
        
        System.out.println("Is added " + colleague.getColleagueCode());
    }
    
    public void rentContract(int price, String colleague) {
        
    }
    public void terminateRentContract(String colleague);
}
