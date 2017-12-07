/**
 * @author raul aguilar
 */
package csci114_20171206code1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Csci114_20171206code1 {
  private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();

    // many of these calls can throw exceptions, so i've just
    // wrapped them all in one try/catch statement.
    try
    {
      // create a url object
    URL url = new URL(theUrl);

      // create a urlconnection object
    URLConnection urlConnection = url.openConnection();

      // wrap the urlconnection in a bufferedreader
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

    String line;

      // read from the urlconnection via the bufferedreader
    while ((line = bufferedReader.readLine()) != null) {
        content.append(line + "\n");
    }
        bufferedReader.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    return content.toString();
  }

    
    public static void main(String[] args) {
        String[] urls=new String[3];
        urls[0] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=AMEX&render=download";
        urls[1] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=NYSE&render=download";
        urls[2] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=NASDAQ&render=download";
        int counter = 1;
        String content = getUrlContents(urls[0]);
        String[] lines = content.split("\\R+");
        for(int i = 0; i < lines.length; i++) {
            System.out.printf("%3d%s%s%n", i, " | ", lines[i]);
        }
        System.out.println("====== 2nd ========");
        content = getUrlContents(urls[1]);
        lines = content.split("\\R+");
        for(int i = 0; i < lines.length; i++) {
            System.out.printf("%3d%s%s%n", i, " | ", lines[i]);
        }
        System.out.println("====== 3rd ========");
        content = getUrlContents(urls[2]);
        lines = content.split("\\R+");
        for(int i = 0; i < lines.length; i++) {
            System.out.printf("%4d%s%s%n", i, " | ", lines[i]);
            String[] fields = lines[i].split("\",");
            System.out.println(fields[0].replace("\"", ""));
        }

        /*
        for ( int i =0; i < urls.length; i++) { 
            String content1 = getUrlContents(urls[i]);
           
            String[] lines = content1.split("\\R+");
            
            for ( String line: lines ){
            System.out.println(counter + "==> " + line);
            counter++;
            }
            System.out.println("------------------------------------");
        } 
        */
    }
    
}
