package main.ua.lviv.iot;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        gameManager.addToy(new Ball(Size.SMALL, Age.SCHOOLER, null, null));
        gameManager.addToy(new Doll(Size.BIG, Age.PRESCHOOLER, null));
        gameManager.addToy(new Hoop(Size.MEDIUM, Age.BABY, null, 0));
        gameManager.addToy(new ToyCar(Size.BIG, Age.SCHOOLER, false));
        gameManager.addToy(new Ball(Size.SMALL, Age.SCHOOLER, SportName.BALL_GAME, BallType.VOLEYBALL));

        System.out.println("\nInitial list of toys:\n");
        printList(gameManager.getToys());

        System.out.println("\nSorted list:\n");
        gameManager.sortByAge(gameManager.getToys());
        printList(gameManager.getToys());
    }

    /**
     * Shows all element of the list
     * 
     * @param list
     *            of toys
     */
    public static void printList(List<Toy> list) {
        for (Toy toy : list) {
            System.out.print(toy.getAge() + ", ");
            System.out.print(toy.getSize() + ", ");
            System.out.println(toy.getToyType());
        }
    }
}
