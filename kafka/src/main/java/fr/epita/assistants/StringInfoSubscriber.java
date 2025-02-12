package fr.epita.assistants;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import fr.epita.assistants.utils.StringInfo;

@ApplicationScoped
public class StringInfoSubscriber {

    @Incoming("string-info-aggregate")
    public void consume(StringInfo info) {
        if (info != null) {
            System.out.println(info.toString());
        }
    }
}
