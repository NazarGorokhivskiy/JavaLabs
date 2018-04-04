package ua.lviv.iot;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/toys")
public class ToyService {

    private static Map<Integer, Hoop> toys = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hoop getToy(@PathParam("id") Integer id) {
        return toys.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createToy(Hoop toy) {
        toys.put(toy.getId(), toy);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceToy(@PathParam("id") Integer id, Hoop toy) {
        toys.replace(id, toy);
    }

    @DELETE
    @Path("/{id}")
    public void deleteToy(@PathParam("id") Integer position) {
        toys.remove(position);
    }
}
