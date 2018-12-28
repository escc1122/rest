package jerseyTest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by alma on 2018/12/28.
 */
public class JerseyResourceConfig extends ResourceConfig {
  public JerseyResourceConfig(){
    System.out.println("aaaaaaabbbcccc");
    packages("jerseyTest");
  }
}
