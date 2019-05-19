package wsserver;

import javax.xml.ws.Endpoint;

// Endpoint publisher
public class HelloWorldPublisher {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorldImpl();
        Endpoint.publish("http://localhost:9999/ws/hello", hello);
        System.out.println("Web service is online.");
    }

}
