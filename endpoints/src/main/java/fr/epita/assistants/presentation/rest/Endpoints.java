package fr.epita.assistants.presentation.rest;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.BadRequestException;
import fr.epita.assistants.presentation.request.ReverseRequest;
import fr.epita.assistants.presentation.response.ReverseResponse;

@Path("/")
public class Endpoints {

    @POST
    @Path("/reverse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ReverseResponse reverse(ReverseRequest request) {
        if (request == null || request.getContent() == null) {
            throw new BadRequestException("Le contenu est manquant");
        }
        String original = request.getContent();
        String reversed = new StringBuilder(original).reverse().toString();
        return new ReverseResponse(original, reversed);
    }
}
