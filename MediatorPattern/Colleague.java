package MediatorPattern;


public abstract class Colleague {
    private Mediator mediator;
    private String cid;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public void rentContract(int price, Colleague colleague) {
        mediator.rentContract(price, this.cid);
    }
    public void terminateRentContract(Colleague colleague) {
         mediator.terminateRentContract(this.cid);
    }
    
    public void setColleagueCode(String id) {
        this.cid = id;
    }
    
    public String getColleagueCode() {
        return cid;
    }
}
