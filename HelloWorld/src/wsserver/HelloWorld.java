package wsserver;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// Service Endpoint Interface
@WebService(targetNamespace = "http://localhost:9999/ws/hello")
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {

    /**
     * Say hello world to name
     * @param name name
     * @return String: "Hello world to " + name
     */
    @WebMethod
    public String getHelloWorld(String name);

}
