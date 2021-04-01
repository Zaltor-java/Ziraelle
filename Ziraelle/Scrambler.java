package Ziraelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scrambler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scram scram = new Scram();
        long key;
        System.out.println("Добро пожаловать в программу \"Ziraelle\", Что вы хотите сделать?"); // Ziraelle - ласточка. swallow bird
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
                System.out.println(scram.scramming(scramText, key));
                break;
            case (2):
                System.out.print("Введите текст для расшифровки: ");
                String descramText = reader.readLine();

                System.out.print("Введите ключ шифрования: ");
                key = Long.parseLong(reader.readLine());
                
                System.out.println(scram.scramming(descramText, key));
                break;
            default:
                System.out.println("Такого варианта нет");
        }
    }
}


