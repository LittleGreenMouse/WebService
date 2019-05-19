# WebService
Web service practice

---

## HelloWorld
Develop a web service and call it in a client
### How to run?
#### Server side
- Place ```HelloWorld/src/wsserver``` in server side
- Use javac to compile them
  ``` shell
  javac wsserve\*.java
  ```
- Run it
  ``` shell
  java wsserver.HelloWorldPublisher
  ```
#### Client side
- Place ```HelloWorld/src/wsclient``` in client side
- Get service's wsdl and compile it to java class file
  ``` shell
  wsimport -p wsproxy http://localhost:9999/ws/hello?wsdl
  ```
  Note: 
  - Please change localhost:9999 to ip:port of your current server ip and port.
  - -p wsproxy means collect them in packet wsproxy
  - If you want to see the java code, you can add -keep option
    ``` shell
    wsimport -keep -p wsproxy http://localhost:9999/ws/hello?wsdl
    ```
- Compile wsclient
  ``` shell
  javac wsclient\*.java
  ```
- Run it
  ``` shell
  java wsclient.HelloWorldClient
  ```