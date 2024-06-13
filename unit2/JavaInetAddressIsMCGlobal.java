package unit2;

import java.net.InetAddress;

public class JavaInetAddressIsMCGlobal {
  public static void main(String[] args) throws Exception {
    InetAddress addr = InetAddress.getByName("www.javatpoint.com");
    System.out.println("Name is : " + addr.getHostName());
    System.out.println("Address is : " + addr.getHostAddress());
    System.out.println(addr.isMCGlobal());
  }
}

// isMCGlobal();
/**
 * It returns true if this
 * address has
 * a multicast
 * address of
 * global scope
 * and returns false if
 * address is
 * not of
 * global scope
 * or it
 * is not
 * a multicast address
 **/
