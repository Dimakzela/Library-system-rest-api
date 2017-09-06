package za.co.dims.library.config;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;
import za.co.dims.library.controller.HealthController;

/**
 * Created by dims on 2017/08/29.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
        configureSwagger();
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

    private void configureSwagger() {
        register(ApiListingResource.class);
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/");
        beanConfig.setResourcePackage(HealthController.class.getPackage().getName());
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan(true);
    }

    private void registerEndpoints() {
        register(HealthController.class);
    }
}
