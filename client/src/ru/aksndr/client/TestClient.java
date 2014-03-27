package ru.aksndr.client;/**
 * Created with IntelliJ IDEA.
 * User: 1
 * Date: 27.03.14
 * Time: 0:34
 * To change this template use File | Settings | File Templates.
 */
public class TestClient {
  public static void main(String[] argv) {
      ru.aksndr.server.Greetings service = new ru.aksndr.server.Hello();
      //invoke business method
      String resp = service.sayHello("FU!");
      System.out.print(resp);
  }
}