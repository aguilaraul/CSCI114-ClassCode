/**
 * @author raul aguilar
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Scanner;

class Company {
    String symbol;
    String name;
    double lastSale;
    Double marketCap;
    String adr;
    String ipo;
    String sector;
    String industry;
    String summary;
    
    public Company() {
        this.symbol = null;
        this.name = null;
        this.lastSale = 0.0;
        this.marketCap = 0.0;
        this.adr = "n/a";
        this.ipo = "n/a";
        this.sector = "n/a";
        this.industry = "n/a";
        this.summary = null;
    }
    public Company(String s) {
        this.symbol = s;
    }
    public Company(String s, String n, double ls, double mc, String adr,
            String ipo, String sec, String ind, String sum){
        this.symbol = s;
        this.name = n;
        this.lastSale = ls;
        this.marketCap = mc;
        this.adr = adr;
        this.ipo = ipo;
        this.sector = sec;
        this.industry = ind;
        this.summary = sum;
    }
}

public class FindStockCompany {
	
    private static String getUrlContents(String theUrl) {
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

    
    public static void main(String[] args) throws Exception {
        String[] urls=new String[3];
        urls[0] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=AMEX&render=download";
        urls[1] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=NYSE&render=download";
        urls[2] = "http://www.nasdaq.com/screening/companies-by-industry.aspx?exchange=NASDAQ&render=download";
        int counter = 0;       
        Scanner scan = new Scanner(System.in);

	URL url1 = new URL(urls[0]);
	BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));

	String inputLine;
	while( (inputLine = in.readLine()) != null) {
		System.out.println(inputLine);
		counter++;
	}
	System.out.println(counter);
	in.close();


        String content = getUrlContents(urls[0]);
        String[] lines = content.split("\\R+");
        HashMap<String,Company> companies = new HashMap<String,Company>();
        for(int i = 1; i < lines.length; i++) {
            String[] fields = lines[i].split("\",");
            for(int j = 0; j < fields.length; j++) {
                fields[j] = fields[j].replace("\"", "");
                System.out.println( i + " " + fields[j]);
            }
	    Company c = new Company(fields[0], fields[1],
			    Double.parseDouble(fields[2]), Double.parseDouble(fields[3]),
			    fields[4], fields[5], fields[6], fields[7], fields[8]);
	    System.out.println(c.lastSale);
            counter++;
        }
        System.out.println(counter);

        System.out.println(companies);
        System.out.println(lines[0]);
        System.out.println(lines[counter-1]);
        
        System.out.println("Please Enter a Stock Symbol to Search (Enter 0 to exit): ");
        String input = scan.nextLine();
        while(input.equalsIgnoreCase("0") != true ) {
            System.out.println("Made it in");
            input = scan.nextLine();
        }
        
//      for (String url : urls) {
//          String content1 = getUrlContents(url);
//          String[] lines2 = content1.split("\\R+");
//         for ( String line: lines2 ){
//          System.out.println(counter + " ==> " + line);
//            String[] fields = line.split("\",");
//            System.out.println(fields[0].replace("\"", ""));
//            System.out.println(fields[1].replace("\"", ""));
//              counter++;
//          }
//          System.out.println("------------------------------------");
//      }
        
    } 
}
