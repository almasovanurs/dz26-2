import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<City> cities = new TreeSet<>();
        City city1 = new City(11, "New York");
        City city2 = new City(21, "Rim");
        City city3 = new City(15, "Kioto");
        City city4 = new City(29, "Stambul");
        addCityEvenCode(cities,city1);
        addCityEvenCode(cities,city2);
        addCityEvenCode(cities,city3);
        addCityEvenCode(cities,city4);
        System.out.println(cities);

    }
    public  static  void addCityEvenCode(Set<City> cities, City city){
        if (city.getCode() % 2 ==1){
            cities.add(city);
        }
    }
}