package Ziraelle;
public class Scram {
    String scram="";
    //ключ шифрования
    // encrypt key
    final long key = 9982917478858578L;
    public String scramming(String text) {
        /*
        Цикл, обрабатывающий каждый символ ввода и прогоняющий его через ключ путём исключающего НЕ,
        при первом прогоне сообщение шифруется, а при втором расшифровывается (Симметричное шифрование)
        
        A loop that processes each input character and runs it through the key with an exclusive NOT,
         on the first run, the message is encrypted, and on the second, it is decrypted (Symmetric encryption)
        */
        for (int i = 0; i < text.length(); i++) {
            scram += (char) (text.charAt(i) ^ key);
        }
        return scram;
    }
}
