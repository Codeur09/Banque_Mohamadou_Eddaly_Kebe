package fr.epita.assistants.presentation.rest;

import fr.epita.assistants.presentation.rest.request.ReverseRequest;
import fr.epita.assistants.presentation.rest.response.HelloResponse;
import fr.epita.assistants.presentation.rest.response.ReverseResponse;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class Endpoints {

    @GET
    @Path("hello/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response greet(@PathParam("username") String username) {
        if (username == null || username.trim().isEmpty()) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        HelloResponse helloResp = new HelloResponse("hello " + username);
        return Response.status(Response.Status.OK).entity(helloResp).build();
    }

    @POST
    @Path("reverse")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response invert(ReverseRequest req) {
        if (req == null || req.getContent() == null || req.getContent().trim().isEmpty()) {
            throw new BadRequestException("Le contenu de la requête ne doit pas être vide.");
        }
        String original = req.getContent();
        String reversed = new StringBuilder(original).reverse().toString();
        ReverseResponse resp = new ReverseResponse(original, reversed);
        return Response.status(Response.Status.OK).entity(resp).build();
    }
}

