package Collections;
import java.util.HashMap;
import java.util.Map;

public class Country {

    private Map<String, String> countryMap;

    // Getter
    public Map<String, String> getCountryMap() {
        return countryMap;
    }

    // Setter
    public void setCountryMap(Map<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    // Constructor (important to initialize HashMap)
    public Country() {
        countryMap = new HashMap<>();
    }

    // Add country and capital
    public void add(String cname, String capname) {
        countryMap.put(cname.toLowerCase(), capname);
    }

    // Search capital
    public String search(String cname) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        }

        String result = countryMap.get(cname.toLowerCase());

        if (result == null) {
            return "Data not found";
        }

        return result;
    }
}