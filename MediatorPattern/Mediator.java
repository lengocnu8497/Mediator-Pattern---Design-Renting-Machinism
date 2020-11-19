package MediatorPattern;

public interface Mediator {
    public void rentContract(RentContract givenContract, String colleague);
    public void terminateRentContract(RentContract givenContract, String colleague);
    public void addColleague(Colleague colleague);
    public void addListingContract(RentContract contract);
}
