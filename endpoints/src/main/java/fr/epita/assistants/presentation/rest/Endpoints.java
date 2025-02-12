package fr.epita.assistants.presentation.rest;

import fr.epita.assistants.presentation.rest.request.ReverseRequest;
import fr.epita.assistants.presentation.rest.response.HelloResponse;
import fr.epita.assistants.presentation.rest.response.ReverseResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class Endpoints {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello/{name}")
    public Response hello(@PathParam("name") String name) {
        System.out.println("Processing hello request for: " + name);
        HelloResponse helloResponse = new HelloResponse("hello " + name);
        return Response.ok(helloResponse).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/reverse")
    public Response reverse(ReverseRequest request) {
        if (request.getContent().isEmpty() || request.getContent() == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le contenu de la requête ne doit pas être vide.")
                    .build();
        }
        String original = request.getContent();
        System.out.println("Processing reverse request with content: " + original);
        String reversed = new StringBuilder(original).reverse().toString();
        ReverseResponse reverseResponse = new ReverseResponse(original, reversed);
        return Response.ok(reverseResponse).build();
    }
}
