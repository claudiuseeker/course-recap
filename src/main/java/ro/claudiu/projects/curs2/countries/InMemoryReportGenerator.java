package ro.claudiu.projects.curs2.countries;

import java.util.List;

public class InMemoryReportGenerator extends CountryReportGenerator{

    @Override
    List<Country> readCountries(){
        return List.of(
                new Country("Romania", "Bucharest"),
                new Country("Hungary", "Budapest"),
                new Country("Moldavia", "Chisinau"),
                new Country("UK", "London")
        );
    }
}
