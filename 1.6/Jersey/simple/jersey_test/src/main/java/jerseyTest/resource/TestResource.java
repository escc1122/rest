package jerseyTest.resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/")
public class TestResource {
  @GET
  @Path("/{name}")
  public Response sayHello(@PathParam("name") String name) {
    String output = "Hello, " + name + "!";
    return Response.status(200).entity(output).build();
  }

  @GET
  @Path("/{id:SC\\d+}/")
  public Response scTest(@PathParam("id") String id) {
    String output = "scTest, " + id + "!";
    return Response.status(200).entity(output).build();
  }

  @GET
  @Path("/")
  public Response scTest(@Context HttpServletRequest req) {
    String output = req.getParameter("aaaa");
    return Response.status(200).entity(output).build();
  }

}
