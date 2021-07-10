/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalAPIs;

import static FunctionalAPIs.FunctionalAPIs.mapCountryWithCities;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Eslam
 */
public class Methods {
    
    
        
    
    public List<Integer> getCountryPopulation(List<Country> countries){
    
    List<Integer>li=new ArrayList<Integer>();
   
     for(Country c:countries){
        
         li.add(c.getPopulation());
    
    
    }
     
    return li;    
    
    
    }
    ;
    
    public double getAverage(List<Country> countries){
     List<Integer>li=new ArrayList<Integer>();
   
     li=getCountryPopulation(countries);
     
  return li.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
    
    public Integer getMax(List<Country> countries){
     List<Integer>li=new ArrayList<Integer>();
   
     li=getCountryPopulation(countries);
     
  return li.stream()
                .mapToInt(d -> d)
                .max()
                .orElse(0);  
    }
    
    
    public void getHighestPopulationCityForEachCountry(List<Country> countries,List<City> cities){
    
    
      Map<String, List<City>> mapping = FunctionalAPIs.mapCountryWithCities(countries,cities);
      
     mapping.forEach((k,v)->{
           
           List<String>li=new ArrayList<String>();
             v.forEach((vv)->{
                 li.add(vv.getName());
             });
             System.out.println("The highest population city of country "+k+"\t"+"is "+li.get(0));
         });
    
    
    
    }
    
    
     public static void maxPopulationCapital(List<Country> countries, List<City> cities) {
         
         //mapping population with each capital
        Map<Integer,City> capitalMap = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        
        // Map each country to its capital city (as Integer)
        countries.forEach(co -> {
            cities.forEach(ci->{
                if(ci.getId()==co.getCapital()){
                
                    capitalMap.put(ci.getPopulation(),ci);
                    li.add(ci.getPopulation());
                
                }
            });
        });
        
        int max =li.stream()
                 .mapToInt(d -> d)
                 .max()
                 .orElse(0);  
        
        String maxCapital = capitalMap.get(max).getName();
        
        String maxCountry = capitalMap.get(max).getCountryCode();
        
        
         System.out.println("The highest populatioc capital is ["+maxCapital+","+max+","+maxCountry+"]");
        
        
        
        
        
        
        
       
    }
    
    
    
    
    
    
    
    }
    

