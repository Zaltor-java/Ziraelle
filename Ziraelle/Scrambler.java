package Ziraelle;

import java.util.Scanner;

public class Scrambler {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        long key;
        String endInput;
        System.out.println("Добро пожаловать в программу \"Ziraelle\", Что вы хотите сделать?"); // Ziraelle - ласточка. swallow bird
        do {
            System.out.println("1.Зашифровать ");
            System.out.println("2.Расшифровать");
            // пользовательский ввод на дальнейшее поведение программы
            int inputChoise = scn.nextInt();
            switch (inputChoise) {
                case (1):
                    System.out.print("Введите текст для шифрования: ");
                    String scramText = scn.next();

                    System.out.print("Придумайте ключ шифрования (Числовое): ");
                    key = scn.nextLong();

                    // передача ввода в класс scram и его дальнейшее шифрование
                    Scram scram = new Scram(scramText, key);
                    System.out.println(scram.scramming());
                    break;
                case (2):
                    System.out.print("Введите текст для расшифровки: ");
                    String descramText = scn.next();

                    System.out.print("Введите ключ шифрования: ");
                    key = scn.nextLong();

                    Scram descram = new Scram(descramText, key);
                    System.out.println(descram.scramming());
                    break;
                default:
                    System.out.println("Такого варианта нет");
            }
            System.out.println("Хотите повторно воспользоваться программой? (y/n)");
            endInput = scn.next().toLowerCase();
        } while (endInput.equals("y"));
    }
}


