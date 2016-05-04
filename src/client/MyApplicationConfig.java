package client;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("client")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("final1");
    }
}
