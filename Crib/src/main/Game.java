package main;

import java.util.Scanner;

import objects.Deck;
import objects.Hand;
import objects.Player;

public class Game {
	public final int WINNING_SCORE = 121;
	
	
	public static void main(String[] args){
		System.out.println("Welcome to Ian's Crib!");
		
		/*Scanner input = new Scanner(System.in);
		String command = null;
		do {
			if (command == "error") {
				System.out.println("Invalid input try again.\n\n");
			}
			System.out.println("What would you like to do?");
			System.out.println("1. Play Crib");
			System.out.println("2. Quit");
			System.out.print(">> ");
			command = input.nextLine();
			if (command.equals("1")) {
			*/	play_crib();
		/*	} else if (!command.equals("2")) {
				command = "error";
			}
		} while (! command.equals("2"));
		
		*/
		System.out.println("\n\n\n\n******END OF PROCCESSING******");
	}
	
	public static void play_crib() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nBeginning Game...");
		Player player = new Player("Player");
		Player comp = new Player("Computer");
		
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		
		player.setHand(new Hand(gameDeck,6));
		for (int i = 0; i < 2; i++){
			int cardNum = 0;
			System.out.println("Players Hand:\n" + player.getHand());
			while (cardNum <= 0 || cardNum > player.getHand().size()) {
				System.out.print("Select a card to discard: ");
				cardNum = input.nextInt();
			}
			System.out.println("You have discarded: " + player.getHand().discard(cardNum - 1));
		}
		comp.setHand(new Hand(gameDeck, 6));
		
		
		
		System.out.println("Players Hand:\n" + player.getHand());
		
		input.close();
	}
	
}
