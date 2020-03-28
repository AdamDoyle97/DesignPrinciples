package ie.gmit.open;
import java.util.List;

public class PhoneSubscriber extends Subscriber {
        public PhoneSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
            super();
        }

    public double calculateBill(){
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*getBaseRate()/100;
    }

    @Override
    double calcualteBill() { return 0; }
}