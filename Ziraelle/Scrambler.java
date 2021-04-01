package Ziraelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scrambler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long key;
        String endInput;
        System.out.println("Добро пожаловать в программу \"Ziraelle\", Что вы хотите сделать?"); // Ziraelle - ласточка. swallow bird
        do {
            System.out.println("1.Зашифровать ");
            System.out.println("2.Расшифровать");
            // пользовательский ввод на дальнейшее поведение программы
            int inputChoise = Integer.parseInt(reader.readLine());
            switch (inputChoise) {
                case (1):
                    System.out.print("Введите текст для шифрования: ");
                    String scramText = reader.readLine();

                    System.out.print("Придумайте ключ шифрования (Числовое): ");
                    key = Long.parseLong(reader.readLine());

                    // передача ввода в класс scram и его дальнейшее шифрование
                    Scram scram = new Scram(scramText, key);
                    System.out.println(scram.scramming());
                    break;
                case (2):
                    System.out.print("Введите текст для расшифровки: ");
                    String descramText = reader.readLine();

                    System.out.print("Введите ключ шифрования: ");
                    key = Long.parseLong(reader.readLine());

                    Scram descram = new Scram(descramText, key);
                    System.out.println(descram.scramming());
                    break;
                default:
                    System.out.println("Такого варианта нет");
            }
            System.out.println("Хотите повторно воспользоваться программой? (y/n)");
            endInput = reader.readLine().toLowerCase();
        } while (endInput.equals("y"));
    }
}


