package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        //NameComparator comparator = new NameComparator();
        //StateComparator comparator = new StateComparator();
        //PopulationComparator comparator = new PopulationComparator();
        AreaComparator comparator = new AreaComparator();

        cities.sort(comparator);

        //printCities(cities);
        //printStates(cities);
        //printPopulations(cities);
        printAreas(cities);

    }

    private static void printAreas(ArrayList<City> cities){
        System.out.println(City.getTableHeader());

        for(City area : cities) {
            System.out.println(area);
        }

    }

    private static void printPopulations(ArrayList<City> cities){
        System.out.println(City.getTableHeader());

        for(City population : cities) {
            System.out.println(population);
        }

    }

    private static void printStates(ArrayList<City> cities){
        System.out.println(City.getTableHeader());

        for(City state : cities) {
            System.out.println(state);
        }

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
