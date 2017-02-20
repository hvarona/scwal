package de.bitsharesmunich.cryptocoincore.base;

/**
 *
 * @author henry
 */
public class GIOTx {

    private String id;
    private Coin type;
    private GeneralCoinAddress address;
    private String addressString;
    private GeneralTransaction transaction;
    private long amount;
    private boolean isOut;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coin getType() {
        return type;
    }

    public void setType(Coin type) {
        this.type = type;
    }

    public GeneralCoinAddress getAddress() {
        return address;
    }

    public void setAddress(GeneralCoinAddress address) {
        this.address = address;
    }

    public GeneralTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(GeneralTransaction transaction) {
        this.transaction = transaction;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean isIsOut() {
        return isOut;
    }

    public void setIsOut(boolean isOut) {
        this.isOut = isOut;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

}