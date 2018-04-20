package com.capgemini;


public class App {
    public static void main(String[] args) {
        System.out.println("Good afternoon everybody!");
        System.out.println("Welcome to the Hunger Games.");

        System.out.println("");

        //make sure to have access to the class and their methods
        ContestantController theGames = new ContestantController();
        theGames.printContestants();

        System.out.println("");

        //make sure to have access to the class and their methods
        ArenaController hungerGames = new ArenaController();
        hungerGames.fightContestant();

        System.out.println("That will be all for today. Tune in tomorrow for more.");
    }

}
