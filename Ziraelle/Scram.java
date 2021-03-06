package Ziraelle;
public class Scram {
    String scram="";
    //ключ шифрования
    final long key = 9982917478858578L;
    public String scramming(String text) {
        // Цикл, обрабатывающий каждый символ ввода и прогоняющий его через ключ путём исключающего НЕ,
        // при первом прогоне сообщение шифруется, а при втором расшифровывается (Симметричное шифрование)
        for (int i = 0; i < text.length(); i++) {
            scram += (char) (text.charAt(i) ^ key);
        }
        return scram;
    }
}
