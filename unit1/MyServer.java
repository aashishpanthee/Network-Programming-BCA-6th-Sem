import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


// first you have to run server and the client program in different shell.

public class MyServer {
  public static void main(String[] args) {
    try{
      ServerSocket ss = new ServerSocket(6666);
      Socket s = ss.accept();
      DataInputStream dis = new DataInputStream(s.getInputStream());  // to read data from client
      String str = (String)dis.readUTF(); 
      System.out.println("message =  "+str);
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());  // to send data to client
      dout.writeUTF("Hello Client");
      dout.flush(); // flush the stream
      dout.close(); // close the stream
      ss.close(); // close the server socket
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
