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
public class Country {
    
     private String code ;
    private String name ;
    private String continent ;
    private double surfaceArea;
    private int population ;
    private double gnp;
    private int capital ;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public double getGnp() {
        return gnp;
    }

    public int getCapital() {
        return capital;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
    

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
    
}
