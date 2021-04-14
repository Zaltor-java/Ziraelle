package Ziraelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scrambler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long key;
        String endInput;
        System.out.println("Welcome to the  \"Ziraelle\", What are you want?"); // Ziraelle - swallow bird
        do {
            System.out.println("1.Encrypt ");
            System.out.println("2.Decrypt");
            // user input for further program behavior
            int inputChoise = Integer.parseInt(reader.readLine());
            switch (inputChoise) {
                case (1):
                    System.out.print("Enter text for encrypt: ");
                    String scramText = reader.readLine();

                    System.out.print("Enter crypt key (Number): ");
                        key = Long.parseLong(reader.readLine());
                        // passing input to the scram class and encrypting it further
                        Scram scram = new Scram();
                        System.out.println(scram.scramming(scramText, key));
                    break;
                case (2):
                    System.out.print("Enter text for deencrypt: ");
                    String descramText = reader.readLine();

                    System.out.print("Enter crypt key (Number): ");
                    key = Long.parseLong(reader.readLine());
                    Scram descram = new Scram();
                    System.out.println(descram.scramming(descramText, key));
                    break;
                default:
                    System.out.println("There is no such option");
            }
            System.out.println("Want to reuse the program? (y/n)");
            endInput = reader.readLine().toLowerCase();
        } while (endInput.equals("y"));
    }
}


