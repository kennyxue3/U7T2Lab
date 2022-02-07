import java.util.ArrayList;
/**
 * Class represents a lot of Cars
 * @author Kenny Xue
 */

public class UsedCarLot {

    /**
     * Creates an array list of stored cars
     */
    private ArrayList<Car> inventory;

    /**
     * Initializes a used car lot object
     */

    public UsedCarLot() {
        inventory = new ArrayList<>();
    }

    /**
     * Method to return the inventory of the car lot
     * @return The ArrayList of cars (the inventory)
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Method to add car to car lot
     * @param car Car to be added to the inventory
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Method to swap two car positions in the car lot
     * <p>
     * PRECONDITION: 0 &lt;= index1 &lt; inventory.size(), 0 &lt;= index2 &lt; inventory.size()
     * @param index1 Index of the first car to be swapped
     * @param index2 Index of the second car to be swapped
     * @return True or false on whether the method ran
     */
    public boolean swap(int index1, int index2) {
        if (index1 >= 0 && index2 >= 0 && index1 < inventory.size() && index2 < inventory.size() && index1 != index2) {
            Car temp = inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
            return true;
        }
        return false;
    }

    /**
     * Method for adding a car to a certain position
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd Index value of where the car should be added
     * @param carToAdd Car to be added to the inventory
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Method to remove a car from the car lot's inventory that shifts the entire inventory
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell position of the car that is desired to be sold / removed
     * @return Car removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Method to remove a car from the car lot's inventory that does not shift the inventory and replaces the position with null
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell position of the car that should be sold / removed in the inventory
     * @return Car removed
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * Method to move a car from one position to another
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove Position of desired car to be moved
     * @param destinationIndex Desired position of the car in the inventory
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        inventory.add(destinationIndex, inventory.remove(indexOfCarToMove));
    }

}
