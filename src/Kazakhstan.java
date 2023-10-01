public class Kazakhstan {
    private final int population ;
    private final String location;
    private final String capital ;
    private static Kazakhstan instance;

    private Kazakhstan(String location, String capital, int population) {
        this.location = location;
        this.capital = capital;
        this.population = population;
    }

    public static Kazakhstan getInstance(String location, String capital, int population) {
        if (instance == null) {
            instance = new Kazakhstan(location, capital, population);
        }
        return instance;
    }

    public static Kazakhstan getInstance(){
        return instance;
    }
    public void getInfo(){
        System.out.println(capital + ", location: " + location  + ", population: " + population);
    }
}