package employeemanager.models;

public enum City {

    Chisinau("Chisinau"),
    Balti("Balti"),
    Benderi("Benderi"),
    Cahul("Cahul"),
    Orhei("Orhei"),
    Tiraspol("Tiraspol");

    private String city;

    private City(String city) {
        this.city = city;
    }
    
    public String getName(){
        return this.city;
    }

    public static City getByCityOnName(String cityName) {
        for (City cit : City.values()) {
            if (cit.city.equals(cityName)) {
                return cit;
            }
        }
        throw new IllegalArgumentException("City does exist in the enum."); // эта оишбка больше для нас прогрмеров. 
        // после прохождения всего цикла если у нас есть enum который не подходит 
    }

}
