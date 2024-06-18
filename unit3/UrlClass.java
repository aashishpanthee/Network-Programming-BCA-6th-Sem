package unit3;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlClass {
  public static void main(String[] args) {
    try {
      URL url = new URL("http://www.google.com/resource/hello.html");
      System.out.println(url);
      System.out.println("Protocol : " + url.getProtocol());
      System.out.println("Port : " + url.getPort());
      System.out.println("Host : " + url.getHost());
      System.out.println("File : " + url.getFile());
      System.out.println("Path : " + url.getPath());
      System.out.println("Authority : " + url.getAuthority());
    } catch (MalformedURLException e) {
      System.out.println(e);
    }
  }
}