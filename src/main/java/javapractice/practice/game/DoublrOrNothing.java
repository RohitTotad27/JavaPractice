package javapractice.practice.game;

import java.util.Random;
import java.util.Scanner;

public class DoublrOrNothing
{
    private String isStillPlaying;

    public static void main(String[] args) {
        DoublrOrNothing game = new DoublrOrNothing();
        game.playGame();
    }
    private void playGame() {
        printWelcome();
        asUserToContinue();
    }

    private void asUserToContinue() {
        System.out.println("Do you want to continue then Press YES ");
        Scanner scanner = new Scanner(System.in);
        this.isStillPlaying = String.valueOf(scanner.nextLine().toUpperCase().equals("YES"));

    }

    private void printWelcome() {
        Integer start_points=10;
        System.out.println("Welcoome to the Game"+"We will start off with"+start_points+" points");
    }

}