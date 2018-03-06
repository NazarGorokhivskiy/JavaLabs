package ua.lviv.iot;

import java.util.List;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        GameManager gameManager = new GameManager();

        gameManager.addToy(new Ball(Size.SMALL, Age.SCHOOLER, SportName.BALL_GAME, BallType.VOLEYBALL));
        gameManager.addToy(new Doll(Size.BIG, Age.PRESCHOOLER, Sex.FEMALE));
        gameManager.addToy(new Hoop(Size.MEDIUM, Age.BABY, SportName.GYMNASTICS, 0));
        gameManager.addToy(new ToyCar(Size.BIG, Age.SCHOOLER, false));

        System.out.println("\nInitial list of toys:\n");
        printList(gameManager.getToys());

        System.out.println("\nList of found toys:\n");
        printList(gameManager.findByGroup(Age.BABY, Size.BIG, ToyType.DOLL));

        System.out.println("\nSorted list:\n");
        gameManager.sortByAge(gameManager.getToys());
        printList(gameManager.getToys());

    }

    /**
     * Shows all element of the list
     *
     * @param list of toys
     */
    public static void printList(final List<Toy> list) {
        for (Toy toy : list) {
            System.out.print(toy.getAge() + ", ");
            System.out.print(toy.getSize() + ", ");
            System.out.println(toy.getToyType());
        }
    }
}
