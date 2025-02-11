package fr.epita.assistants.presentation.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import fr.epita.assistants.presentation.rest.request.ReverseRequest;
import fr.epita.assistants.presentation.rest.response.HelloResponse;
import fr.epita.assistants.presentation.rest.response.ReverseResponse;

@Path("/")
public class Endpoints {

    @GET
    @Path("hello/{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response greetUser(@PathParam("user") String user) {
        HelloResponse response = new HelloResponse();
        response.setContent("hello " + user);
        return Response.status(200).entity(response).build();
    }

    @POST
    @Path("reverse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response reverseString(ReverseRequest req) {
        String originalText = req.getContent();
        String reversedText = new StringBuilder(originalText).reverse().toString();
        ReverseResponse response = new ReverseResponse();
        response.setOriginal(originalText);
        response.setReversed(reversedText);
        return Response.status(200).entity(response).build();
    }
}

