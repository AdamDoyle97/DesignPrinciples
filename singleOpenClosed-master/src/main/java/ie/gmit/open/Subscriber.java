package ie.gmit.open;

import java.util.List;

public abstract class Subscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

    public Subscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        this.subscriberId = subscriberId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.baseRate = baseRate;
    }

    public Subscriber() {}

    abstract double calcualteBill();

    /**
     * @return the subscriberId
     */
    public Long getSubscriberId() {
        return subscriberId;
    }

    /**
     * @param subscriberId the subscriberId to set
     */
    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public Long getPhoneNumber() { return phoneNumber; }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() { return baseRate; }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) { this.baseRate = baseRate; }
}

// stops you from modifying existing code and catching bugs
// in the user controller class it is both creating a user and validating the user object meaning it is undertaking mulitple
//

