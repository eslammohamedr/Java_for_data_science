/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalAPIs;

/**
 *
 * @author Eslam
 */
public class City {
    
    private int id ;
    private String name ;
    private int population ;
    private String countryCode;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    
}
