package ro.claudiu.projects.curs2.countries.composition;

import ro.claudiu.projects.curs2.countries.Country;

import java.util.List;

public class InMemoryCountryProvider implements CountryProvider{

    @Override
    public List<Country> readCountries(){
        return List.of(
                new Country("Romania", "Bucharest"),
                new Country("Hungary", "Budapest"),
                new Country("Moldavia", "Chisinau"),
                new Country("UK", "London")
        );
    }
}
