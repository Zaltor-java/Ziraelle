package Ziraelle;

public class Scram {
    String scram = "";
    private final String text;
    private final long key;

    public Scram(String text, long key) {
        this.text = text;
        this.key = key;
    }

    public String scramming() {
        /*
        Цикл, обрабатывающий каждый символ ввода и прогоняющий его через ключ путём исключающего ИЛИ (XOR),
        при первом прогоне сообщение шифруется, а при втором расшифровывается (Симметричное шифрование)
        
        A loop that processes each input character and runs it through the key with an XOR,
         on the first run, the message is encrypted, and on the second, it is decrypted (Symmetric encryption)
        */
        for (int i = 0; i < text.length(); i++) {
            scram += (char) (text.charAt(i) ^ key);
        }
        return scram;
    }
}
