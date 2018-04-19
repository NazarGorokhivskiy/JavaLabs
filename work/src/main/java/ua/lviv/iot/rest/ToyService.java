package ua.lviv.iot.rest;

import ua.lviv.iot.Toy;
import ua.lviv.iot.persistence.dao.ToyDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/server")
@SessionScoped
public class ToyService implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private ToyDao dao;

    private static Map<Integer, Toy> toys = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Toy getToy(@PathParam("id") Integer id) {
        //return toys.get(id);
        return dao.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Toy createToy(Toy toy) {
        //toys.put(toy.getId(), toy);
        dao.persist(toy);
        return toy;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response replaceToy(Toy toy) {
        //toys.replace(toy.getId(), toy);
        dao.update(toy);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void deleteToy(@PathParam("id") Integer position) {
        //toys.remove(position);
        dao.remove(position);
    }
}
