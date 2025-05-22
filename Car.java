import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car>{
    public String model;
    public int rok;

    public Car(String model, int rok) {
        this.model = model;
        this.rok = rok;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.rok, other.rok);
    }

    @Override
    public String toString() {
        return model + ": " + rok;
    }
}

