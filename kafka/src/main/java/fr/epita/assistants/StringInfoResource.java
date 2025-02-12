package fr.epita.assistants;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import io.smallrye.reactive.messaging.annotations.Broadcast;

@Path("/send")
public class StringInfoResource {

    @Inject
    @Channel("string-info-command")
    @Broadcast
    Emitter<String> emitter;

    @POST
    public Response send(String input) {
        String message = (input == null) ? "" : input;
        System.out.println("Envoi de la commande : " + message);
        emitter.send(message);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
