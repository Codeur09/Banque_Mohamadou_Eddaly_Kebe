package fr.epita.assistants.item_producer.presentation.rest;

import fr.epita.assistants.common.api.request.ItemRequest;
import fr.epita.assistants.common.api.response.ItemResponse;
import fr.epita.assistants.common.command.*;
import fr.epita.assistants.common.utils.Direction;
import fr.epita.assistants.common.utils.ErrorInfo;
import fr.epita.assistants.item_producer.domain.service.ItemProducerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/item-producer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemProducerResource {

    @Inject
    ItemProducerService itemProducerService;

    @POST
    @Path("/start")
    public Response startGame(@QueryParam("mapPath") String mapPath) {
        try {
            itemProducerService.startGame(mapPath);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }

    @GET
    @Path("/resources")
    public Response getResources() {
        return Response.ok(itemProducerService.getResources()).build();
    }

    @GET
    @Path("/player")
    public Response getPlayer() {
        return Response.ok(itemProducerService.getPlayer()).build();
    }

    @GET
    @Path("/upgrades")
    public Response getUpgrades() {
        return Response.ok(itemProducerService.getUpgrades()).build();
    }

    @POST
    @Path("/move")
    public Response move(@QueryParam("direction") Direction direction) {
        try {
            return Response.ok(itemProducerService.move(direction)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }

}