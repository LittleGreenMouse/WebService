package wsclient;

import wsproxy.HelloWorld;
import wsproxy.HelloWorldImplService;

public class HelloWorldClient {

    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld pService = service.getHelloWorldImplPort();

        System.out.println(pService.getHelloWorld("Little Mouse"));
    }

}
