
package employeemanager.models;

public enum Country {

    Moldova("Rep. Moldova"),
    USA("USA"),
    Russia("Russia Fed.");

    private String country;

    private Country(String country) {
        this.country = country;
    }
    
    public String getName(){
        return this.country;
    }
    
    @Override
    public String toString() {
        return country;
    }

    public static Country getByCountryName(String countryName) {
        for (Country countr : Country.values()) {
            if (countr.country.equals(countryName)) {
                return countr;
            }
        }
        throw new IllegalArgumentException("Country does exist in the enum."); // эта оишбка больше для нас прогрмеров. 
        // после прохождения всего цикла если у нас есть enum который не подходит 
    }
}
