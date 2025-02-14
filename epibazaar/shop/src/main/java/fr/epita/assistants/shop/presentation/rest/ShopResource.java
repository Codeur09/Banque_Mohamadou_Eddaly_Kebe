package fr.epita.assistants.shop.presentation.rest;

import fr.epita.assistants.common.api.request.ItemRequest;
import fr.epita.assistants.common.api.response.ItemResponse;
import fr.epita.assistants.common.command.*;
import fr.epita.assistants.common.utils.ErrorInfo;
import fr.epita.assistants.shop.domain.service.ShopService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/shop")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ShopResource {

    @Inject
    ShopService shopService;

    @POST
    @Path("/start")
    public Response startShop() {
        try {
            shopService.startShop();
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    public Response getShop(@PathParam("id") Long id) {
        return Response.ok(shopService.getShop(id)).build();
    }

    @GET
    @Path("/all")
    public Response getAllShops() {
        return Response.ok(shopService.getAllShops()).build();
    }

    @GET
    @Path("/resources")
    public Response getResources() {
        return Response.ok(shopService.getResources()).build();
    }

    @GET
    @Path("/shop-price")
    public Response getShopPrice() {
        return Response.ok(shopService.getShopPrice()).build();
    }

    @POST
    @Path("/create")
    public Response createShop() {
        try {
            shopService.createShop();
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }

    @POST
    @Path("/sell")
    public Response sellItems(SellItemCommand sellItemCommand) {
        try {
            shopService.sellItems(sellItemCommand);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }

    @POST
    @Path("/upgrade-price/{id}")
    public Response upgradeShopPrice(@PathParam("id") Long id) {
        try {
            shopService.upgradeShopPrice(id);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorInfo(e.getMessage()))
                    .build();
        }
    }
}