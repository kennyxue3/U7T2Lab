import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {

        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car[] carArray = {new Car("Mustang", 1500), new Car("Ferrari", 1200), new Car("Accord", 1000)};
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(cars);
    }
}
