import java.util.Map;
import java.util.Random;

public class Passenger {
    private static String fullName;
    private int secondsInQueue;
    private static int seatNumber;

    public Passenger(String fullName, int seatNumber) {
        this.fullName = fullName;
        this.seatNumber = seatNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSecondsInQueue() {
        return secondsInQueue;
    }

    public void setSecondsInQueue(int secondsInQueue) {
        Random rand=new Random();
        secondsInQueue=rand.nextInt(6)+1;
        this.secondsInQueue = secondsInQueue;

    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", secondsInQueue=" + secondsInQueue +
                ", seatNumber=" + seatNumber +
                '}';
    }
    // public  static Passenger passengerObject=new Passenger(fullName,seatNumber);

}
    




