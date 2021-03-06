package Ziraelle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Scrambler {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scram scram = new Scram();

        System.out.println("Добро пожаловать в программу \"Ziraelle\", Что вы хотите сделать?"); // Ziraelle - ласточка. swallow bird
        System.out.println("1.Зашифровать ");
        System.out.println("2.Расшифровать");
        // пользовательский ввод на дальнейшее поведение программы
        String inputChoise = reader.readLine();
        switch(inputChoise){
            case("1"):
                System.out.print("Введите текст для шифрования: ");
                // передача ввода в класс scram и его дальнейшее шифрование
                System.out.println(scram.scramming(reader.readLine()));
                break;
            case("2"):
                System.out.print("Введите текст для расшифровки: ");
                // передача ввода в класс scram и его дальнейшее шифрование
                System.out.println(scram.scramming(reader.readLine()));
                break;
            default:
                System.out.println("Такого варианта нет");
        }
    }
}

