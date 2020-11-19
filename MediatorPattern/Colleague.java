package MediatorPattern;


public abstract class Colleague {
    private Mediator mediator;
    private String id;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public void rentContract(RentContract givenContract) {
        mediator.rentContract(givenContract, this.id);
    }
    public void terminateRentContract(RentContract givenContract) {
         mediator.terminateRentContract(givenContract, this.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
