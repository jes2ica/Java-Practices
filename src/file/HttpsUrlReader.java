package file;
import java.io.*;
import java.net.URL;

public class HttpsUrlReader {
   public static void main(String[] args) {
      String sURL = args[0];
      try {
         URL oURL = new URL(sURL);
         BufferedReader in = new BufferedReader(new InputStreamReader(oURL.openStream()));
         String line;
         while ((line = in.readLine()) != null) 
            System.out.println(line);
         in.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}