package com.capgemini;


public class App {
    public static void main(String[] args) {
        System.out.println("Good afternoon everybody!");
        System.out.println("Welcome to the Hunger Games");

        ArenaController hungerGames = new ArenaController();
        hungerGames.fightContestant();

        ContestantController theGames = new ContestantController();
        theGames.printContestants();
    }

}
