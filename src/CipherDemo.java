/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class CipherDemo{
    // driver program
    public static void main(String[] args) {
        int choice, choice2;
        //  get input from the console
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (true) {

            
            System.out.println("1.To Decode A Message");
            System.out.println("2.Exit");

            do {
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                input.nextLine();

                if (choice == 3)
                    System.exit(0);

            } while (choice > 3 || choice < 1);

            System.out.println("\n\n1.Substitution Cipher");
            System.out.println("2.Shuffle Cipher");
            System.out.println("3.Exit");

            do {
                System.out.print("Enter your choice: ");
                choice2 = input.nextInt();
                input.nextLine();

                if (choice2 == 3)
                    System.exit(0);

            } while (choice2 > 3 || choice2 < 1);

            String text;
            int n;
           
            
            switch (choice) {

          
            case 1: // decoding a message
                System.out.print("Enter text to be decode: ");
                text = input.nextLine();
                String decodedMsg = "";

                switch (choice2) {
                case 1: // using substitution cipher
                    System.out.print("Enter shift value: ");
                    n = input.nextInt();
                    input.nextLine();
                    SubstitutionCipher sub = new SubstitutionCipher(n);
                    decodedMsg = sub.decode(text);
                    System.out.println("Decoded Message: " + decodedMsg);
                    break;
                case 2: // using shuffle cipher
                    System.out.print("Enter number of shuffles: ");
                    n = input.nextInt();
                    input.nextLine();
                    ShuffleCipher shu = new ShuffleCipher(n);
                    decodedMsg = shu.decode(text);
                    System.out.println("Encode Message: " + decodedMsg);
                    break;
                } 
                break;
            } 
        } 
    } 
} 
