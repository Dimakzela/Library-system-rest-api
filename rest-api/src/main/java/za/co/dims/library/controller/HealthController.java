package za.co.dims.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by dims on 2017/08/29.
 */
@Component
@Path("/health")
@Api(value = "Health controller", tags = {"Health resource"})
public class HealthController {
    @GET
    @Produces("application/json")
    @ApiOperation(value = "check health", response = Health.class)
    public Response health() {
        Health health = Health.status("Jersey: Up and Running!").build();
        return Response.status(200).entity(health).build();
    }
}
