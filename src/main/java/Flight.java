import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengerList;
    private ArrayList<Bag> bagList;

    public Flight(){
        this.passengerList = new ArrayList<>();
        this.bagList = new ArrayList<>();
    }



    public void checkInPassenger(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public int countPassengerList() {
       return this.passengerList.size();
    }

    public double checkInBag(Bag bag) {
        this.bagList.add(bag);

        if (bag.isOversized()) {
            return 5.00;
        } else {
            return 0.00;
        }
    }


    public int countBagList() {
        return this.bagList.size();
    }

    public void removePassenger(Passenger passenger){
        passengerList.remove(passenger);
    }

    public void removeAllPassenger() {
        this.passengerList.clear();
    }

    public void removeBag(Bag bag) {
        this.bagList.remove(bag);
    }

    public void removeAllBags() {
        this.bagList.clear();
    }
}
