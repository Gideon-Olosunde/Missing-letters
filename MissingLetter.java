
/**
 * Write a description of class MissingLetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class MissingLetter
{
    public static void main(String[ ] args){
        Scanner input = new Scanner(System.in);
        String Missingword = "RANDOM";
        System.out.println("Guess the 6 letter word");
        String Guess=input.nextLine().toUpperCase();
        if(!Guess.toUpperCase().equals(Missingword)){
            do{
                System.out.println(" Guess the word:");
                Guess=input.nextLine().toUpperCase();
                for(int i = 0; i<Guess.length();i++){
                    String CharGuess= Character.toString(Guess.charAt(i));
                    String CharMissingword= Character.toString(Missingword.charAt(i));
                    if(CharGuess.equals(CharMissingword)){
                        System.out.print(CharMissingword);

                    } else 
                        System.out.print("[]");
                }
            }while(!Guess.equals(Missingword));
            System.out.println(" is the word,Welldone");
        } else{
            System.out.println(Guess +" "+"is the word,Welldone");
        }
    }
}