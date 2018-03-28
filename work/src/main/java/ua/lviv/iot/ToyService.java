package ua.lviv.iot;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/toys")
public class ToyService {
    private Map<Integer, Toy> toys = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Toy getToy(@PathParam("id") Integer id) {
        return toys.get(id);
    }

    @PUT
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createToy(@PathParam("id") Integer id, Toy toy) {
        toys.put(id, toy);
    }

    @POST
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public void creteToy(@PathParam("id") Integer id, Toy toy) {
        toys.replace(id, toy);
    }

    @DELETE
    @Path("{id}/")
    public void deleteToy(@PathParam("id") Integer position) {
        toys.remove(position);
    }
}
