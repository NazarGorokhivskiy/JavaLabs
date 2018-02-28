package ua.lviv.iot;

import java.util.*;

public class GameManager {
    private List<Toy> toys = new LinkedList<>();

    public GameManager() {

    }

    /**
     * This method sorts list of toys on the basis of their age parameter
     * @param resultToys 
     */
    public void sortByAge(List<Toy> resultToys) {
        resultToys.sort((Toy t1, Toy t2) -> t1.getAge().compareTo(t2.getAge()));
    }

    /**
     * This method finds all toys that correspond to at least one of given argument
     * 
     * @param age
     * @param size
     * @param toyType
     * @return List of found toys
     */
    public List<Toy> findByGroup(Age age, Size size, ToyType toyType) {
        List<Toy> resultToys = new LinkedList<Toy>();

        for (Toy toy: toys) {
            if ((toy.getAge() == age) || (toy.getSize() == size)
                    || (toy.getToyType() == toyType)) {
                resultToys.add(toy);
            }
        }

        return resultToys;
    }

    /**
     * This method calculate toy's quantity on the basis of price of one random toy,
     * beacause every toy has the same price ;)
     * 
     * @param money
     * @return Quantity of toys
     */
    public int calculateToyQuantity(int money) {
        return (int) (money / toys.get(0).getPrice());
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
    }

}
