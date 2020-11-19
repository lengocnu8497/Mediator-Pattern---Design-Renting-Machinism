package MediatorPattern;

public class RentContract {
    private int price;
    private String colleagueid;
    private int contractId;
    private static int idCounter = 1;
    
    public RentContract(int price) {
        this.price = price;
        this.contractId = idCounter;
        idCounter++;
    }

    public int getPrice() {
        return price;
    }

    public void setColleagueid(String colleagueid) {
         this.colleagueid = colleagueid;
    }

    public String getColleagueid() {
        return colleagueid;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getContractId() {
        return contractId;
    }
    
}
