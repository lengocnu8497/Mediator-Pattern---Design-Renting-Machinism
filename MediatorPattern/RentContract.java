package MediatorPattern;

public class RentContract {
    private int price;
    private String cid;
    private String contractId;
    
    
    public RentContract(int price, String cid, String contractId) {
        this.price = price;
        this.cid = cid;
        this.contractId = contractId;
    }

    public int getPrice() {
        return price;
    }


    public String getCid() {
        return cid;
    }

    public String getContractId() {
        return contractId;
    }
    
}
