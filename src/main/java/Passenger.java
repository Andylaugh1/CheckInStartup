import javax.management.openmbean.TabularData;
import java.util.ArrayList;

public class Passenger {

    private ArrayList<Bag> bagList;

    public Passenger(){
        this.bagList = new ArrayList<>();
    }


    public int countBags() {
        return this.bagList.size();
    }

    public void addBag(Bag bag) {
        this.bagList.add(bag);
    }

    public ArrayList<Bag> getBags() {
        return new ArrayList<>(this.bagList);
    }
}
