package MediatorPattern;

public interface Mediator {
    public void rentContract(int price, String colleague);
    public void terminateRentContract(String colleague);
    public void addColleague(Colleague colleague);
}
