package Ziraelle;

public class Scram {
    String scram="";

    public String scramming(String text, long key) {
      /* A loop that processes each input character and runs it through the key with an XOR,
         on the first run, the message is encrypted, and on the second, it is decrypted (Symmetric encryption) */
        for (int i = 0; i < text.length(); i++) {
            scram += (char)(text.charAt(i) ^ key);
        }
        return scram;
    }
}
