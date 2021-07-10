/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalAPIs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Eslam
 */
public class FunctionalAPIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         CityImp CI = new CityImp();
         CountryImp COI = new CountryImp();
        
        List<Country> countries = COI.readFromCsv("src/main/resources/data/countries.csv");
 
        List<City> cities = CI.readFromCsv("src/main/resources/data/cities.csv");
      
     // declare a map of string and a list of object city  
      Map<String, List<City>> mapping = mapCountryWithCities(countries,cities);
      
     
      
      // get the name of the cities from objects then put it in a list and print the mapping
       mapping.forEach((k,v)->{
           
           List<String>li=new ArrayList<String>();
             v.forEach((vv)->{
                 li.add(vv.getName());
             });
             System.out.println("key= "+k+"\t"+"value= "+li);
         });
        System.out.println("----------------------------------------------------------------------------\n");
       Methods m = new Methods();
        System.out.println("the countries population is \n"+m.getCountryPopulation(countries));
        System.out.println("----------------------------------------------------------------------------\n");
        System.out.println("the average population is \n"+m.getAverage(countries));
        System.out.println("----------------------------------------------------------------------------\n");
        System.out.println("the max population is \n"+m.getMax(countries));
        System.out.println("----------------------------------------------------------------------------\n");
        m.getHighestPopulationCityForEachCountry(countries, cities);
        System.out.println("----------------------------------------------------------------------------\n");
        m.maxPopulationCapital(countries, cities);
        
        
    
       
      
    }
    
    
    public static Map<String,List<City>> mapCountryWithCities(List<Country> countries,List<City> cities){
    
        Map<String, List<City>> mapping = new HashMap<>();
    
          // make an emty list of city objects
          countries.forEach(co->{
          List<City>li=new ArrayList<City>();
          mapping.put(co.getCode(),li);
             
         });
      // add cities objects in the list for each country code
         countries.forEach(co->{
         cities.forEach(ci->{
            if(co.getCode() == null ? ci.getCountryCode() == null : co.getCode().equals(ci.getCountryCode())){
             List<City> li =mapping.get(co.getCode());
             // add all the cities tha has the same country code
             li.add(ci);
             // sort them by population
             li.sort(Comparator.comparingInt(City::getPopulation).reversed());
             // replace the empty list with the new sorted one
             mapping.replace(co.getCode(),li);
            }
         });         
             
         });
    
       
        
        
        
        return mapping;
    
    
    
    
    }
    
    
    
}
