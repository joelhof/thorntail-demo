package se.hof.thorntail.demo;

import se.hof.thorntail.demo.service.SalutationsService;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

    SalutationsService greetingsService = new SalutationsService();

    @GET
    @Produces("text/plain")
    public String hello() {
        return greetingsService.getHello();
    }

    @GET
    @Produces("application/json")
    public String helloJson() {
        return "{ \"greeting\": \"Hello!\" }";
    }
}
