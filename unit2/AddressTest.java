package unit2;

import java.net.InetAddress;
import java.net.UnknownHostException;

//Program to determine whether the given Ip Address is IPv4 or IPv6.

public class AddressTest {
  public static void main(String[] args) {
    try {
      // InetAddress address = InetAddress.getByName("127.0.0.1");
      InetAddress address = InetAddress.getByName("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
      int type = getVersion(address);
      System.out.println("Type of IpAddress is  " + type);
    } catch (UnknownHostException e) {
      System.out.println(e.getMessage());
    }
  }

  public static int getVersion(InetAddress ia) {
    byte[] address = ia.getAddress();
    if (address.length == 4) {
      return 4;
    } else if (address.length == 16) {
      return 6;
    } else {
      return -1;
    }
  }
}
