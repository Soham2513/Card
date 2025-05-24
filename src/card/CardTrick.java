/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * modifier Soham
 * id= 991797785
 * id= 991797785
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rnd.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i]=c;
        }
        for (int i = 0; i < magicHand.length; i++) {
    System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
}
            Scanner inp = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
          System.out.print("Enter a card value (1-13):");
          int userCard = inp.nextInt();
          System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
          int userSt = inp.nextInt();
          if (userSt < 0 || userSt > 3) {
    System.out.println("Invalid suit number! Please enter 0-3.");
    return;
}
          
           Card Ucard = new Card();
           Ucard.setValue(userCard);
            Ucard.setSuit(Card.SUITS[userSt]);
       
        // add one luckcard hard code 2,clubs
         Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs2");
         // and search magicHand here
        boolean userFound = false;
        boolean luckyFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            Card currentCard = magicHand[i];
     
       if (userFound == false && 
                     currentCard.getValue() == Ucard.getValue() && 
               currentCard.getSuit().equals(Ucard.getSuit())) {
                      userFound = true;
}
        if (luckyFound == false && 
                currentCard.getValue() == luckyCard.getValue() && 
         currentCard.getSuit().equals(luckyCard.getSuit())) {
                luckyFound = true;
           }
            if (userFound && luckyFound) {
                break;
            }
        }
        //Then report the result here
    if (userFound) {
    System.out.println("Congratulations, Your card is in the magic hand.");
    }
    
 else {
    System.out.println("Sorry, Your card is not in the magic hand.");
}
     
         
    }
   
}
