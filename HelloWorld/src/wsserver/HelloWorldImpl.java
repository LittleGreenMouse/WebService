package wsserver;

import javax.jws.WebService;

// Service Implementation
@WebService(endpointInterface = "wsserver.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorld(String name) {
        return "Hello world to " + name + "!";
    }
}
