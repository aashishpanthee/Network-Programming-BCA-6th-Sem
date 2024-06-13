package unit2;

import java.net.*;
import java.util.*;

public class NetworkInterfaceExample {
  public static void main(String[] args) {
    try {

      Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces(); // Get all network
                                                                                                 // interfaces
      while (networkInterfaces.hasMoreElements()) { // Iterate through all network interfaces
        NetworkInterface networkInterface = networkInterfaces.nextElement(); // Get the next network interface
        int index = networkInterface.getIndex(); // Get the index of the network interface
        System.out.println("Interface Name: " + networkInterface.getName());
        System.out.println("Interface Display Name: " + networkInterface.getDisplayName());
        System.out.println("Interface Index: " + index);
        System.out.println("Parent interface if it has  " + networkInterface.getParent()); // Get the parent interface
        // ---------------------------------------------------------------------------------------------------------
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses(); // Get all the IP addresses
        System.out.println("IP addresses of the network Interfaces " + inetAddresses);
      }
      // ---------------------------------------------------------------------------------------------------------

      // ---------------------------------------------------------------------------------------------------------
      NetworkInterface indexs = NetworkInterface.getByIndex(3); // Get the network interface by index
      System.out.println("Name of the interface" + indexs);

      // ---------------------------------------------------------------------------------------------------------

      System.out
          .println("Network interface " + NetworkInterface.getByName("wireless_32768"));

      // ------------------------------------------------------------------------------------------------

      InetAddress localHost = InetAddress.getLocalHost(); // Get the local host address
      NetworkInterface networkInterfaceees = NetworkInterface.getByInetAddress(localHost);
      if (networkInterfaceees != null) {
        System.out.println("Found network interface with address " + localHost);
        System.out.println("Interface Name: " + networkInterfaceees.getName());
        System.out.println("Interface Display Name: " + networkInterfaceees.getDisplayName());
        System.out.println("Interface Index: " + networkInterfaceees.getIndex());
      } else {
        System.out.println("No network interface found with address " + localHost);

      }
      // ---------------------------------------------------------------------------------------------------------
    } catch (SocketException | UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
