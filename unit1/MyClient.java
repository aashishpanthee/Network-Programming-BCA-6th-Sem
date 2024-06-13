import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
  public static void main(String[] args) {
    try{
      Socket s = new Socket("localhost",6666);
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      dout.writeUTF("Hello Server");
      DataInputStream dis = new DataInputStream(s.getInputStream());
      String str = (String)dis.readUTF();
      System.out.println("message = "+str);
      dout.flush();
      dout.close();
      s.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
