package MediatorPattern;

public class CPPVillage extends Colleague{
    public CPPVillage(Mediator mediator) {
        super(mediator);
        this.setId("CPP Village");
        System.out.println("\nCPP Village is now signed up with the broker");
    }
}
