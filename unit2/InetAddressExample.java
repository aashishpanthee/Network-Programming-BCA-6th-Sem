package unit2;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.net.InetAddress;

public class InetAddressExample {
  public static void main(String[] args) {
    try {
      // *************************** These are static methods
      InetAddress ipAddress = InetAddress.getByName("www.tu.edu.np"); // determines the ip address of a host based on
                                                                      // the host name.
      System.out.println("Ip Address of this domain " + ipAddress);
      // ----------------------------------------------------------------------------------------
      byte[] rawIpAddress = new byte[] { 127, 0, 0, 1 };
      InetAddress InetAddresss = InetAddress.getByAddress(rawIpAddress); // given the raw ip address, returns the
      // InetAddress object.
      System.out.println(Arrays.toString(InetAddresss.getAddress()));
      System.out.println(InetAddresss);
      // -----------------------------------------------------------------------------------------------
      byte[] rawIpAddres = new byte[] { 127, 0, 0, 1 };
      InetAddress createdInetAddress = InetAddress.getByAddress("localhost ", rawIpAddres); // creates an InetAddress
                                                                                            // object based on the raw
                                                                                            // ip address.
      System.out.println(createdInetAddress);
      // -----------------------------------------------------------------------------------------------
      InetAddress address3[] = InetAddress.getAllByName("www.google.com"); // given the name of a host, returns an array
                                                                           // of it's Ip addresses, based on the
                                                                           // configured name service on the system.
      System.out.println("Array of it's ipAddress  " + address3);
      for (int i = 0; i < address3.length; i++) {
        try {
          System.out.println(address3[i]);
        } catch (Exception e) {
          System.out.println("No more ip address found");
        }
      }
      // -----------------------------------------------------------------------------
      InetAddress localhostAddress = InetAddress.getLocalHost();
      System.out.println("Local Host Address is  " + localhostAddress); // returns the InetAddress object that
      // -------------------------------------------------------------------------------
      InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
      System.out.println("Loopback Address is  " + loopbackAddress); // returns the InetAddress object that represents
                                                                     // the loopback address.
      // -------------------------------------------------------------------------------
      // *************************** These are Object methods
      InetAddress addr = InetAddress.getByName("163.70.143.35");
      String canonicalHostName = addr.getCanonicalHostName(); // returns the canonical host name of the InetAddress
                                                              // object.
      System.out.println("Canonical hostname is  " + canonicalHostName);
      // -------------------------------------------------------------------------------
      InetAddress addr1 = InetAddress.getLocalHost();
      String hostName = addr1.getHostName();
      System.out.println(hostName); // returns the host name of the InetAddress object.
      // -------------------------------------------------------------------------------
      InetAddress addr2 = InetAddress.getLocalHost();
      String hostAddress = addr2.getHostAddress();
      System.out.println(hostAddress); // returns the host address of the InetAddress object.
      // -------------------------------------------------------------------------------
    } catch (UnknownHostException e) {
      System.out.println("Could not find");
    }
  }
}
