package MediatorPattern;

public class CaliforniaApartments extends Colleague{
    public CaliforniaApartments(Mediator mediator) {
        super(mediator);
        this.setId("CA Apartments");
        System.out.println("\nCalifornia Apartments is now signed up with the broker");
    }
}
