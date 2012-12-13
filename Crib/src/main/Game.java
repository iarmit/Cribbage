package main;

import java.util.Scanner;

import objects.Card;
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
		Hand crib = new Hand();
		Card discard;
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
			discard = player.getHand().discard(cardNum-1);
			crib.addCard(discard);
			System.out.println("You have discarded: " + discard);
		}
		//for now randomly give 4 cards to the computer and 2 others to the crib.
		comp.setHand(new Hand(gameDeck, 4));
		crib.addCards(gameDeck,2);
		
		Card theCut = gameDeck.deal();
		
		System.out.println("\n\nThe cut: [" + theCut + "]");
		System.out.println("Players Hand:\n" + player.getHand());
		
		System.out.println("\n\nThe cut: [" + theCut + "]");
		System.out.println("Computers Hand:\n" + comp.getHand());
		input.close();
	}
	
}
