/**
 * @author raul aguilar
 */
package csci114_20171206code2;
import java.util.HashMap;

class Company {
    String Symbol;
    String Name;
    Double MarketCap;
    public Company(String s, String n, Double mc){
        Symbol = s;
        Name = n;
        MarketCap = mc;
    }
}

public class Csci114_20171206code2 {

    public static void main(String[] args) {
        HashMap<String,Company> companies= new HashMap<String,Company>();
        Company company1=new Company("GOOG", "Alphabet Inc.", 689.234);
        
        companies.put(company1.Symbol, company1);
    }
}