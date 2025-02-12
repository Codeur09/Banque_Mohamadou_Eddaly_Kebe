package fr.epita.assistants;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import io.smallrye.reactive.messaging.annotations.Broadcast;
import fr.epita.assistants.utils.StringInfo;

@ApplicationScoped
public class StringInfoProcessor {

    @Incoming("string-info-command")
    @Outgoing("string-info-aggregate")
    @Broadcast
    public StringInfo process(String input) {
        String text = (input == null) ? "" : input;
        int nbVowels = countVowels(text);
        int nbConsonants = countConsonants(text);
        boolean isPal = isPalindrome(text);
        System.out.println("Envoi de l'agrégat...");
        return new StringInfo(text, nbVowels, nbConsonants, isPal);
    }

    private int countVowels(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if ("aeiouyAEIOUY".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    private int countConsonants(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c) && "aeiouyAEIOUY".indexOf(c) < 0) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}
