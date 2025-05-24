import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("a", 91));
        cars.add(new Car("b", 82));
        cars.add(new Car("c", 73));
        cars.add(new Car("d", 64));
        cars.add(new Car("e", 55));
        cars.add(new Car("f", 46));
        cars.add(new Car("g", 37));
        cars.add(new Car("h", 28));
        cars.add(new Car("i", 19));
        cars.add(new Car("j", 10));
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
        int numbers[]=new int[10];
        fillArray(numbers);
        for (int num:numbers){
            System.out.println(num+ " ");
        }
    }

    public static int readNumber() throws NegativeNumberException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if(number<0){
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            }catch(NegativeNumberException e){
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }

}
