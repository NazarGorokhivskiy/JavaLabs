package ua.lviv.iot;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class GameManager {
    private List<Toy> toys = new LinkedList<>();

    public GameManager() {

    }

    /**
     * This method sorts list of toys on the basis of their age parameter
     *
     * @param resultToys
     */
    public final void sortByAge(final List<Toy> resultToys) {
        resultToys.sort(Comparator.comparing(Toy::getAge));
    }

    /**
     * This method finds all toys that correspond to at least one of given argument
     *
     * @param age
     * @param size
     * @param toyType
     * @return List of found toys
     */
    public final List<Toy> findByGroup(final Age age, final Size size, final ToyType toyType) {
        List<Toy> resultToys = new LinkedList<>();

        for (Toy toy : toys) {
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
    public final int calculateToyQuantity(final int money) {
        return (int) (money / toys.get(0).getPrice());
    }

    public final List<Toy> getToys() {
        return toys;
    }

    public final void setToys(final List<Toy> toys) {
        this.toys = toys;
    }

    public final void addToy(final Toy toy) {
        this.toys.add(toy);
    }

}
